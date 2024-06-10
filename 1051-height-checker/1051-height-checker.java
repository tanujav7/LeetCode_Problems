class Solution {
    public int heightChecker(int[] heights) {
        
        int n = heights.length;
        int arr[] = new int[n];
        
        int k = 0;
        
        for(int num : heights){
            arr[k++] = num;
        }
        
        
        Arrays.sort(arr);
        
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(heights[i]!=arr[i]){
                count++;
            }
        }
        
        
        return count;
    }
}