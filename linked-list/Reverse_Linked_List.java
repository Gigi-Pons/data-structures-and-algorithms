/**
This code flips a linked list backwards so that the last node becomes the first. 
It walks through the list one node at a time, and for each one, it turns the arrow 
to point the opposite way. By the end, it returns the new head of the reversed list.
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        //We will need two pointers, one to hold the previous
        //and one to hold the head value
        ListNode prev = null;
        ListNode curr = head;

        //We need a while loop that will iterate through the whole linked list
        while(curr != null) {
            //We need to declare a temp variable that will hold the most next memory slot
            ListNode temp = curr.next;
            //reverse the current link
            curr.next = prev;
            //now that the current is pointing to the left, move up prev
            prev = curr;
            //move current to the next node using the memory address in temp
            curr = temp;
        }
        //once we reach the end of the linked list, we will have the head
        return prev;
    }
}
