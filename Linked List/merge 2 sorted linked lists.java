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
        //base cases: if 1 of them is null, its just the other list
        if(list1 == null && list2 != null) return list2;
        if(list2 == null && list1 != null) return list1;
        
        //create new list to be returned, have a head point to it
        ListNode result = new ListNode();
        ListNode head = result;
        
        //while both lists have something in it, compare the values. 
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
               result.next = list1;
               list1 = list1.next;
            }else{
              result.next = list2;
              list2 = list2.next;
            }
            
            result = result.next;
        }       
        
        if(list1!=null){
            result.next=list1;
        }else{
            result.next=list2;
        }
        
        return head.next;
        
    }
}
