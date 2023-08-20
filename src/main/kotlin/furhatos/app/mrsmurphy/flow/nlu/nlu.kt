package furhatos.app.mrsmurphy.flow.nlu


import furhatos.nlu.EnumEntity
import furhatos.nlu.EnumItem
import furhatos.nlu.Intent
import furhatos.util.Language


class Endbye: Intent() {
    //Intent is only used to stop the conversation for evaluation purpose
    //Except that there is no Intent in this program
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Exit"
        )
    }
}

