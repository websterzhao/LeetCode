package anode;

import java.util.Comparator;

public class myComparator implements Comparator<Interval> {

	@Override
	public int compare(Interval o1, Interval o2) {
		if(o1.start==o2.start)
			return 0;
		else if(o1.start>o2.start)
			return 1;
		else
			return -1;
	}

}
