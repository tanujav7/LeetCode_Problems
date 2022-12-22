class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        //The question to this problem is a bit unclear. Refer the notes.
        int count = 0;
        int j=0;
        for(int i=0; i<arr1.length; i++){
                
            for(j=0; j<arr2.length; j++){
                if((Math.abs(arr1[i]-arr2[j]))<=d)
                    break;
            }
            
            if(j==arr2.length)
                count++;
        }
        
        
        return count;
    }
}