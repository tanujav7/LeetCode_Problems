class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int duplicate = -1, missing = -1;
        int n = nums.length;
        
        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[j]==i)
                    count++;
            }
            if(count==2)
                duplicate = i;
           else if(count==0)
                missing = i;
        
            else if(duplicate>0 && missing>0)
                break;
        }
        
        
        return new int[]{duplicate, missing};
    }
}