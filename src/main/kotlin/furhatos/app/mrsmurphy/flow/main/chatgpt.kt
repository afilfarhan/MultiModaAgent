package furhatos.app.mrsmurphy.flow.main


import com.theokanning.openai.service.OpenAiService
import com.theokanning.openai.completion.CompletionRequest
import furhatos.flow.kotlin.*


val serviceKey = "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"

fun getNLGResponseFromGPT(input: String, histval: Int = 10): String {

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


    //Formal prompt
    /*
        var conversationInput= "The following is a conversation with an AI assistant. The assistants name is Murphy who is serious and informative. Murphy works as a receptionist in a building called the National Robotarium. Murphy has to talk to Visitor.Murphy has to talk to Visitor.If the Visitor ask only then give additional information.\n"
        if (input.trim().isNotEmpty()) {
            conversationInput += "Here are some additional information which may be used if required :\n"
            conversationInput += input
        }
        conversationInput+= "\n Here are the past conversations between Murphy and Visitor :\n"
        conversationInput+=history
        conversationInput+="\n Murphy should now produce a formal response. Response should be no longer than 3 sentences and murphy is not required to greet Visitor and murphy should try to summarise whatever it says.Dont try to repeat what was told in previous conversations. Also if the question is asked out of the context, Murphy should ask the user to confirm the visitor's question which is most related to the information given above in a very formal way. Do not attempt to fabricate or hallucinate any answers. Murphy: ?"
    */


    //Informal prompt
    var conversationInput= "The following conversation is between an socially interactive AI and a human, give the best possible reply for the AI\n"
    conversationInput+= "\n Here are the past conversations between AI and human :\n"
    conversationInput+=history
    conversationInput+="\n AI:"
//    print(history)

    var response = ""
    val lengthofprompt = conversationInput.length
    // Read more about these settings: https://beta.openai.com/docs/introduction
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
        val completion = service.createCompletion(completionRequest).choices.first().text
        response = completion.trim()

    } catch (e: Exception) {
        println("Problem with connection to OpenAI" + e.message)
        response="Unfortunately I am unable to connect to OpenAI services.Can you please repeat the question again?"
        return response
    }
    //println(response)
//    println("-------------------------------------------------")
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
            "remorse\n" +
            "sadness\n" +
            "surprise\n" +
            "neutra\n"+
            "only above emotion gesture should represent the sentence\n Below are some examples\n"+
            "you should really consider joining this team - gratitude, desire\n"+
            "people tend to watch me there - neutral\n"+
            "it seems like you dont care about that at all - embarrassment\n"+
            "wow, that is some amazing thing you did - surprise\n"+
            "are you sure about things you need to do - dissapointment, confusion\n"

    trainemotion+=response.drop(lengthofprompt)+" - ?"
    completionRequest = CompletionRequest.builder()
        .model("text-davinci-003")
        .temperature(temperature)
        .topP(topP)
        .frequencyPenalty(frequencyPenalty)
        .presencePenalty(presencePenalty)
        .maxTokens(maxTokens)
        .prompt(trainemotion)
        .echo(true)
        .build();
    val completion = service.createCompletion(completionRequest).choices.first().text
    var emot = completion.trim()
    println("emotion: "+emot.drop(trainemotion.length))
//    println(response.drop(lengthofprompt))
    return response.drop(lengthofprompt)
}


