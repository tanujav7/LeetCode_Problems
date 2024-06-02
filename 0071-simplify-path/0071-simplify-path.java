class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();
        
        String arr[] = path.split("/");
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i].equals("") || arr[i].equals("."))
                continue;
            
            else if(arr[i].equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
            }
            
            else
                stack.push(arr[i]);
        }
        
        if(stack.isEmpty())
            return "/";
        
        
        String res = "";
        
        while(!stack.isEmpty()){
            res = "/" + stack.pop() + res;
        }
        
        return res;
        
    }
}