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
        if(head.next==null)return  null;
        int size=0;
        ListNode curr=head;
        while(curr!=null){
         size++;
         curr=curr.next;
        }
        n=n%size;
        if(n==0)return head.next;
        ListNode s=head;
        ListNode f=head;
        for(int i=1;i<=n;i++)f=f.next;
        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        s.next=s.next.next;
        return head;

    }
}