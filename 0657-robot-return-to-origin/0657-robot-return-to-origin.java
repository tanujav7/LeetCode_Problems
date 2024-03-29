class Solution {
    public boolean judgeCircle(String moves) {
        
        int len = moves.length();
        
        int countX = 0, countY = 0;
        
        for(int i=0; i<len; i++){
            char ch = moves.charAt(i);
            
            if(ch=='U')
                countX++;
            else if(ch=='D')
                countX--;
            else if(ch=='L')
                countY--;
            else
                countY++;
        }
        
        return (countX==0 && countY==0);
    }
}