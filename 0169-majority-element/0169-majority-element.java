class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        
        int midElement = nums[n/2];
        
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i]==midElement)
                count++;
        }
        
        return (count>(n/2)) ? midElement : 0;
    }
}