package furhatos.app.mrsmurphy.flow.main

import java.io.File

// Function to compare the similarity of two text files
fun compareTextFiles(file1: String, file2: String): Double {
    var score = 0.0  // Initialize a variable to store the similarity score
    var numLines = 0  // Initialize a variable to keep track of the number of lines

    // Open and read the first file using a buffered reader
    File(file1).bufferedReader().use { f1 ->
        // Open and read the second file using a buffered reader
        File(file2).bufferedReader().use { f2 ->
            val lines1 = f1.readLines()  // Read all lines from the first file
            val lines2 = f2.readLines()  // Read all lines from the second file

            // Iterate through corresponding lines of both files
            for ((line1, line2) in lines1.zip(lines2)) {
                val words1 = line1.trim().split(",")  // Split line1 into words using comma as delimiter
                val words2 = line2.trim().split(",")  // Split line2 into words using comma as delimiter

                // Check if all words in words1 are present in words2
                if (words1.all { it in words2 }) {
                    score++  // Increase the score if all words match
                } else {
                    // Calculate a partial score based on common words between the lines
                    val dScore = words1.count { word1 -> words2.any { word2 -> word1 == word2 } }
                    // Increase the score proportionally to the partial score
                    score += dScore.toDouble() / maxOf(words1.size, words2.size)
                }
                numLines++  // Increment the line count
            }
        }
    }
    return score / numLines * 100  // Calculate and return the average similarity score
}

// Function to get the last line of an input string
fun getLastLine(input: String): String {
    val lines = input.trim().splitToSequence("\n")  // Split the input into lines
    val lastLine = lines.lastOrNull().orEmpty()  // Get the last line or an empty string if not found
    return lastLine.toLowerCase()  // Convert the last line to lowercase and return
}

// Main function where the program execution starts
fun main() {
    val file1 = "D:\\jjj\\d.txt"  // Replace with the path to your first file
    val file2 = "D:\\jjj\\s.txt"  // Replace with the path to your second file
    val comparisonScore = compareTextFiles(file1, file2)  // Call the comparison function
    println("Comparison score: %.2f".format(comparisonScore))  // Print the comparison score with two decimal places
}
