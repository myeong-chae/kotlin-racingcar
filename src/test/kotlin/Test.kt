import com.kmc.Car
import com.kmc.makeCar
import com.kmc.runMainLoop
import io.kotest.core.spec.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.io.ByteArrayInputStream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JUnitTest {
    var loopCount = 0
    @Test
    @Order(1)
    fun inputNCreateCarTest(){
        val carList: List<String> = listOf("aaa","bbb","ccc","ddd","eee","fff")
        makeCar(carList)
    }
    @Test
    @Order(2)
    fun inputLoopCountTest(){
        val input = "3"
        System.setIn(ByteArrayInputStream(input.toByteArray()))
        loopCount = com.kmc.inputLoopCount()
    }

    @Test
    @Order(3)
    fun runMainLoopTest(){
        runMainLoop(loopCount)
    }

    @Test
    @Order(4)
    fun winnerTest(){
        Car.printWinner()
    }

}