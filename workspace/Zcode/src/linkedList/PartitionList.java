package linkedList;

import anode.ListNode;

public class PartitionList {
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
