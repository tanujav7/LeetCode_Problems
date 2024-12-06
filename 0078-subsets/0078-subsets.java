class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        backTrack(nums, 0, n, new ArrayList<>());
        return resList;
    }
    
    void backTrack(int nums[], int i, int n, List<Integer> list){
        if(i==n){
            resList.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[i]);
        backTrack(nums, i+1, n, list);
        list.remove(list.size()-1);
        backTrack(nums, i+1, n, list);
    }
}