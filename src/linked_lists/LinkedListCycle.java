package linked_lists;

//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }
//  }

public class LinkedListCycle {
    int val;
    LinkedListCycle next;

    public LinkedListCycle(int val) {
        this.val = val;
        this.next = next;
    }
    
    public static void main(String[] args) {
        LinkedListCycle node1 = new LinkedListCycle(1);
        LinkedListCycle node2 = new LinkedListCycle(2);
        LinkedListCycle node3 = new LinkedListCycle(3);
        LinkedListCycle node4 = new LinkedListCycle(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        // creating cycle
        node4.next = node2;

        LinkedListCycle current = node1;
//        int count=0; // && count<5
//        while(current != null){
//            System.out.println("Current value: ->" +current.val);
//            current=current.next;
//            count++;
//        }
        System.out.println(hasCycle(current));
    }
    public static boolean hasCycle(LinkedListCycle head) {
        /**
         * Floyd's Cycle Detection Algorithm (also called the Tortoise and Hare algorithm).
         * This algorithm is used to detect if a linked list has a cycle, i.e., if there is a sequence of nodes in the list
         * where the last node points back to one of the previous nodes, forming a loop.
         */
        if (head == null || head.next == null) {
            return false;
        }
        LinkedListCycle slow = head;
        LinkedListCycle fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow by 1 step
            fast = fast.next.next;    // Move fast by 2 steps

            if (slow == fast) {
                return true;  // Cycle detected if both point to same node
            }
        }
        return false;
    }
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
