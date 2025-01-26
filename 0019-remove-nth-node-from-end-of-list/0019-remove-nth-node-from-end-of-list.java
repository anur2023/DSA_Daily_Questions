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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null || head == null) return null;
        int count = 0;
        ListNode temp = head;
        ListNode pre = head;
        while(temp != null){
            count+=1;
            temp = temp.next;
        }

        int back = count-n;
        if(back == 0) {
           return head.next;
        }
       
        temp = head;
        for(int i = 0;i<back-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}