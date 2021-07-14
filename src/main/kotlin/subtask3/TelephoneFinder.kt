package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val numbers = mapOf('0' to "8", '1' to "24", '2' to "135", '3' to "26", '4' to "157", '5' to "2468", '6' to "359",
            '7' to "48", '8' to "5790", '9' to "68"
        )
        val result = mutableListOf<String>()

        for ((index, value) in number.withIndex()) {
            val neighbors = numbers[value]
            when {
                neighbors != null -> for (i in neighbors) {
                    result.add(number.take(index) + i + number.drop(index + 1))
                }
                else -> return null
            }
        }
        return result.toTypedArray()
    }
}
