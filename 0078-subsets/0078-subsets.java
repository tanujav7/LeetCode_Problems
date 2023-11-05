class Solution {
        List<List<Integer>> resList = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        backTrack(nums, 0, list);
        return resList;
    }
    
    void backTrack(int nums[], int index, List<Integer> list){
        if(index>=nums.length){
            resList.add(new ArrayList<>(list));
            return;
        }
        
        else{
            list.add(nums[index]);
            backTrack(nums, index+1, list);
            list.remove(list.size()-1);
            backTrack(nums, index+1, list);
        }
    }
}