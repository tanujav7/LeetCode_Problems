class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n; i++){
            int j = i+1;
            int k = n-1;
            if(i>0 && nums[i]==nums[i-1])
               continue;

            while(j<k){
                if(k<n-1 && nums[k]==nums[k+1]){
                    k--;
                   // continue;
                }

                else if(nums[i]+nums[j]+nums[k] < 0)
                j++;

                else if(nums[i]+nums[j]+nums[k] > 0)
                k--;

                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    res.add(list);
                }
            }
        }

        return res;
    }
}