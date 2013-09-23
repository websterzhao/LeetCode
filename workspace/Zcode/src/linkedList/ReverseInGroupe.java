package linkedList;

import anode.ListNode;

public class ReverseInGroupe {

	public ListNode swapPairs(ListNode head, int n) {
         ListNode cur=head;
         ListNode prev=null;
         ListNode ret = null;
         while(true){
        	 ListNode nhead =cur;
        	 int i =n;
             while(i>1 && cur!=null){
                 cur= cur.next;
                 i--;
              }
             if(cur==null) break;
             ListNode temp= cur.next;
             swap(nhead, n);
             if(ret==null)
            	 ret=cur;
             else
            	 prev.next=cur;
             prev=nhead;
             cur=temp;            
         }
         return ret==null?head:ret;   
	}

	private void swap(ListNode head, int n) {
		ListNode prev = null;
		ListNode itr = head;
		while(n-->0){
			ListNode temp1 = itr.next;
			itr.next= prev;
			prev= itr;
			itr = temp1;
		}
		head.next=itr;  //���������ϣ���Ϊ�п��ܲ��ᷴת
	}
}
