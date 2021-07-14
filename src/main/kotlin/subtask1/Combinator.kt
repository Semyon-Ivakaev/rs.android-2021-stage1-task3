package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var summ = 0.0
        val intOne = array[0]
        val intTwo = array[1]
        var pogr = 0

        for (i in 1..intTwo) {
            if (summ == intOne.toDouble()) break
            summ = factorial(intTwo) / (factorial(i) * factorial(intTwo - i))
            pogr = i
        }
        return if (summ < intOne.toDouble()) null else pogr
    }

    // result = 1 * 2 * 3 * ... * num
    private fun factorial(num: Int): Double {
        var result = 1.0
        for (i in 2..num) {
            result *= i
        }
        return result
    }
}
