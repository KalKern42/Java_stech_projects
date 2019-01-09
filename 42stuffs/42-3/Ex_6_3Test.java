package cHtr42;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ex_6_3Test {

	@Test
	public void testReverse() {
		assertEquals(Ex_6_3.reverse(123), 321);
		assertEquals(Ex_6_3.reverse(13), 31);
		assertEquals(Ex_6_3.reverse(1234), 4321);
		
	}
	
	@Test
	public void testidPalindrome() {
		assertTrue(Ex_6_3.isPalindrome(121));
		assertFalse(Ex_6_3.isPalindrome(155));
	}
}
