import com.alliconsulting.SimpleIJKotlinApp.Fib
import org.junit.Test
import org.junit.Assert.*

class FibTests {
    @Test
    fun testFib() {

        val fib = Fib()

        assertNotNull(fib)
    }

    @Test
    fun testFib0equals0() {

        val fib = Fib()

        assertEquals(0,fib.doFib(0))
    }

}



