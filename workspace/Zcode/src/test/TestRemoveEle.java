package test;

import arrays.RemoveElements;


public class TestRemoveEle {

	public static void main(String[] args) {
		RemoveElements rl= new RemoveElements();
		int[] A={1};
		int ret= rl.removeElement(A,1);
		System.out.println(ret);
	}
}
