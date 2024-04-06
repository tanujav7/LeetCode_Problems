class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> subsets(int[] nums) {
        resList = new ArrayList<>();
        backTrack(nums, 0, nums.length, new ArrayList<>());
        return resList;
    }
    
    void backTrack(int nums[], int i, int n, List<Integer> path){
        if(i==n){
            resList.add(new ArrayList<>(path));
            return;
        }
        
        else{
            path.add(nums[i]);
            backTrack(nums, i+1, n, path);
            path.remove(path.size()-1);
            backTrack(nums, i+1, n, path);
        }
    }
}