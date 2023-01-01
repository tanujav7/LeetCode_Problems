class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //For output
      HashSet <Integer> res = new HashSet<>();
        
      HashSet <Integer> set = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i]))
               res.add(nums2[i]);
           }
        
        //Converting the output (res which is a hashset) into array -> That's what the return type is specified
        
        int output[] = new int[res.size()];
        int j=0;
        //Copying the elements of Hashset to array using for each loop
        for(int k:res){
            output[j++] = k;
        }
        
        return output;
    }
}

