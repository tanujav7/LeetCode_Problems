class Solution {
    public String reverseWords(String s) {
    
        
        if(s.length()==0 || s==null)
            return "";
        s = s.trim();
        String arr[] = s.split(" ");
        
        StringBuilder res = new StringBuilder();
        for(int i=arr.length-1; i>=0; --i){
                if(!arr[i].equals(""))
                    res.append(arr[i]).append(" ");
        }
        
        return res.substring(0,res.length()-1);
    }
}