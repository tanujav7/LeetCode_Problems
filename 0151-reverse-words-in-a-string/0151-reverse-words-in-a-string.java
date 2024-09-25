class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();
        
        String arr[] = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=arr.length-1; i>=0; --i){
            if(arr[i].equals(""))
                continue;
            else
                sb.append(arr[i]).append(" ");
        }
        
        return sb.substring(0, sb.length()-1);
    }
}