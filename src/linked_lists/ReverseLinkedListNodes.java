package linked_lists;

class  Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val,  Node next) { this.val = val; this.next = next; }
}

public class ReverseLinkedListNodes {
    public static void main(String[] args) {
        Node node1 = new  Node(1);
        Node node2 = new  Node(2);
        Node node3 = new  Node(3);
        Node node4 = new  Node(4);
        Node node5 = new  Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Node output = reverseBetween(node1, 2,4);
        Node current = output;
        while(current!=null){
            System.out.println("Node: "+current.val);
            current = current.next;
        }
        System.out.println();
    }
    public static Node reverseBetween(Node head, int left, int right) {
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node leftPrevious = dummyNode;
        Node currentNode = head;

        for(int i=0;i<left-1;i++){
            leftPrevious = leftPrevious.next;
            currentNode = currentNode.next;
        }

        Node subList = currentNode;
        Node previousNode = null;

        for(int i=0;i<=right-left;i++){
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        leftPrevious.next = previousNode;
        subList.next = currentNode;
        return dummyNode.next;
    }

    public Node reverseNode(Node head){
        Node preNode = null;
        Node currNode = head;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        head = preNode;
        return head;
    }
}
