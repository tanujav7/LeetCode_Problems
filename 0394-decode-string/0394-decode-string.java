class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();
        int num = 0;
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9')
                num = num*10 + (ch-'0');
            
            else if(ch==']'){
                int repeat = numStack.pop();
                String str = "";
                
                while(charStack.peek()!='['){
                    str = charStack.pop() + str;
                }
                
                charStack.pop();
                
                for(int j=0; j<repeat; j++){
                    for(int k=0; k<str.length(); k++)
                        charStack.push(str.charAt(k));
                }
            }
            
               else{
                if(num!=0)
                numStack.push(num);
                num = 0;
                charStack.push(ch);
            }
        }
        
        
        String result = "";
        while (!charStack.isEmpty()) {
            result = charStack.pop() + result;
        }
        return result;
        
    }
}