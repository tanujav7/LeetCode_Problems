class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        backTrack(nums, 0, n, new ArrayList<>());
        return resList;
    }
    
    void backTrack(int nums[], int ind, int n, List<Integer> list){
        if(ind==n){
            resList.add(new ArrayList<>(list));
            return;
        }
        
        else{
            list.add(nums[ind]);
            backTrack(nums, ind+1, n, list);
            list.remove(list.size()-1);
            backTrack(nums, ind+1, n, list);
        }
    }
}