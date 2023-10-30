class Solution {
    public String intToRoman(int num) {
        
        String res = "";
        String romanLiteral[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        for(int i=0; i<values.length; i++){
            while(num>=values[i]){
                num = num - values[i];
                res = res + romanLiteral[i];
            }
        }
            
        return res;
    }
}