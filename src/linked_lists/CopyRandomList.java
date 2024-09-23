package linked_lists;

import java.util.HashMap;

class NodeList {
    int val;
    NodeList next;
    NodeList random;
    NodeList(int val) { this.val = val; this.next = null; this.random = null; }
}

public class CopyRandomList {
    public static void main(String[] args) {
        NodeList node1 = new NodeList(7);
        NodeList node2 = new NodeList(13);
        NodeList node3 = new NodeList(11);
        NodeList node4 = new NodeList(10);
        NodeList node5 = new NodeList(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node1.random = null;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        NodeList output = copyRandomList(node1);
//        System.out.println(output);
        NodeList current = output;
        while(current!=null){
            String randomOutput = (current.random!=null) ? String.valueOf(current.random.val): "null";
            System.out.println("Node: "+current.val+" Random: "+randomOutput);
            current = current.next;
        }
        System.out.println();
    }
    // uses a 2 pass algorithm
    public static NodeList copyRandomList(NodeList head) {
        HashMap<NodeList , NodeList> copyMap = new HashMap<>();
        NodeList current = head;
        if(head == null) { return null; }
        NodeList copy;
        // pass 1
        while(current!=null) {
            copy = new NodeList(current.val);
            copyMap.put(current, copy);
            current = current.next;
        }
        // pass 2
        current = head;
        while(current!=null){
            copy = copyMap.get(current);
            copy.next = copyMap.get(current.next);
            copy.random = copyMap.get(current.random);
            current = current.next;
        }
        return copyMap.get(head);
    }
}
