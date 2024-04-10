class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        
        int count0 = 0, count1 = 0, count2 = 0;
        
        for(int num : nums){
            switch(num){
                case 0 : count0++;
                    break;
                 case 1 : count1++;
                    break;
                 case 2 : count2++;
                    break;
            }
        }
        
        int k = 0;
        
        while(count0-->0){
            nums[k++] = 0;
        }
        
         while(count1-->0){
            nums[k++] = 1;
        }
        
         while(count2-->0){
            nums[k++] = 2;
        }
    }
}