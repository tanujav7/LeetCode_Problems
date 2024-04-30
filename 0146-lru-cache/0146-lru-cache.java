class LRUCache {

    Map<Integer, Node> map = new HashMap<>();
    int capacity = 0;
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        
        else{
            return -1;
        }
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
            remove(map.get(key));
        if(capacity==map.size())
            remove(tail.prev);
        
        insert(new Node(key, value));
    }
    
    void remove(Node node){
        map.remove(node.key);
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    
    void insert(Node node){
        map.put(node.key, node);
        
        node.next = head.next;
        head.next = node;
        node.prev = head;
        node.next.prev = node;
    }
}


class Node{
    int key, val;
    Node next, prev;
    Node(int key, int val){
        this.key = key;
        this.val = val;
        next = null;
        prev = null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */