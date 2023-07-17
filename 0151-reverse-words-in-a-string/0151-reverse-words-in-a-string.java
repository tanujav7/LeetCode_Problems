class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();
        
        String arr[] = s.split(" ");
        
        StringBuilder str = new StringBuilder();
        
        for(int i=arr.length-1; i>=0; --i){
            if(arr[i]!="")
                str.append(arr[i]).append(" ");
        }
        
        return str.substring(0,str.length()-1);
        
    }
}