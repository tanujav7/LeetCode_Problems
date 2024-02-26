class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();
        
        String arr[] = s.split(" ");
        
        int n = arr.length;
        
       StringBuilder sb = new StringBuilder();
        
        for(int i=n-1; i>=0; --i){
            if(!arr[i].equals(""))
            sb.append(arr[i]).append(" ");
        }
        
        String res = sb.substring(0, sb.length()-1);
        return res;
        
    }
}