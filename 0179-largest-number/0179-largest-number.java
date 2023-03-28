class Solution {
    public String largestNumber(int[] nums) {
        
        String str[] = new String[nums.length];
        
        for(int i=0; i<str.length; i++){
            str[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(str,(s1,s2) -> (s2+s1).compareTo(s1+s2));
        
        StringBuilder res = new StringBuilder();
        
        for(String i:str){
            res.append(i);
        }
        
        if(str[0].equals("0"))
            return "0";
        
        return res.toString();
    }
}