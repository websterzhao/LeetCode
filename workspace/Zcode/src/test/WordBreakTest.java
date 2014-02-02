package test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import DP.WordBreak;

public class WordBreakTest {

	@Test
	public void test() {
		String s = "aaca";
		WordBreak wb = new WordBreak();
		Set<String> dict = new HashSet<String>();
		dict.add("a");
		dict.add("b");
		dict.add("ac");
		assertEquals(true,wb.wordBreak(s, dict));
	}

}
