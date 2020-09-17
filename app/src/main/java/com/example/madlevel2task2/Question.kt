package com.example.madlevel2task2

data class Question(
    var question: String
) {
    companion object {
        val QUESTIONS = arrayOf(
            "De Nike Air Max 1 kwam officieel uit in het jaar 2000.",
            "Nederland heeft in de wk finale van 2010 verloren van spanje.",
            "Barcelona heeft 2-8 gewonnen van bayern munchen in de halve finale van de champions league.",
            "Een iPhone zal altijd beter zijn dan een android telefoon."
        )

        val ANSWERS = arrayOf(
            false,
            true,
            false,
            true
        )
    }
}