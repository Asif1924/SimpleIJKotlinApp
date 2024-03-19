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

    @Test
    fun testFib1equals1() {

        val fib = Fib()

        assertEquals(1,fib.doFib(1))
    }

    @Test
    fun testFib2equals1() {

        val fib = Fib()

        assertEquals(1,fib.doFib(2))
    }

    @Test
    fun testFib3equals2() {

        val fib = Fib()

        assertEquals(2,fib.doFib(3))
    }

    @Test
    fun testFib4equals3() {

        val fib = Fib()

        assertEquals(3,fib.doFib(4))
    }

    @Test
    fun testFib5equals5() {

        val fib = Fib()

        assertEquals(5,fib.doFib(5))
    }

    @Test
    fun testFib6equals8() {

        val fib = Fib()

        assertEquals(8,fib.doFib(6))
    }

    @Test
    fun testFib7equals13() {

        val fib = Fib()

        assertEquals(13,fib.doFib(7))
    }

}



