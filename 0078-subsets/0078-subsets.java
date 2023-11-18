class Solution {
    
    List<List<Integer>> resList = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(nums, 0, new ArrayList<>());
        return resList;
    }
    
    void backTrack(int nums[], int index, List<Integer> list){
        
        if(index==nums.length){
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