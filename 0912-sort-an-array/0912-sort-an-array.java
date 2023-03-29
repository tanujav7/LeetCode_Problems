class Solution {
    public int[] sortArray(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        mergeSort(nums,left,right);
        return nums;
    }
    
    void mergeSort(int arr[], int left, int right){

        if(left>=right)
            return;
        
        int mid = left+(right-left)/2;
        
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);

    }
    
    void merge(int arr[], int left, int mid, int right){

        int n1 = mid-left+1;
        int n2 = right-mid;
        
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];
        
        
        for(int i=0; i<n1; i++)
            leftArray[i] = arr[i+left];
        
        for(int i=0; i<n2; i++)
            rightArray[i] = arr[mid+1+i];
        
        int i = 0;
        int j = 0;
        int k = left;
        
        
        while(i<n1 && j<n2){

            if(leftArray[i]<=rightArray[j])
                arr[k++] = leftArray[i++];
            
            else
                arr[k++] = rightArray[j++];
            
        }
    
        
        while(i<n1)
            arr[k++] = leftArray[i++];
        
        while(j<n2)
            arr[k++] = rightArray[j++];
    }
}