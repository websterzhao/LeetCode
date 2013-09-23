package arrays;

import java.util.ArrayList;
import anode.Interval;

public class MergeInterval  {
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		if (intervals.size() <= 1)
			return intervals;
		ArrayList<Interval> ret = new ArrayList<Interval>();
		mergeSort(intervals,0,intervals.size()-1);
		Interval prev = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval cur = intervals.get(i);
			if (prev.end < cur.start) {
				ret.add(prev);
				prev = cur;
			} else
				prev.end = cur.end>prev.end?cur.end:prev.end;
		}
		ret.add(prev);
		return ret;
	}

	private void mergeSort(ArrayList<Interval> intervals, int i, int j) {
		if(i>=j) return;
		int mid = i+(j-i)/2;
		mergeSort(intervals,i,mid);
		mergeSort(intervals,mid+1,j);
		ArrayList<Interval> arry = new ArrayList<Interval>();
		int m = i;
		int n= mid+1;
		while(m<=mid&&n<=j){
			Interval left = intervals.get(m);
			Interval right = intervals.get(n);
			if(left.start<right.start||(left.start==right.start&&left.end<right.end)){
				arry.add(left);
				m++;
			}
			else {
				arry.add(right);
				n++;
			}
		}
		while(m<=mid){
			Interval left = intervals.get(m);
			arry.add(left);
			m++;
		}
		for(int k =0;k<arry.size();k++){           // arry is new, should start from 0
			intervals.set(i+k, arry.get(k));       // start from i
		}
	}
}
