package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import recursion.PalindromePartitioning;


public class PalindromePartTest {

	@Test
	public void test() {
		PalindromePartitioning re = new PalindromePartitioning();
		String s = "aab";
		ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("a");
		temp.add("a");
		temp.add("b");
		ret.add(temp);
		temp = new ArrayList<String>();
		temp.add("aa");
		temp.add("b");
		ret.add(temp);
		
		assertEquals(ret, re.partition(s));
	}

}

