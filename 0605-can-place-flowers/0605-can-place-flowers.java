class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int len = flowerbed.length;
        
        int count = 0;
        
        for(int i=0; i<len; i++){
            if(flowerbed[i]==0){
                boolean emptyLeftPot = (i==0 || flowerbed[i-1]==0);
                boolean emptyRightPot = (i==len-1 || flowerbed[i+1]==0);
                
                if(emptyLeftPot==true && emptyRightPot==true){
                    flowerbed[i] = 1;
                    count++;
                    
                    if(count>=n)
                        return true;
                }
            }
        }
        
        
        return count>=n;
    }
}