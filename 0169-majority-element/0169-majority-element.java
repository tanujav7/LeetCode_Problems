class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        
        int count = 0;
        int majorityElement = nums[n/2];
        
        for(int i=0; i<n; i++){
            if(nums[i]==majorityElement)
                count++;
        }
        
        return (count>(n/2)) ? majorityElement : 0;
    }
}