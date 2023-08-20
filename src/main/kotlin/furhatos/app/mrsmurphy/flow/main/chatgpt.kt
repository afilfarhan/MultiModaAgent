package furhatos.app.mrsmurphy.flow.main


import com.theokanning.openai.service.OpenAiService
import com.theokanning.openai.completion.CompletionRequest
import furhatos.flow.kotlin.*
import java.io.File

// create custom data type to match the requirements
data class Rvalue(val stringValue: String, val stringArray: Array<String>)

// secret key provided by LLM provider
//this is required to access the model
val serviceKey = ""

var gesturelog=""

//Extracting history of conversation
fun getNLGResponseFromGPT(histval: Int = 6): Rvalue {

    //initiating API to communicate the large language model
    val service = OpenAiService(serviceKey)
    val history = Furhat.dialogHistory.all.takeLast(histval).mapNotNull {
        when (it) {
            is DialogHistory.ResponseItem -> {
                "Human: ${it.response.text}"
            }
            is DialogHistory.UtteranceItem -> {
                "AI: ${it.toText()}"
            }
            else -> null
        }
    }.joinToString(separator = "\n")




    //Informal prompt
    var conversationInput= "The following conversation is between an AI and a human, the AI has informal socially engaging personality depending on that give the best possible reply for the AI in informal sentence\n"
    conversationInput+= "\n Here are the past conversations between AI and human :\n"
    conversationInput+=history
    conversationInput+="\n AI:"
//    print(history)

    var response = ""

    //calculating length of the prompt
    val lengthofprompt = conversationInput.length

    var temperature = 0.7 // Higher values means the model will take more risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.
    var maxTokens =  100// Length of output generated. 1 token is on average ~4 characters or 0.75 words for English text
    var topP = 0.6 // 1.0 is default. An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.
    var frequencyPenalty = 0.0 // Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.
    var presencePenalty = 0.3 // Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.
    var completionRequest = CompletionRequest.builder()
        .model("text-davinci-003")
        .temperature(temperature)
        .topP(topP)
        .frequencyPenalty(frequencyPenalty)
        .presencePenalty(presencePenalty)
        .maxTokens(maxTokens)
        .prompt(conversationInput)
        .echo(true)
        .build();


    try {

        //completing request and storing the response in response variable
        val completion = service.createCompletion(completionRequest).choices.first().text
        response = completion.trim()

    } catch (e: Exception) {
        println("Problem with connection to OpenAI" + e.message)
        response="Unfortunately I am unable to connect to OpenAI services.Can you please repeat the question again?"
        return Rvalue(response, arrayOf())
    }

    //Engineered Prompt for gesture prediction
    var trainemotion="admiration\n" +
            "amusement\n" +
            "anger\n" +
            "annoyance\n" +
            "approval\n" +
            "caring\n" +
            "confusion\n" +
            "curiosity\n" +
            "desire\n" +
            "disappointment\n" +
            "disapproval\n" +
            "disgust\n" +
            "embarrassment\n" +
            "excitement\n" +
            "fear\n" +
            "gratitude\n" +
            "grief\n" +
            "joy\n" +
            "love\n" +
            "nervousness\n" +
            "optimism\n" +
            "pride\n" +
            "realization\n" +
            "relief\n" +
            "resmorse\n" +
            "sadness\n" +
            "surprise\n" +
            "neutral\n"+
            "each of the above label represent emotions expressed by human beings\n" +
            "give the appropriate label or labels to the below sentence\n"


var outputfile=""
    var i=0;

    //Few-shot learning prompt is stored here
    var temptrain=trainemotion
   temptrain+=response.drop(lengthofprompt)


                    completionRequest = CompletionRequest.builder()
                    .model("text-davinci-003")
                    .temperature(0.7)
                    .topP(topP)
                    .frequencyPenalty(frequencyPenalty)
                    .presencePenalty(presencePenalty)
                    .maxTokens(maxTokens)
                    .prompt(temptrain)
                    .echo(true)
                    .build();

    //getting the gesture label for the response
    val completion = service.createCompletion(completionRequest).choices.first().text
    var emot = completion.trim()
    emot= emot.drop(temptrain.length)
    println(emot)






    //trimming the response string and emotion string to get only required
    var res=response.drop(lengthofprompt+1)
    println(response.drop(lengthofprompt+1))
    val emoj = emot.split(",").toTypedArray()

    //storing the emojis in an array
    for (i in emoj) {
        gesturelog += i+"\n"
    }


    return Rvalue(res, emoj)
}

//function to store log files
fun logtext(): String{
    val log = Furhat.dialogHistory.all.takeLast(500).mapNotNull {
        when (it) {
            is DialogHistory.ResponseItem -> {
                "Human: ${it.response.text}"
            }
            is DialogHistory.UtteranceItem -> {
                "AI: ${it.toText()}"
            }
            else -> null
        }
    }.joinToString(separator = "\n")
    return log+"\n\n"+gesturelog
}


