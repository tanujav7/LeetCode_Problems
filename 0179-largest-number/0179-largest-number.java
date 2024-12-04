class Solution {
    public String largestNumber(int[] nums) {
        
        int n = nums.length;
        
        String arr[] = new String[n];
        
        for(int i=0; i<n; i++){
            arr[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(arr, (s1, s2)->(s2+s1).compareTo((s1+s2)));
        
        StringBuilder sb = new StringBuilder();
        
        for(String s:arr){
            sb.append(s);
        }
        
        if(arr[0].equals("0"))
            return "0";
        
        return sb.toString();
    }
}