class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        
    
        while(i>=0 || j>=0 || carry>0){
            
           int s1 = (i>=0) ? a.charAt(i)-'0' : 0;
            
           int s2 = (j>=0) ? b.charAt(j)-'0' : 0;     
            
           int sum = s1 + s2 + carry;
            
            sb.append(sum%2);
            
            carry = sum/2;
            
            if(i>=0)
                i--;
            
            if(j>=0)
                j--;
            
        }
        
        return sb.reverse().toString();
    }
}