class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
       
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){

        //Two-sum
        int j=i+1;
        int k=nums.length-1;
            
           if(i>0 && nums[i]==nums[i-1])
              continue;
            
        while(j<k){
            
            if(k < (nums.length - 1) && nums[k] == nums[k + 1]) {
                   k--;
                   continue;
               }
            
            if(nums[i]+nums[j]+nums[k]<0)
                j++;
            
            else if(nums[i]+nums[j]+nums[k]>0)
                k--;
            
            else{
                
                List<Integer> triples = new ArrayList<Integer>();
                triples.add(nums[i]);
                triples.add(nums[j]);
                triples.add(nums[k]);
                Collections.sort(triples);
            
                j++;
                k--;
                
                result.add(triples);
            }
                
        }
        
        
        }
    
        
        return result;
        
    }
}