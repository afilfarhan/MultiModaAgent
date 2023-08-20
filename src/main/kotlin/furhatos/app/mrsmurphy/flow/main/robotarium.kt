package furhatos.app.mrsmurphy.flow.main

import furhat.libraries.standard.UtilsLib
import furhatos.app.mrsmurphy.flow.Parent
import furhatos.app.mrsmurphy.flow.nlu.*
import furhatos.flow.kotlin.*
import theparser
import java.io.File
import java.time.LocalTime

//start the time for calculating time for the session
var start = System.currentTimeMillis()
var firstEntry = true
val     Robotarium: State = state(Parent) {

    onEntry {
        //this is only triggered at the start of the conversation
        if(firstEntry){
            furhat.ledStrip.solid(java.awt.Color(127,0,0))
            UtilsLib.randomNoRepeat(
                //Four types of Greetings
                { furhat.say("Hi") },
                { furhat.say("hello") },
                { furhat.say("Hello there!") },
                { val time = LocalTime.now()
                    val greeting = when (time.hour) {
                        in 6..11 -> "Good morning!"
                        in 12..17 -> "Good afternoon!"
                        else -> "Good evening!"
                    }

                    furhat.say(greeting)

                })
            furhat.ledStrip.solid(java.awt.Color(0,127,0))
            furhat.listen()
        }
        else {
            furhat.ledStrip.solid(java.awt.Color(0,127,0))
            furhat.listen()
        }
    }
    onReentry {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))

        furhat.say("Is there anything else you would like to know more about?")
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }


    //Response for the Exit Intent
    onResponse<Endbye> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        //getting the log file
        var log= logtext()
        val baseFileName = "Log-of-B-"
        val directory = "C:\\Users\\mohaa\\IdeaProjects\\MultiModaAgent\\src\\main\\kotlin\\log" // Replace this with the directory path.
        //ending the timer and calculating total time
        var endtime=System.currentTimeMillis()
        var time= endtime-start
        time=time/1000
        log+="\n"+ time

        //saving the log file
        savefile(baseFileName, log, directory)
        furhat.say("This is system B")
        goto(Idle)

    }



    onResponse {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        //Response and gestures is recieved from language model and sent to thepaser function

        var replygpt= getNLGResponseFromGPT()

        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }

    //this function is triggered whenever no data is obtained while the system is listening
    onNoResponse {

        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        UtilsLib.randomNoRepeat(
            {furhat.say("Hey .... You can talk to me .... you know") },
            {furhat.say("Hey ... I am knowledge enough to answer your questions") },
            {furhat.say("Hey ... can you please raise your voice a bit so I can answer your questions") }
        )
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen(10000)
    }
}

//function to save the contents in a file
fun savefile(baseFileName: String, content: String, directory: String) {
    var fileName = baseFileName
    var fileNumber = 0

    // Check if the file with the current name already exists
    while (File("$directory/$fileName.txt").exists()) {
        fileNumber++
        fileName = "$baseFileName$fileNumber"
    }

    // Append the incremented number to the base file name
    val file = File("$directory/$fileName.txt")

    // Save the text content to the file
    file.writeText(content)

    println("File saved as: ${file.absolutePath}")
}