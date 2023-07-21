class Solution {
    public int[] findErrorNums(int[] nums) {
        //Approach 1 with better solution
        //Approach 4
        //Approach 5
    /*    int dup = -1, missing = 1;
        for (int n: nums) {
            if (nums[Math.abs(n) - 1] < 0)
                dup = Math.abs(n);
            else
                nums[Math.abs(n) - 1] *= -1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0)
                missing = i + 1;
        }
        return new int[]{dup, missing};*/
        
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;
        
        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(i==nums[j])
                    count++;
            }
            
            if(count==2)
                duplicate = i;
            if(count==0)
                missing = i;
        }
        
        return new int[] {duplicate, missing};
    }
}