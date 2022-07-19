/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //3 base cases: both are null, 1 is null x2
        if(list1 == null && list2 == null) return null;
        if(list2 == null && list1 != null) return list1;
        if(list1 == null && list2 != null) return list2;
        
        //create the returned list
        ListNode result = new ListNode();
        ListNode head = result;
        
        
        while(list1 != null && list2 != null){
            //case 1 & 2: either value is less than the other. or if theyre equal, default to certain list.
            if(list1.val<list2.val){
                result.next = list1;
                list1 = list1.next;
            }else{
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }//close while
        
        //now that exited, append the remaining numbers.
        if(list1 == null){
            result.next = list2;
        }
        if(list2 == null){
            result.next = list1;
        }
        //return 
        return head.next;
    }
}