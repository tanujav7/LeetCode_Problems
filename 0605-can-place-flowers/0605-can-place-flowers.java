class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int len = flowerbed.length;
        
        int count = 0;
        
        for(int i=0; i<len; i++){
            if(flowerbed[i]==0){
                
                boolean leftPot = (i==0 || flowerbed[i-1]==0);
                boolean rightPot = (i==len-1 || flowerbed[i+1]==0);
                
                if(leftPot==true && rightPot==true){
                    count++;
                    flowerbed[i] = 1;
                    
                    if(count>=n)
                        return true;
                }
            }
        }
        
        return (count>=n) ? true : false;
                        
    }
}