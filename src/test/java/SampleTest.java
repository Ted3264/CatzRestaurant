package MyCompany.JUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class SampleTest {
	@Test
	void test01() {
		assertEquals("abc","abc");
	}
}