import static org.junit.Assert.*;

import org.junit.Test;

public class isPrimeTest {

	@Test
	public void test() {
		isPrime ip= new isPrime();
		String res=ip.checkPrime(16);
		assertEquals("is not prime", res );
	}

}
