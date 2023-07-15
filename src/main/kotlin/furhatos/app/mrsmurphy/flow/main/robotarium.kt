package furhatos.app.mrsmurphy.flow.main

import furhat.libraries.standard.UtilsLib
import furhatos.app.mrsmurphy.flow.Parent
import furhatos.app.mrsmurphy.flow.nlu.*
import furhatos.app.mrsmurphy.flow.trivia.AskQuestion
import furhatos.flow.kotlin.*
import furhatos.nlu.EnumEntity
import furhatos.nlu.common.DontKnow
import theparser
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter


var firstEntry = true
val     Robotarium: State = state(Parent) {
    var response=""
    onEntry {
        if(firstEntry){
            furhat.ledStrip.solid(java.awt.Color(127,0,0))
            UtilsLib.randomNoRepeat(
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

            furhat.listen()
        }
        else {
            furhat.ledStrip.solid(java.awt.Color(127,0,0))


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
    onResponse {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }
    onNoResponse {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
        furhat.ask("dsds")
    }
}