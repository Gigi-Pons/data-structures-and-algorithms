/**
 This algorithm merges two sorted linked lists into a single sorted linked list by comparing values one node at a time. 
 It uses a dummy starter node to simplify the merge process and builds the new list by attaching the smaller node at each step. 
 The final result skips the dummy node and returns the actual head of the merged list.
*/

 

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //create a new linkedlist with 0 as a value
        ListNode newList = new ListNode(0);
        //assign the head to node variable
        ListNode node = newList;

        //while loop will iterate through both of lists given, until one or both are empty
        while(list1 != null && list2 != null) {
            //check if the value in list1 is smaller than the value in list2
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        //once loop ends is because either one of the lists is empty or both.  But we must check if this is true
        if (list1 != null) {
            node.next = list1;
        } 
        if (list2 != null) {
            node.next = list2;
        }

        //return the head of the list pointing to the first real node
        return newList.next;
    }
}






