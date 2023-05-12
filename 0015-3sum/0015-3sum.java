class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i=0; i<n; i++){
            int j = i+1;
            int k = n-1;
            
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            while(j<k){
                if(k<n-1 && nums[k]==nums[k+1]){
                    k--;
                    continue;
                }
                
                else if(nums[i]+nums[j]+nums[k]<0)
                    j++;
                
                else if(nums[i]+nums[j]+nums[k]>0)
                    k--;
                
                else{
                    List<Integer> triples = new ArrayList<>();
                    triples.add(nums[i]);
                    triples.add(nums[j]);
                    triples.add(nums[k]);
                    result.add(triples);
                    j++;
                    k--;
                }
                    
            }
        }
        
        
        return result;
        
    }
}