package Lec29;

public class Intersection_of_Two_Linked_Lists {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
		 
		public class Solution {
		    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		    	
		    	ListNode D=headA;
		    	ListNode Dvgf=headB;
		    	while(D!=Dvgf) {
		    		if(D==null) {
		    			D=headB;
		    		}
		    		else {
		    			D=D.next;
		    		}
		    		if(Dvgf==null) {
		    			Dvgf=headA;
		    		}
		    		else {
		    			Dvgf=Dvgf.next;
		    		}
		    	}
		    	return D;
		        
		    }
		}
}
