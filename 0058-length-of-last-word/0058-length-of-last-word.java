class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        
        int n = s.length();
        
        int count = 0;
        
        String arr[] = s.split("");
            
        for(int i=arr.length-1; i>=0; --i){
            if(arr[i].equals(" "))
                break;
            else
                count++;
        }
        
        return count;
    }
}