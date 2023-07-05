package furhatos.app.mrsmurphy.flow.main

import java.io.File

fun compareTextFiles(file1: String, file2: String): Double {
    var score = 0.0
    var numLines = 0

    File(file1).bufferedReader().use { f1 ->
        File(file2).bufferedReader().use { f2 ->
            val lines1 = f1.readLines()
            val lines2 = f2.readLines()

            for ((line1, line2) in lines1.zip(lines2)) {
                val words1 = line1.trim().split(",")
                val words2 = line2.trim().split(",")
                if (words1.all { it in words2 }) {
                    score++
                } else {
                    val dScore = words1.count { word1 -> words2.any { word2 -> word1 == word2 } }
                    score += dScore.toDouble() / maxOf(words1.size, words2.size)
                }
                numLines++
            }
        }
    }
    return score / numLines * 100
}

fun getLastLine(input: String): String {
    val lines = input.trim().splitToSequence("\n")
    val lastLine = lines.lastOrNull().orEmpty()
    return lastLine.toLowerCase()
}

fun main() {
    val file1 = "D:\\jjj\\d.txt"  // replace with the path to your first file
    val file2 = "D:\\jjj\\s.txt"  // replace with the path to your second file
    val comparisonScore = compareTextFiles(file1, file2)
    println("Comparison score: %.2f".format(comparisonScore))
}
