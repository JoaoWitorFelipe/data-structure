package BinarySearch

class BinarySearch {

    tailrec fun <T : Comparable<T>> recursiveAlgorithm(
        findValue: T,
        list: List<T> = emptyList(),
        left: Int = 0,
        right: Int = list.size - 1
    ): T? {
        return if (right >= left) {
            val mid = (right + left) / 2
            val currentValue = list[mid]

            when {
                currentValue == findValue -> currentValue
                currentValue > findValue -> recursiveAlgorithm(findValue, list, left, mid - 1)
                else -> recursiveAlgorithm(findValue, list, mid + 1, right)
            }
        } else null
    }

    fun <T : Comparable<T>> algorithm(findValue: T, list: List<T> = emptyList()): T? {
        var left = 0
        var right = list.size - 1
        var i = 0

        while (left <= right) {
            val mid = (left + right) / 2
            val currentValue = list[mid];

            val result = currentValue.compareTo(findValue)
            if (result == 0) {
                return currentValue
            }
            if (result > 0) {
                right = mid - 1
            } else {
                left = mid + 1
            }

            i++

        }

        return null
    }

    fun <T : Comparable<T>> algorithmWithQuantityOfInteractions(
        findValue: T,
        list: List<T> = emptyList(),
    ): Int? {
        var left = 0
        var right = list.size - 1
        var i = 0

        while (left <= right) {
            val mid = (left + right) / 2
            val currentValue = list[mid];

            val result = currentValue.compareTo(findValue)
            if (result == 0) {
                return i
            }
            if (result > 0) {
                right = mid - 1
            } else {
                left = mid + 1
            }

            i++

        }

        return null
    }

}