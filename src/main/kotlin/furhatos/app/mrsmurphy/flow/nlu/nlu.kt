package furhatos.app.mrsmurphy.flow.nlu


import furhatos.nlu.EnumEntity
import furhatos.nlu.EnumItem
import furhatos.nlu.Intent
import furhatos.util.Language


class Endbye: Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Exit"
        )
    }
}

