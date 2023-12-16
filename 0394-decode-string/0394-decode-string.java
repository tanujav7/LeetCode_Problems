class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        
        int num = 0;
        String res = "";
        
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch))
                num = num * 10 + (ch-'0');
            
            else if(ch=='['){
                numStack.push(num);
                strStack.push(res);
                num = 0;
                res = "";
            }
            
            else if(ch==']'){
                int k = numStack.pop();
                String str = strStack.pop();
                
                for(int j=0; j<k; j++)
                    str = str + res;
                
                res = str;
            }
            
            else{
                res += ch;
            }
        }
        
        return res;
    }
}