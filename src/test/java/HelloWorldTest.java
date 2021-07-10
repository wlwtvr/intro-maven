import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class HelloWorldTest {
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	private final PrintStream oOut = System.out;
	
	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(out));
	}

	@Test
	public void testSayHello() {
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
		Assertions.assertEquals("Hello World!", out.toString());
	}

	@AfterEach
	public void cleanUp() {
		System.setOut(oOut);
	}
}
