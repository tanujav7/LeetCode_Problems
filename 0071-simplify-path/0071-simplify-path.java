class Solution {
    public String simplifyPath(String path) {
        
     String arr[] = path.split("/");
     Stack<String> stack = new Stack<>();
        
    for(int i=0; i<arr.length; i++){
        if(arr[i].equals("") || arr[i].equals("."))
            continue;
        
        else if(arr[i].equals("..")){
            if(!stack.empty())
                stack.pop();
        }
        
        else
            stack.push(arr[i]);
            
    }
    
   
        if(stack.empty())
            return "/";
        
        String res = "";
        while(!stack.empty())
            res = "/" + stack.pop() + res;
        
        return res;
    }
}