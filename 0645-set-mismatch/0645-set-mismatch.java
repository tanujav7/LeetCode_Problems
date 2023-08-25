class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int duplicate = 0, missing = 0;
        
        int n = nums.length;
        
        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(i==nums[j]){
                    count++;
                }
            }
            
            if(count==0)
                missing = i;
            
            else if(count==2)
                duplicate = i;
            
            if(missing>0 && duplicate>0)
                break;
        }
        
        return new int[]{duplicate, missing};
    }
}