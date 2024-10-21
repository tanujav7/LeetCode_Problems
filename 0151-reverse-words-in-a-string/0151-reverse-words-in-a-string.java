class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();
        String arr[] = s.split(" ");
        
        int n = arr.length;
        
        String res = "";
        
        for(int i=n-1; i>=0; --i){
            if(arr[i].equals(""))
                continue;
            else
                res = res + arr[i] + " ";
        }
        
        return res.substring(0, res.length()-1);
    }
}