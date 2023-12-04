class Solution {
    public String largestGoodInteger(String num) {
        
        int n = num.length();
        
        char maxDigit = '\0';
        
        for(int i=0; i<=n-3; i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2))
                maxDigit = (char) Math.max(maxDigit, num.charAt(i));
        }
        
        
        return maxDigit == '\0' ? "" : new String(new char[]{maxDigit, maxDigit, maxDigit});
        
    }
}