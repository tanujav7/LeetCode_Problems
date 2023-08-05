class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        int res[] = new int[n1];
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n2; i++)
            map.put(nums2[i],i);
        
        int k = 0;
        int j = 0;
        for(int i=0; i<n1; i++){
            for(j=map.get(nums1[i])+1; j<n2; j++){
                if(nums1[i]<nums2[j]){
                    res[k++] = nums2[j];
                    break;
                }
            }
            
            if(j==n2)
                res[k++] = -1;
        }
        
        
        return res;
    }
}