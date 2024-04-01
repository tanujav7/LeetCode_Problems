class Solution {
    Set<String> numSet;
    int n = 0;
    String res = "";
    public String findDifferentBinaryString(String[] nums) {
        n = nums.length;
        numSet = new HashSet<>();
        for(String s : nums){
            numSet.add(s);
        }
        
       backTrack("", 0);
        
        return res;
    }
    
    
    void backTrack(String str, int index){
        if(str.length()==n){
            if(!numSet.contains(str)){
                res = str;
                //return;
            }
            return;
        }
        
        if(index>n)
            return;
        
       String str0 = str + "0";
        backTrack(str0, index+1);
        
        String str1 = str + "1";
        backTrack(str1, index+1);
        
        return;
    }
}