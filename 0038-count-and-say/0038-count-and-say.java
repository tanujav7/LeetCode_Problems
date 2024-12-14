class Solution {
    public String countAndSay(int n) {
        
        int i = 1;
        
        String res = "1";
        
        while(i++<n){
            int count = 1;
            StringBuilder sb = new StringBuilder();
            for(int j=1; j<res.length(); j++){
                if(res.charAt(j)==res.charAt(j-1))
                    count++;
                else{
                    sb.append(count);
                    sb.append(res.charAt(j-1));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(res.charAt(res.length()-1));
            res = sb.toString();
        }
        
        return res;
    }
}