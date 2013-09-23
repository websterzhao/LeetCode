package linkedList;

import anode.ListNode;

public class RotateRight {
    public ListNode rotateRight(ListNode head, int n) {
        if(head==null) return null;
        ListNode tail=head;
        int k=1;
        while(tail.next!=null){
        	tail=tail.next;
        	k++;
        }
        n=n%k;
        ListNode itr=head;
        n=k-n;
        while(n-->1){
        	itr=itr.next;
        }
  
        tail.next=head;
        ListNode newhead = itr.next;      
        itr.next=null;
        return newhead;	        
    }
}
