class Solution {
    public int[] findErrorNums(int[] nums) {
        // Approach 1 - Brute Force
        
       /* int duplicate = 0; 
        int missing = 0;
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
        
        return new int[]{duplicate, missing};
        
        */
        //Approach 2 - Better Brute Force
        
       /* int duplicate = 0; 
        int missing = 0;
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
        
        int dup = 0, missing = 1;
        
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] == nums[i - 1])
                dup = nums[i];
            else if (nums[i] > nums[i - 1] + 1)
                missing = nums[i - 1] + 1;
            
        }
        
        return new int[] {dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
        
    
        
        
        //Approach 4 - Using Extra Array
        
      /*  int n = nums.length;
        int arr[] = new int[n+1];
        int duplicate = -1; 
        int missing = 1;
        
        for(int i=0; i<n; i++)
            arr[nums[i]]++;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]==0)
                missing = i;
            else if(arr[i]==2)
                duplicate = i;
        }
        
        return new int[]{duplicate, missing};
        
        */
        // Approach - 5 -> Using Constant Space
        
        /* int duplicate = 0, missing = 0;
        
          int len = nums.length;
        
          for(int n : nums){
              
              if(nums[Math.abs(n)-1]<0)
                  duplicate = Math.abs(n);
              else
                  nums[Math.abs(n)-1] = -1 * nums[Math.abs(n)-1];
              
          }
        
        for(int i=0; i<len; i++){
            if(nums[i]>0)
                missing = i+1;
        }
        
        return new int[]{duplicate, missing};*/
        
      //  Approach 6: Using Map
        
        /* Map < Integer, Integer > map = new HashMap();
        int dup = 0, missing = 0;
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2)
                    dup = i;
            } else
                missing = i;
        }
        return new int[]{dup, missing};*/
    }
}