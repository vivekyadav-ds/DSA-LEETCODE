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
        // ListNode head = tail;

        ListNode tail = head;
        int len = 1;

        if(head == null || head.next == null || k == 0){
            return head;
        }

        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        k = k % len;
        if(k == 0){
            return head;
        }else{
            tail.next = head;
        }
        ListNode newLastNode = findnthNode(head,len - k);
        head = newLastNode.next;
        newLastNode.next = null;
        return head;
    }
    public ListNode findnthNode(ListNode head ,int n){
         ListNode temp = head ;
        for(int i=1;i<n;i++){
            temp = temp.next;
        }
        return temp;
    }
}