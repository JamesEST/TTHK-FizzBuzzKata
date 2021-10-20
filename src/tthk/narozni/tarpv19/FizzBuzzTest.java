package tthk.narozni.tarpv19;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shouldReturn0() {
        assertEquals(FizzBuzz.of(0), ("0"));
    }
    @Test
    public void shouldReturn1(){
        assertEquals(FizzBuzz.of(1), ("1"));
    }
    @Test
    public void multipleOfThreeReturnFizz(){
        assertEquals(FizzBuzz.of(3), ("Fizz"));
    }
    @Test
    public void multipleOfFiveReturnBuzz(){
        assertEquals(FizzBuzz.of(5), ("Buzz"));
    }
    @Test
    public void multipleOfFiveAndThreeReturnFizzBuzz(){
        assertEquals(FizzBuzz.of(15), ("FizzBuzz"));
    }

}
