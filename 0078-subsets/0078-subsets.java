class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return resList;
    }
    
    void backtrack(int nums[], int index, List<Integer> list){
        if(nums.length==index){
            resList.add(new ArrayList<>(list));
        }
        
        else{
            list.add(nums[index]);
            backtrack(nums, index+1, list);
            list.remove(list.size()-1);
            backtrack(nums, index+1, list);
        }
    }
}