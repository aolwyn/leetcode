
 
  class ListNode {
    int val;
     ListNode next;
    ListNode(int x) {
        val = x;
         next = null;
     }
 }

 class Solution {
    public boolean hasCycle(ListNode head) {
        //base case: 1 object, no cycle.
        if(head == null) return false;
        
        //two pointers to the head and second element;
        ListNode p1 = head;
        ListNode p2 = head.next;
        
        //while they do not equal, iterate through the Linked List.
        while(p1 != p2){
            if(p2 == null || p2.next == null) return false; //if p2 or the node after are null, return false.
                                                            //no need to check p1 as it will always be 'behind'
            //increment the 2 pointers.
            p1 = p1.next;
            p2 = p2.next.next;
        }     
        return true;
    }
}