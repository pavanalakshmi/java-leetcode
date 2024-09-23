package linked_lists;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(15);
        ListNode node4 = new ListNode(16);
        ListNode node5 = new ListNode(23);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        removeNthFromEnd(node1, 2);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);;
        dummyNode.next = head;
        ListNode ptr1 = dummyNode;
        ListNode ptr2 = dummyNode;

        // move 2nd pointer n spaces ahead; so we have a batch of n spaces now
        for(int i=0;i<n;i++){
            ptr2 = ptr2.next;
        }
        // move both now
        while(ptr2.next!=null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        //when 2nd ptr is null, remove 1 node
        ptr1.next = ptr1.next.next;
        return dummyNode.next;

    }
}
