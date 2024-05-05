class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i=0, j=0;
        
        int sLen = s.length;
        int gLen = g.length;
        
        int count = 0;
        
        while(i<gLen && j<sLen){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            }
            
            else
                j++;
        }
        
        return count;
    }
}