class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        
        String arr[] = s.split("");
        
        int count = 0;
        
        for(int i=arr.length-1; i>=0; --i){
            if(arr[i].equals(" "))
                break;
            else
                count++;
        }
        
        return count;
    }
}