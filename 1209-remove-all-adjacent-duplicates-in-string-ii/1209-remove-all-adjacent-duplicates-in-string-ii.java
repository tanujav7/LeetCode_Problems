class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Node> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().ch==c){
                if(++stack.peek().count==k)
                    stack.pop();
            }
            else{
                stack.push(new Node(c, 1));
            }
        }
        
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            Node curr = stack.pop();
            char ch = curr.ch;
            int n = curr.count;
            
            for(int i=1; i<=n; i++)
                sb.append(ch);
        }
        
        
        return sb.reverse().toString();
    }
}

class Node{
    char ch;
    int count;
    Node(char ch, int count){
        this.ch = ch;
        this.count = count;
    }
}