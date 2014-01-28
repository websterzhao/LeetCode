package test;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.ValidParlindrome;

public class ValidParlindromeTest {

	@Test
	public void test() {
		ValidParlindrome bbs= new ValidParlindrome();
		String s= "A man, a plan, a canal: Panama";
		assertEquals(true,bbs.isPalindrome(s));
	}


}
