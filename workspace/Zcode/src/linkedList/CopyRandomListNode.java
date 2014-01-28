package linkedList;

import java.util.HashMap;
import java.util.Map;

import anode.RandomListNode;


public class CopyRandomListNode {
	public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode itr= head;
        RandomListNode prev=null;
        Map<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
        while(itr!=null){
            RandomListNode nitr=new RandomListNode(itr.label);
            if(prev!=null)
                prev.next=nitr;
            prev=nitr;
            map.put(itr,nitr);
            itr=itr.next;
        }
        itr= head;
        while(itr!=null){
            map.get(itr).random=map.get(itr.random);
            itr=itr.next;
        }
        return map.get(head);
    }
}
