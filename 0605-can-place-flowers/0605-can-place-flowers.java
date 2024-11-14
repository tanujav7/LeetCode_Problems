class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int flowerCount = 0;
        
        int len = flowerbed.length;
        
        boolean prev, next;
        
        for(int i=0; i<len; i++){
            if(flowerbed[i]==0){
            if(i==0)
                prev = true;
            else
            prev = (flowerbed[i-1]==0) ? true : false;
            
            if(i==len-1)
                next = true;
            else
                next = (flowerbed[i+1]==0) ? true : false;
            
            if(next==true && prev==true){
                 flowerCount++;
                 flowerbed[i] = 1;
                
                if(flowerCount>=n)
                    return true;
            }
            } 
        }
        
        return (flowerCount>=n);
    }
}