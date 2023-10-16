package QuickSort

class QuickSort {

    fun algorithm(arr: Array<Int>): Array<Int> {
        return if (arr.size < 2) {
            arr
        } else {
            val pivot = arr[0]
            val (less, bigger) = arr.drop(1)
                    .toTypedArray()
                    .partition { it < pivot }
            algorithm(less.toTypedArray()) + arrayOf(pivot) + algorithm(bigger.toTypedArray())
        }
    }

}