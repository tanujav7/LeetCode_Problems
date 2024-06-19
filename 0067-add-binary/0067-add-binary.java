class Solution {
    public String addBinary(String a, String b) {
        
        int i = a.length()-1;
        int j = b.length()-1;
        
        int carry = 0;
        
        String res = "";
        
        int n1 = 0, n2 = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(i>=0 || j>=0 || carry>0){
         
            n1 = (i>=0) ? (a.charAt(i--)-'0') : 0;
            
            n2 = (j>=0) ? (b.charAt(j--)-'0') : 0;
            
            int sum = n1 + n2 + carry;
            
            sb.append(sum%2);
            
            carry = sum / 2;
        }
        
        
        return sb.reverse().toString();
    }
}