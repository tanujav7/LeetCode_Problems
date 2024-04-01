class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> subsets(int[] nums) {
        resList = new ArrayList<>();
        backTrack(nums, 0, new ArrayList<>());
        return resList;
    }
    
    void backTrack(int nums[], int i, List<Integer> list){
        if(i==nums.length){
            resList.add(new ArrayList<>(list));
            return;
        }
        
        else{
            list.add(nums[i]);
            backTrack(nums, i+1, list);
            list.remove(list.size()-1);
            backTrack(nums, i+1, list);
        }
    }
}