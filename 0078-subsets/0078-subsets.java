class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> subsets(int[] nums) {
        resList = new ArrayList<>();
        int n = nums.length;
        backTrack(nums, n, 0, new ArrayList<>());
        return resList;
    }
    
    void backTrack(int nums[], int n, int i, List<Integer>path){
        if(i==n){
            resList.add(new ArrayList<>(path));
            return;
        }
        
        else{
            path.add(nums[i]);
            backTrack(nums, n, i+1, path);
            path.remove(path.size()-1);
            backTrack(nums, n, i+1, path);
        }
    }
}