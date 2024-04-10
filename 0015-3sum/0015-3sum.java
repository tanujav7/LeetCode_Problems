class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
 int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i=0; i<n; i++){
            
            int j=i+1;
            int k=n-1;
            
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            while(j<k){
                if(k<n-1 && nums[k]==nums[k+1])
                    k--;
                else if(nums[i]+nums[j]+nums[k]<0)
                    j++;
                else if(nums[i]+nums[j]+nums[k]>0)
                    k--;
                else{
                    List<Integer> triples = new ArrayList<>();
                    triples.add(nums[i]);
                    triples.add(nums[j]);
                    triples.add(nums[k]);
                    list.add(triples);
                    j++;
                    k--;
                }
            }
        }
        
        return list;
    }
}