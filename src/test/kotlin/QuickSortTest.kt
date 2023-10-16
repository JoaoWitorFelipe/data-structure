import QuickSort.QuickSort
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class QuickSortTest {

    private lateinit var quickSort: QuickSort;

    @BeforeEach
    fun setUp() {
        quickSort = QuickSort()
    }

    @Test
    fun testSortSimpleArray() {
        val arr = arrayOf(10, 5, 2, 3)
        val expectedArr = arrayOf(2, 3, 5, 10)

        assertContentEquals(expectedArr, quickSort.algorithm(arr))
    }
}