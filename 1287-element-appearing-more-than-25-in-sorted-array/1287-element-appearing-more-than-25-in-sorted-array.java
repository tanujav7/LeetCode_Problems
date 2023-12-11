class Solution {
    public int findSpecialInteger(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        int totalCount = arr.length/4;
        
        for(int count : map.keySet()){
            if(map.get(count) > totalCount)
                return count;
        }
        
        return -1;
    }
}