class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return resList;
    }
    
    void backtrack(int nums[], int index, List<Integer> list){
        if(index==nums.length){
            resList.add(new ArrayList<>(list));
            return;
        }
        
        else{
            list.add(nums[index]);
            backtrack(nums, index+1, list);
            list.remove(list.size()-1);
            backtrack(nums, index+1, list);
        }
    }
}