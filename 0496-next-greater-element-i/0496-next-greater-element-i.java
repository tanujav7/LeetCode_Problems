class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int n = nums1.length;
        
        int m = nums2.length;
        
        int res[] = new int[n];
        
        for(int i=0; i<m; i++)
            map.put(nums2[i], i);
        
        for(int i=0; i<n; i++){
            boolean flag = false;
            for(int j=map.get(nums1[i])+1; j<m; j++){
                if(nums2[j]>nums1[i]){
                    res[i] = nums2[j];
                    flag = true;
                    break;
                }
            }
            
            if(flag==false)
                res[i] = -1;
        }
        
        return res;
    }
}