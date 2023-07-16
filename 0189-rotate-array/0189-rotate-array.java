class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k % n;
        reversalAlgorithm(nums, 0, n-1);
        reversalAlgorithm(nums, 0, k-1);
        reversalAlgorithm(nums, k, n-1);
        
    }
    
    void reversalAlgorithm(int arr[], int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}