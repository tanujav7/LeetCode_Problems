class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
   //For output
      HashSet <Integer> res = new HashSet<>();
        
      Arrays.sort(nums1);
      Arrays.sort(nums2);
        
    //Two pointer initialization
        
        int i=0;
        int j=0;
        
        while(i<nums1.length && j<nums2.length){
           
            if(nums1[i]==nums2[j]){
                res.add(nums1[i]);
                i++;
                j++;
            }
            
            else if(nums1[i]<nums2[j]){
                i++;
            }
            
            else{
                j++;
            }
        }
        
        int output[] = new int[res.size()];
        int index=0;
        //Copying the elements of Hashset to array using for each loop
        for(int k:res){
            output[index++] = k;
        }
        
        return output;
    }
}