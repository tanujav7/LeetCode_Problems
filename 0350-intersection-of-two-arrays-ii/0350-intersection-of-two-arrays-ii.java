class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        List<Integer> list = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0, j=0;
        
        while(i<m && j<n){
            
           if(nums1[i]==nums2[j]){
               list.add(nums1[i]);
               i++;
               j++;
           }
            
            else if(nums1[i]<nums2[j])
                i++;
            
            else
                j++;
            
        }
        
        int output[] = new int[list.size()];
        int index = 0;
        
        for(int k : list)
            output[index++] = k;
        
        return output;
    }
}