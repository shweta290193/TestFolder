package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class CycleLinkedListLeetcode142 {

	public static void main(String[] args) {
		/*ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		head.next.next.next.next.next=head.next.next;*/
		
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=head;
		
		
		ListNode res=detectCycle(head);
		System.out.println("res: "+res.data);
	}
	
public static ListNode detectCycle(ListNode head) {
	
Set<ListNode> visited=new HashSet<>();
	
	ListNode current=head;
	
	while(current!=null)
	{
		if(visited.contains(current))
		{
			return current;
		}
		else
			visited.add(current);
		
		current=current.next;
	}
	
	/*
	 * for(ListNode l : visited) System.out.println(l);
	 */
	
	//return false;
	
	return null;
        
    }

}
