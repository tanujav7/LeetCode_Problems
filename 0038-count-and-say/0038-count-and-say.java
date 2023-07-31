class Solution {
    public String countAndSay(int n) {
        
        String res = "1";
        int i=1;
        
        while(i++<n){
            StringBuilder str = new StringBuilder();
            int count = 1;
            
            for(int j=1; j<res.length(); j++){
                if(res.charAt(j)==res.charAt(j-1))
                    count++;
                else{
                    str.append(count);
                    str.append(res.charAt(j-1));
                    count = 1;
                }
            }
            
            str.append(count);
            str.append(res.charAt(res.length()-1));
            res = str.toString();
        }
        
        return res;
    }
}