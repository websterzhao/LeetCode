package test;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.ValidParlindrome;

public class ValidParlindromeTest {

	@Test
	public void test() {
		ValidParlindrome bbs= new ValidParlindrome();
		String s= "zA ::::man, a plan, a canal:   ?????  :::::::   Panamaz";
		assertEquals(true,bbs.isPalindrome2(s));
	}
	@Test
	public void test2() {
		ValidParlindrome bbs= new ValidParlindrome();
		String s= "1a2";
		assertEquals(false,bbs.isPalindrome2(s));
	}


}
