class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int duplicate = 0, missing = 0;
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for(int i=1; i<=n; i++){
            if(map.containsKey(i)){
                if(map.get(i)==2)
                    duplicate = i;
            }
            
            else{
                missing = i;
            }
                
        }
        
        return new int[]{duplicate, missing};
    }
}