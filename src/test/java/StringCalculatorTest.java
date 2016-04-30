import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class StringCalculatorTest {
    public StringCalculator stringCalculatorInstance = new StringCalculator();
    @Test
    public void emptyStringTest() {
        assertThat(stringCalculatorInstance.add(""), is(0));
    }
    @Test
    public void singleNumberShouldReturnTheValueTest() {
        assertThat(stringCalculatorInstance.add("1"), is(1));
        assertThat(stringCalculatorInstance.add("0"), is(0));
        assertThat(stringCalculatorInstance.add("10"), is(10));
    }
}