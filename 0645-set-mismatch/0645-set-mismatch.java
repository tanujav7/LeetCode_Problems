class Solution {
    public int[] findErrorNums(int[] nums) {
        // Approach 1 - Brute Force
        
      /*  int duplicate = -1; 
        int missing = -1;
        int n = nums.length;
        
        for(int i=1; i<=n; i++){
            
            int count = 0;      
            for(int j=0; j<n; j++){
                if(i==nums[j])
                    count++;
            }
            
            if(count==0)
                missing = i;
            
            if(count==2)
                duplicate = i;
            
        }
        
        return new int[]{duplicate, missing};*/
        
        
        //Approach 2 - Better Brute Force
        
      /*  int duplicate = -1; 
        int missing = -1;
        int n = nums.length;
        
        for(int i=1; i<=n; i++){
            
            int count = 0;      
            for(int j=0; j<n; j++){
                if(i==nums[j])
                    count++;
            }
            
            if(count==0)
                missing = i;
            
            if(count==2)
                duplicate = i;
            
            if(missing>0 && duplicate>0)
                break;
        }
        
        return new int[]{duplicate, missing};
        
        */
        
        //Approach 3 - Sorting
        
        Arrays.sort(nums);
        int dup = -1, missing = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                dup = nums[i];
            else if (nums[i] > nums[i - 1] + 1)
                missing = nums[i - 1] + 1;
        }
        return new int[] {dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
   
    }
}