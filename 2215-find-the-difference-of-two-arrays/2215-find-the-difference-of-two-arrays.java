class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
      
        return Arrays.asList(getDifference(nums1,nums2), getDifference(nums2,nums1));
        
        
    }
    
    List<Integer> getDifference(int arr1[], int arr2[]){
        
        Set<Integer> set1 = new HashSet<>();
        
        Set<Integer> set2 = new HashSet<>();
        
        for(int n : arr2)
            set2.add(n);
        
        for(int i=0; i<arr1.length; i++){
            if(!set2.contains(arr1[i]))
                set1.add(arr1[i]);
        }
        
        
        return new ArrayList<>(set1);
    }
}