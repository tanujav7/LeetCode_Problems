class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int gLength = g.length;
        
        int sLength = s.length;
        
        int i = 0, j = 0;
        
        int count = 0;
        
        Arrays.sort(s);
        
        Arrays.sort(g);
        
        while(i<gLength && j<sLength){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
                
        }
        
        return count;
    }
}