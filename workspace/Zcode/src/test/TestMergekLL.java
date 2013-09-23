package test;

import java.util.ArrayList;

import anode.ListNode;
import linkedList.MergekSortedLists;


public class TestMergekLL {

	public static void main(String[] args) {
		MergekSortedLists rl= new MergekSortedLists();
		ArrayList<ListNode> lists =new ArrayList<ListNode>();	
        ListNode l1= new ListNode(0);
        ListNode l2= new ListNode(2);
        ListNode l3= new ListNode(5);
        l1.next=l2;
        l2.next=l3;
		lists.add(l1);
		ListNode ret= rl.mergeKLists(lists);
		while(ret!=null){
			System.out.println(ret.val);
			ret=ret.next;
		}
	}
}
