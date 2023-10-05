class Solution {
    public List<Integer> majorityElement(int[] nums) {
              int n = nums.length;
        int m = n/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list= new ArrayList<>();
        for(int num : nums){
          map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
          if(map.get(key)>m){
            list.add(key);
          }
        }
      return list;
    }
}