class Solution {
    public int heightChecker(int[] heights) {
        
        int res[] = heights.clone(); 
        Arrays.sort(res);
        int count = 0;
        
        for(int i=0; i<heights.length; i++){
            if(heights[i]!=res[i])
               ++count;
        }
        
         return count;
    }
}