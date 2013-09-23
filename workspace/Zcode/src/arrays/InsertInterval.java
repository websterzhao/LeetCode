package arrays;

import java.util.ArrayList;
import anode.Interval;

public class InsertInterval {
	  public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
	    	 if(newInterval==null) return intervals;
	         ArrayList<Interval> ret = new ArrayList<Interval>();
	         if(intervals==null||intervals.size()==0){
	             ret.add(newInterval);
	             return ret;
	         }
	         boolean isused = false;
			 int beg = newInterval.start;
			 int end = newInterval.end;
			 int i = 0;
			 for(;i<intervals.size();i++){
				 int curend = intervals.get(i).end;
				 int curbeg = intervals.get(i).start;
				 if(end<curbeg){
					 ret.add(new Interval(beg,end));  //must use new, since beg or end may change
	                 isused = true;
					 break;
				 }else if(curend<beg)
	    		     ret.add(intervals.get(i));				 
				 else{
					 beg = beg<curbeg?beg:curbeg;
					 end = end>curend?end:curend;
	                 isused = true;
	                 if(i==intervals.size()-1)
	                    ret.add(new Interval(beg,end));
				 }				 
			 }
			 while(i<intervals.size()){
				 ret.add(intervals.get(i));
				 i++;
			 }
	         if(!isused)
	             ret.add(newInterval);
		     return ret;   
		    }
}
