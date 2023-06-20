package furhatos.app.mrsmurphy.flow.main

import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state

fun whatCanIDo(firstTime: Boolean = false) : State = state {
    onEntry {
        if (firstTime) {
            furhat.ledStrip.solid(java.awt.Color(127,0,0))

        }
        else {
            furhat.ledStrip.solid(java.awt.Color(127,0,0))

        }

        terminate()
    }
}