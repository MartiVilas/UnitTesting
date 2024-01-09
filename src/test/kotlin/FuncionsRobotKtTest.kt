import org.example.*
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class FuncionsRobotKtTest{
    @Test
    fun checkIfVelocitatIncreasesValue() {
        val expected = 1.5
        assertEquals(expected, accelerar(1.0)) // velocitat inicial, d'1.0, incrementada en 0.5 -> 1.5
    }


    @Test
    fun checkIfVelocitatDecreasesValue(){
        val expected = 0.0
        assertEquals(expected, disminuir(0.5))
    }

    @Test
    fun checkIfMovementWorksIncreases(){
        val expected = arrayOf(1.0,1.0)
        assertArrayEquals(expected, dreta(arrayOf(0.0,1.0),1.0))
        assertArrayEquals(expected, dalt(arrayOf(1.0,0.0),1.0))
    }

    @Test
    fun checkIfMovementWorksDecreases(){
        val expected = arrayOf(0.0,0.0)
        assertArrayEquals(expected, dreta(arrayOf(1.0,0.0),-1.0))
        assertArrayEquals(expected, dalt(arrayOf(0.0,1.0),-1.0))
    }

    @Test
    fun checkIfEsquerraIncreasesValue(){
        val expected = arrayOf(-1.0,0.0)
        assertArrayEquals(expected, esquerra(arrayOf(0.0,0.0),1.0))
    }

    @Test
    fun checkIfUpIncreasesValue(){
        val expected = arrayOf(0.0,1.0)
        assertArrayEquals(expected, dalt(arrayOf(0.0,0.0),1.0))
    }

    @Test
    fun checkIfUpIncreasesValueVelocityIncreased(){
        val expected = arrayOf(0.0,4.0)
        assertArrayEquals(expected, dalt(arrayOf(0.0,0.0),4.0))
    }

    @Test
    fun checkIfDownIncreasesValue(){
        val expected = arrayOf(0.0,1.0)
        assertArrayEquals(expected, baix(arrayOf(0.0,0.0),-1.0))
    }

    @Test
    fun checkIfDownIncreasesValueWithNoValue(){
        val expected = arrayOf(0.0,0.0)
        assertArrayEquals(expected, baix(arrayOf(0.0,0.5),))
    }
    @Test
    fun checkIfUpIncreasesValueWithNoValue(){
        val expected = arrayOf(0.0,0.5)
        assertArrayEquals(expected, dalt(arrayOf(0.0,0.0),))
    }

}