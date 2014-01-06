package test;

import static org.junit.Assert.*;

import org.junit.Test;

import recursion.PermutationSequence;

public class PermutationSequenceTest {

	@Test
	public void test() {		
		PermutationSequence ps = new PermutationSequence();
		assertEquals("213",ps.getPermutation(3,3));
	}
	
	@Test
	public void test1() {		
		PermutationSequence ps = new PermutationSequence();
		assertEquals("312",ps.getPermutation(3,5));
	}
}
