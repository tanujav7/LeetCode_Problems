/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Map<Node, Node> map = new HashMap<>();
        
        Node currentNode = head;
        
        while(currentNode!=null){
            map.put(currentNode, new Node(currentNode.val));
            currentNode = currentNode.next;
        }
        
        currentNode = head;
        
        while(currentNode!=null){
            map.get(currentNode).next = map.get(currentNode.next);
            map.get(currentNode).random = map.get(currentNode.random);
            currentNode = currentNode.next;
        }
        
        return map.get(head);
    }
}