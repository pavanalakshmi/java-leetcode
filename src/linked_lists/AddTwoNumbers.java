package linked_lists;

// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        ListNode result = addTwoNumbers(node1, node4);

        StringBuilder resultStr = new StringBuilder();
        while(result!=null){
            resultStr.insert(0, result.val);
            result=result.next;
        }
        System.out.println(resultStr);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempHead = new ListNode(0);
        ListNode p=l1, q=l2, current = tempHead;
        int carry_val=0;
        while(p!=null || q!=null){
            int x = (p!=null) ? p.val : 0;
            int y = (q!=null) ? q.val : 0;
            int sum = carry_val+x+y;
            carry_val=sum/10;
            current.next=new ListNode(sum%10);
            current = current.next;

            if (p != null) p=p.next;
            if (q != null) q=q.next;
        }
        if(carry_val>0){
            current.next = new ListNode(carry_val);
        }
        return tempHead.next;
    }
}



//        Stack<Integer> list = new Stack<>();
//
//        while(current != null){
//            list.push(current.val);
//            current=current.next;
//        }
//        int n=list.size();
//        for(int i=0;i<n;i++){
//            list1.append(list.pop());
//        }
//        System.out.println(list1);
