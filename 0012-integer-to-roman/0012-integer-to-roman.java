class Solution {
    public String intToRoman(int num) {
         String arr[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        int nums[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        String res = "";
        
        for(int i=0; i<arr.length; i++){
            while(num>=nums[i]){
                res = res + arr[i];
                num = num-nums[i];
            }
        }
        
        return res;
    }
}