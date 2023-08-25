class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int n = nums.length;
        int arr[] = new int[n+1];
        int duplicate = 0, missing = 0;
        
        for(int i=0; i<n; i++)
            arr[nums[i]]++;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]==0)
                missing = i;
            
            else if(arr[i]==2)
                duplicate = i;
        }
        
        return new int[]{duplicate, missing};
    }
}