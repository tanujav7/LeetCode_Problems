import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        
        int maxSum = Integer.MIN_VALUE;
        
        int n = nums.length;
        
        int arr[] = new int[n/2];
        
        for(int i = 0; i < n/2; i++){
            arr[i] = nums[i] + nums[n - i - 1];
        }
        
        for(int i = 0; i < arr.length; i++){
            maxSum = Math.max(arr[i], maxSum);
        }
        
        return maxSum;
    }
}
