class Solution {
    public String largestNumber(int[] nums) {
        
        int n = nums.length;
        
        String arr[] = new String[n];
        
        for(int i=0; i<n; i++)
            arr[i] = String.valueOf(nums[i]);
        
        Arrays.sort(arr,(a,b)->{
           
            double v1 = Double.parseDouble(a+b);
            double v2 = Double.parseDouble(b+a);
            
            if(v1>v2)
                return 1;
            else if(v1<v2)
                return -1;
            else
                return 0;
        });
        
        StringBuilder str = new StringBuilder();
        
        for(int i=n-1; i>=0; --i)
            str.append(arr[i]);
        
        if(str.charAt(0)=='0')
            return "0";
        
        return str.toString();
    }
}