class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int countR = 0, countL = 0;
        
        int len = moves.length();
        
        for(int i=0; i<len; i++){
            char ch = moves.charAt(i);
            
            if(ch=='L')
                countL++;
            
            else if(ch=='R')
                countR++;
        }
        
  //      char replace = '0';
        
       // int diff = 0,
        
        int cL = 0, cR = 0;
        
        if(countL>=countR){
        for(int i=0; i<len; i++){
            char ch = moves.charAt(i);
            if(ch=='L' || ch=='_')
                cL++;
            else
                cR++;
        }
            
            return cL-cR;
      }
        
        
        if(countL<countR){
        for(int i=0; i<len; i++){
            char ch = moves.charAt(i);
            if(ch=='L')
                cL++;
            else
                cR++;
        }
            
            return cR-cL;
      }
        
        return 0;
        
    }
}