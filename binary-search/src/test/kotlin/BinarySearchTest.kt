import BinarySearch.BinarySearch
import org.junit.jupiter.api.BeforeEach
import kotlin.math.abs
import kotlin.math.log2
import kotlin.test.Test
import kotlin.test.assertEquals

internal class BinarySearchTest {

    private val listOfString =
        listOf(
            "joao",
            "joana",
            "gustavo",
            "vinicius",
            "fernando",
            "douglas",
            "rahony",
            "mayline",
            "jaque",
            "emily",
            "ana",
            "carolina"
        ).sorted();

    private val listOfInt = (1..1000).toList()

    private lateinit var binarySearch: BinarySearch

    @BeforeEach
    fun setUp() {
        binarySearch = BinarySearch()
    }

    @Test
    fun testThatIUseInReadmeFile() {
        val findValue = 7

        val actual = binarySearch.recursiveAlgorithm(findValue, listOf(1, 3, 5, 7).toList())

        assertEquals(findValue, actual)
    }

    @Test
    fun testFindValueThatExistsInListOfIntWithRecursiveAlgorithm() {
        val findValue = listOfInt.random()

        val actual = binarySearch.recursiveAlgorithm(findValue, listOfInt)

        assertEquals(findValue, actual)
    }

    @Test
    fun testFindValueThatExistsInListOfInt() {
        val findValue = listOfInt.random();

        val actual = binarySearch.algorithm(findValue, listOfInt)

        assertEquals(findValue, actual)
    }

    @Test
    fun testFindValueThatExistsInListOfString() {
        val findValue = listOfString.random();

        val actual = binarySearch.algorithm(findValue, listOfString)

        assertEquals(findValue, actual)
    }

    @Test
    fun testQuantityOfInteractionsInAlgorithm() {
        val findValue = listOfInt.random();

        val actual = binarySearch.algorithmWithQuantityOfInteractions(findValue, listOfInt)

        this.assertApproximatelyEquals(log2(listOfInt.size.toDouble()).toInt(), actual!!)
    }

    private fun assertApproximatelyEquals(expected: Int, actual: Int, epsilon: Int = 2) {
        if (abs(expected - actual) > epsilon) {
            throw AssertionError("Expected $expected, but got $actual")
        }
    }

}