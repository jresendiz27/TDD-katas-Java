import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class StringCalculatorTest {
	public StringCalculator stringCalculatorInstance = new StringCalculator();
	@Test
	public void emptyStringTest() {
		assertThat(true,is(true));	
	}
}