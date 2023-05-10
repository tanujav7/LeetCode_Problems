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
        int n1 = mid+1-left;
        int n2 = right-mid;
        
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];
        
        for(int i=0; i<n1; i++)
            leftArr[i] = arr[i+left];
        
        for(int i=0; i<n2; i++)
            rightArr[i] = arr[mid+1+i];
        
        int i=0, j=0, k=left;
        
        while(i<n1 && j<n2){
            if(leftArr[i]<rightArr[j])
                arr[k++] = leftArr[i++];
            else
                arr[k++] = rightArr[j++];
        }
        
        while(i<n1)
            arr[k++] = leftArr[i++];
        
        while(j<n2)
            arr[k++] = rightArr[j++];
    }
}