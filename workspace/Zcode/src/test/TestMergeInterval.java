package test;

import java.util.ArrayList;

import anode.Interval;
import arrays.MergeInterval;



public class TestMergeInterval {

	public static void main(String[] args) {
		MergeInterval ls = new MergeInterval();
		ArrayList<Interval> input = new ArrayList<Interval>();
	
		input.add(new Interval(2,3));
 		input.add(new Interval(4,5));
 		input.add(new Interval(6,7));
		input.add(new Interval(8,9));
		input.add(new Interval(1,10));
		ArrayList<Interval> ret =ls.merge(input);
		for(Interval in: ret){
		System.out.println("["+in.start+" "+in.end+"]"+" ");
		}
	}

}
