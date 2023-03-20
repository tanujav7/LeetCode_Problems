class Solution {
    public int countPrimes(int n) {
      
         int count = 0;

      boolean bool[] = new boolean[n];
        
        for(int i=2; i<Math.sqrt(n); i++){
                    
            if(bool[i]==false){
                    
                for(int j=i*i; j<n; j=j+i)
                    bool[j] = true;
            }
        }
        
        for(int i=2; i<n; i++){
                
            if(bool[i]==false)
                count++;
        }
            
        return count;
    }
    
}