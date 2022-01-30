package algorithm.dynamicProgramming;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciNumberTest {
	@Test
	public void fiboTest1() {
		assertEquals("Testing the 2nd fibo num", FibonacciNumber.perform(2), 1);
	}	

	@Test
	public void fiboTest2() {
		assertEquals("Testing the 3rd fibo num", FibonacciNumber.perform(3), 2);
	}

	@Test
	public void fiboTest3() {
		assertEquals("Testing the 4th fibo num", FibonacciNumber.perform(4), 3);
	}

	@Test
	public void fiboTest4() {
		assertEquals("Testing the 14th fibo num", FibonacciNumber.perform(14), 377);
	}

	@Test
	public void fiboTest5() {
		assertEquals("Testing the 45th fibo num", FibonacciNumber.perform(45), 1134903170);
	}

}
