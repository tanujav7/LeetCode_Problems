class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      
        Set<Integer> set = new HashSet<>();
        
        for(int i:nums1){
            set.add(i);
        }
        
        Set<Integer> res = new HashSet<>();
       
        for(int j:nums2){
            if(set.contains(j))
                res.add(j);
        }
        
        int output[] = new int[res.size()];
        int index = 0;
        for(int k:res)
            output[index++] = k;
        
        return output;
    }
}