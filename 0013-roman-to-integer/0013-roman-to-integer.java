class Solution {
    public int romanToInt(String s) {
        
        int i = 0;
        int n = s.length();
        
        int nums[] = new int[n];
        
        for(char ch : s.toCharArray()){
            switch(ch){
                case 'I' : nums[i++] = 1;
                    break;
                case 'V' : nums[i++] = 5;
                    break;
                case 'X' : nums[i++] = 10;
                    break;
                case 'L' : nums[i++] = 50;
                    break;    
                case 'C' : nums[i++] = 100;
                    break;
                case 'D' : nums[i++] = 500;
                    break;
                case 'M' : nums[i++] = 1000;
                    break;
            }
        }
        
        int sum = 0;
        
        for(int j=0; j<n-1; j++){
            if(nums[j+1]>nums[j])
                sum = sum - nums[j];
            else
                sum = sum + nums[j];
        }
        
        return sum + nums[n-1];
    }
}