class Solution {
    public void sortColors(int[] nums) {
        
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<nums.length; i++){
            switch(nums[i]){
            
                case 0 : count0++;
                    break;
                case 1 : count1++;
                    break;
                case 2 : count2++;
                    break;
            }
        }
        
        int k = 0;
        
        while(count0-->0)
            nums[k++] = 0;
        
        while(count1-->0)
            nums[k++] = 1;
        
        while(count2-->0)
            nums[k++] = 2;
    }
}