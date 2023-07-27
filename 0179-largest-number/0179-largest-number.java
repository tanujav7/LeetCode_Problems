class Solution {
    public String largestNumber(int[] nums) {
        
                
        String str[] = new String[nums.length];
        
        for(int i=0; i<str.length; i++){
            str[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(str,(a,b) -> {

            double v1 = Double.parseDouble(a+b);
            double v2 = Double.parseDouble(b+a);
            
            if(v1>v2)
                return 1;
            
            else if(v1<v2)
                return -1;
            
            else
                return 0;
            
    
        });
        
        StringBuilder res = new StringBuilder();
        
        for(int i=str.length-1; i>=0; --i){
            res.append(str[i]);
        }
        
        if(res.charAt(0)=='0')
            return "0";
        
        return res.toString();
    }
}