package linkedList;

import anode.ListNode;

public class PartitionList {
	   public ListNode partition2(ListNode head, int x) {
	        // Note: The Solution object is instantiated only once and is reused by each test case.
	        if(head==null) return null;
	        ListNode p1=null;
	        ListNode prev1=null;
	        ListNode p2=null;
	        ListNode prev2=null;
	        ListNode itr=head;
	        while(itr!=null){
	            if(itr.val<x){
	              if(prev1!=null)
	                prev1.next=itr;
	              prev1=itr;
	              if(p1==null)
	                p1=prev1;
	            }
	            else{
	              if(prev2!=null)
	                prev2.next=itr;
	              prev2=itr;
	              if(p2==null)
	                p2=prev2; 
	            }
	            itr=itr.next;
	        }
	        if(p1==null) return p2;
	        prev1.next=p2;
	        return p1;
	        
	    }
    public ListNode partition(ListNode head, int x) {
    	if(head==null) return null;
    	ListNode itr = head;
    	ListNode p1 =null;
    	ListNode p2 = null;
    	while(itr!=null){
    		ListNode temp = itr.next;
    		if(itr.val<x){
    		   itr.next= p1;
    		   p1=itr;
    		}
    		else{
    		   itr.next= p2;
     		   p2=itr;
    		}   			
    		itr=temp;
    	}
    	p1=ReverseLinkedList2(p1);
    	p2=ReverseLinkedList2(p2);
    	if(p1==null) return p2;
    	ListNode ret=p1;
    	if(p1!=null){
    		while(p1!=null&&p1.next!=null){
    			p1=p1.next;
    		}
    		p1.next=p2;
    	}
    	return ret;
    }
    
	private ListNode ReverseLinkedList2(ListNode head){
		if(head==null) return null;
		ListNode cur = head;
		ListNode prev = null;
		while(cur!=null){
			ListNode next = cur.next;
			cur.next = prev;
			prev = cur;
			cur= next;			
		}		
		return prev;
	}	
}
