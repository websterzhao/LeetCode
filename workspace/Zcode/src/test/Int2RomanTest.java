package test;

import static org.junit.Assert.*;

import math.Int2Roman;

import org.junit.Test;

public class Int2RomanTest {

	@Test
	public void test() {
		Int2Roman ir = new Int2Roman();
		assertEquals("IV",ir.intToRoman(4));
		assertEquals("XI",ir.intToRoman(11));
	}

}
