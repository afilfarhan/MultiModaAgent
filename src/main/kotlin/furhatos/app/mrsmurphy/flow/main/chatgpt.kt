package furhatos.app.mrsmurphy.flow.main


import com.theokanning.openai.service.OpenAiService
import com.theokanning.openai.completion.CompletionRequest
import furhatos.flow.kotlin.*


data class Rvalue(val stringValue: String, val stringArray: Array<String>)

val serviceKey = "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"

var gesturelog=""

fun getNLGResponseFromGPT(histval: Int = 6): Rvalue {

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
        return Rvalue(response, arrayOf())
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
            "neutral\nIf you're in the Bay Area check out Flying Over Walls.\tamusement\n" +
            "Would you rather I hadn't posted this article? Don't want to talk about it?\tanger, confusion\n" +
            "This one tilted concrete square in my neighborhood that I keep tripping over.\tanger, annoyance\n" +
            "yes, agreed. \tapproval\n" +
            "Dude, I'll be your friend any time\tcaring\n" +
            "Why would they lie?\tconfusion\n" +
            "Does anyone have a link to the rainbow song clip? I tried looking everywhere and can't find it\tcuriosity, sadness\n" +
            "That was the middle school dream\tdesire\n" +
            "Yeah being up by 20 every game does that unfortunately\tdisappointment, sadness\n" +
            "Just feels rude I guess\tdisapproval\n" +
            "I'm always paranoid of people following me when I am driving home. I would have pooed my pants yikes.\tdisgust, fear\n" +
            "It was less painful than a bee sting! I felt so silly afterwards!\tembarrassment\n" +
            "What a combo of food\texcitement\n" +
            "This is a terrible idea\tfear\n" +
            "This is all soooo nice. What nice people.\tgratitude\n" +
            "Sorry for your loss; this story is heartwarming.\tgrief, sadness\n" +
            "Happy to help\tjoy\n" +
            "I like in Iowa. The weather part is true\tapproval, love\n" +
            "Is there something I'm missing here? I don't see the pun.\tnervousness\n" +
            "It sounds like you'd have a great time with Final Fantasy XIV.\toptimism\n" +
            "Proud of you!\tpride\n" +
            "I can see why! I would totally be offended too!\trealization\n" +
            "Afraid not. I was just given a different perspective.\trelief\n" +
            "My comment provided shame. I am nothing.\tembarrassment, remorse\n" +
            "Agreed. But considering their poor cars were carrying 1200+ lbs of weight, that might slow things down lol\tamusement, sadness\n" +
            "Oh man, are we actually getting a real Ghostbusters sequel?\tcuriosity, surprise\n" +
            "Thought I saw a shot glass in there the first time I watched this.\tneutral\n"


var outputfile=""
    var i=0;
    var temptrain=trainemotion
    temptrain+=response.drop(lengthofprompt)
//    try {
//        File("C:\\Users\\mohaa\\IdeaProjects\\MultiModaAgent\\src\\main\\kotlin\\furhatos\\app\\mrsmurphy\\flow\\main\\test.txt").useLines { lines ->
//            lines.forEach { line ->
//                var temp=trainemotion
//                temp+=line
////                println(temp)
//                completionRequest = CompletionRequest.builder()
//                    .model("text-davinci-003")
//                    .temperature(0.9)
//                    .topP(topP)
//                    .frequencyPenalty(frequencyPenalty)
//                    .presencePenalty(presencePenalty)
//                    .maxTokens(maxTokens)
//                    .prompt(temp)
//                    .echo(true)
//                    .build();
//                val completion = service.createCompletion(completionRequest).choices.first().text
//                var emot = completion.trim()
//                if(i==0){
//                outputfile+= getLastLine(emot) +"\n"
//                println(getLastLine(emot))
//                i++}
//                else{
//                    outputfile+= getLastLine(emot) +"\n"
//                    println(getLastLine(emot))}
//
//            }
//        }
//    } catch (e: Exception) {
//        println("Error reading the file: ${e.message}")
//    }
//    try {
//        File("outtest.txt").bufferedWriter().use { writer ->
//            writer.flush()
//            writer.write(outputfile)
//            writer.close()
//        }
//    } catch (e: Exception) {
//        println("Error writing the file: ${e.message}")
//    }

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
    val completion = service.createCompletion(completionRequest).choices.first().text
    var emot = completion.trim()
    emot= emot.drop(temptrain.length)
    println(emot)




//   var num= compareTextFiles("outtest.txt","realvalue.txt")
//    println("The total score is "+ num)
    var res=response.drop(lengthofprompt+1)
    println(response.drop(lengthofprompt+1))
    val emoj = emot.split(",").toTypedArray()
    for (i in emoj) {
        gesturelog += i+"\n"
    }
    return Rvalue(res, emoj)
}

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
    return log+"\n"+gesturelog
}


