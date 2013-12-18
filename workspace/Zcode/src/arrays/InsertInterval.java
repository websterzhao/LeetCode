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
	  
	  
	   public ArrayList<Interval> insert2(ArrayList<Interval> intervals, Interval newInterval) {
	        ArrayList<Interval> ret = new ArrayList<Interval>();
	        if(intervals==null||intervals.size()<1){
	            ret.add(newInterval);
	            return ret;
	        }
	        int i=0;  
	        boolean used=false;
	        while(i<intervals.size()){
	            boolean combin= false;
	            while(!used&&i<intervals.size()&&iscombin(intervals.get(i),newInterval)){
	                Interval itr=intervals.get(i);
	                newInterval.start=itr.start<newInterval.start?itr.start:newInterval.start;
	                newInterval.end=itr.end<newInterval.end?newInterval.end:itr.end;
	                combin=true;
	                i++;
	            }
	            if(combin&&!used){
	                ret.add(newInterval);
	                used=true;
	            }
	            else{
	                if(newInterval.end<intervals.get(i).start&&!used){
	                    ret.add(newInterval);
	                    used=true;
	                }
	                ret.add(intervals.get(i));
	                i++;
	            }
	        }    
	        if(!used)
	            ret.add(newInterval);
	        return ret;    
	    }
	    private boolean iscombin(Interval i1, Interval i2){
	        if(i1.start>i2.end||i1.end<i2.start)
	            return false;
	        return true;
	    }
}
