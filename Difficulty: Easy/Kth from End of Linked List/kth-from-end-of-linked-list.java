/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int find=size-k;
        temp=head;
        if(find<0) return -1;
        else{
        for(int i=0;i<find;i++){
            temp=temp.next;
        }
        return temp.data;
        }
    }
}