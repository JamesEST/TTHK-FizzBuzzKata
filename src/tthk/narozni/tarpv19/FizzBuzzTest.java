package tthk.narozni.tarpv19;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shouldReturn0() {
        assertEquals(FizzBuzz.of(0), ("0"));
    }
}
