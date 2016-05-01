import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class StringCalculatorTest {
    public StringCalculator stringCalculatorInstance = new StringCalculator();
    //An empty string returns zero
    @Test
    public void emptyStringTest() throws Exception {
        assertThat(stringCalculatorInstance.add(""), is(0));
    }
    // A single number returns the value
    @Test
    public void singleNumberReturnItsValueTest() throws Exception {
        assertThat(stringCalculatorInstance.add("2"), is(2));
        assertThat(stringCalculatorInstance.add("1"), is(1));
    }
    //Two numbers, comma delimited, returns the sum
    @Test
    public void twoNumbersCommaDelimitedReturnsTheSumTest() throws Exception {
        assertThat(stringCalculatorInstance.add("0,2"), is(2));
        assertThat(stringCalculatorInstance.add("1,1"), is(2));
        assertThat(stringCalculatorInstance.add("1,2"), is(3));
    }
    // Two numbers, newline delimited, returns the sum
    @Test
    public void sameThatBeforeButNewLineDelimitedTest() throws Exception {
        assertThat(stringCalculatorInstance.add("0\n2"), is(2));
        assertThat(stringCalculatorInstance.add("1\n1"), is(2));
        assertThat(stringCalculatorInstance.add("1\n2"), is(3));
    }

    // Three numbers, delimited either way, returns the sum
    @Test
    public void sameThatBeforeButAllDelimitersWorksTest() throws Exception {
        assertThat(stringCalculatorInstance.add("1\n2,3"), is(6));
        assertThat(stringCalculatorInstance.add("1,2\n4"), is(7));
    }

    // Negative numbers throw an exception
    @Test(expected = Exception.class)
    public void negativeNumbersThrowsAnExceptionTest() throws Exception {
        stringCalculatorInstance.add("-1,-1");
    }

    // Numbers greater than 1000 are ignored
    @Test
    public void greaterThan1000AreIgnoredTest() throws Exception {
        assertThat(stringCalculatorInstance.add("2,1000"), is(1002));
        assertThat(stringCalculatorInstance.add("2,1001"), is(2));
    }
    // A single char delimiter can be defined on the first line
    @Test
    public void singleCharDelimiterTest() throws Exception {
        assertThat(stringCalculatorInstance.add("#2#1000"), is(1002));
    }
}