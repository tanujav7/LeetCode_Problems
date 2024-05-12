class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> subsets(int[] nums) {
        resList = new ArrayList<>();
        
        backTrack(nums, nums.length, 0, new ArrayList<>());
        return resList;
    }
    
    void backTrack(int nums[], int n, int i, List<Integer> list){
        if(i==n){
            resList.add(new ArrayList<>(list));
            return;
        }
        
        else{
            list.add(nums[i]);
            backTrack(nums, n, i+1, list);
            list.remove(list.size()-1);
             backTrack(nums, n, i+1, list);
        }
    }
}