package anode;

public class Interval implements Comparable<Interval>{
    public int start;
    public int end;
    Interval() { start = 0; end = 0; }
    public Interval(int s, int e) { start = s; end = e; }

	@Override
	public int compareTo(Interval o) {
		return this.start- o.start;		  
	}
}
