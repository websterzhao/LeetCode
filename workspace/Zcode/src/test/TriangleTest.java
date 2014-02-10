package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import DP.Triangle;

public class TriangleTest {

	@Test
	public void test() {
		Triangle tt = new Triangle();		
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a1.add(1);
		a2.add(2);
		a2.add(3);
		triangle.add(a1);
		triangle.add(a2);
		assertEquals(3,tt.minimumTotal(triangle));
	}

}
