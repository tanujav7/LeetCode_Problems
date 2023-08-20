class Solution {
    public boolean checkZeroOnes(String s) {
        
         String[] string = s.split(""); // Split the input string into substrings

        int nums[]= new int[string.length]; // Initialize an array to store integers

        for (int i = 0; i<nums.length; i++) {
            nums[i] = Integer.parseInt(string[i]); 
        }

        int longestOnes = 0;
        int n = nums.length;
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i]==1)
                count++;
            else{
                longestOnes = Math.max(longestOnes, count);
                count = 0;
            }
        }
        
        int maxCountOnes = Math.max(longestOnes, count);
        
       int longestZeros = 0;
       count = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i]==0)
                count++;
            else{
                longestZeros = Math.max(longestZeros, count);
                count = 0;
            }
        }
        
        int maxCountZeros = Math.max(longestZeros, count);
        
        if(maxCountOnes>maxCountZeros)
            return true;
        
        else
            return false;
    }
}