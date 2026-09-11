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
    public ListNode rotateRight(ListNode head, int k) {
        int N = 0;
        ListNode temp = head;
        while(temp != null){
            N++;
            temp = temp.next;
        }
        if(N == 0) return head;
        k = k%N;
        if(N == 0 || k == 0) return head;
        int traverse = N-k;
        ListNode left = head;
        ListNode right = head;
        for(int i=1;i<traverse;i++){
            left = left.next;
            right = right.next;
        }
        
        right = right.next;
        left.next = null;
        temp = right;
        while(right.next != null){
            right = right.next;
        }
        right.next = head;
        return temp;

    }
}