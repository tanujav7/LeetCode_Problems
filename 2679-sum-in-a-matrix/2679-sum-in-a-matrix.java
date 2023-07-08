class Solution {
    public int matrixSum(int[][] nums) {
        
        int max = 0;
        int sum = 0;

         for (int[] row : nums)
            Arrays.sort(row);

        
      	for(int i=0; i<nums[0].length; i++){
            int column_sum = 0;
		    for(int j=0; j<nums.length; j++){
                column_sum = Math.max(column_sum,nums[j][i]);
            }
            
            sum+=column_sum;
        }
        
        return sum;
    }
}