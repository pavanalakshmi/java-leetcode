package linked_lists;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class MergeSortedLists {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        ListNode result = mergeTwoLists(node1, node4);

        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempHead = new ListNode(0);
        ListNode p=list1, q=list2, current = tempHead;
        while(p!=null && q!=null){
            if(p.val <= q.val){
                current.next = p;
                p = p.next;
            }
            else{
                current.next =q;
                q=q.next;
            }
            current = current.next;
        }
        if(p!=null){
            current.next = p;
        }
        else{
            current.next = q;
        }
        return tempHead.next;
    }
}
