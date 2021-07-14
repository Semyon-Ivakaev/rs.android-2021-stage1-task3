package subtask2

import java.lang.Math.sqrt

class SquareDecomposer {
    fun decomposeNumber(number: Int): Array<Int>? {
        return if (number < 5) {
            null
        } else {
            decompose(number - 1, number * number)
        }
    }

    private fun decompose(nextNumber: Int, square: Int): Array<Int>? {
        for (i in nextNumber downTo 1) {
            val ostatok = square - i * i

            if (ostatok == 0) return arrayOf(i)

            val nextNum = sqrt(ostatok.toDouble()).toInt()

            var result: Array<Int>? = if (nextNum >= i) {
                decompose(i - 1, ostatok)
            } else {
                decompose(nextNum, ostatok)
            }

            if (result != null) return result + arrayOf(i)
        }
        return null
    }
}
