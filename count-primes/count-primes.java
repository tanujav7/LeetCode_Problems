class Solution {
    public int countPrimes(int n) {
      
         int count = 0;
   //To store the boolean values to prove whether a number is prime or not, we initialize a bool array.
    //The array is initialized with false value.
      boolean bool[] = new boolean[n];
        
        for(int i=2; i<Math.sqrt(n); i++){
                    
            if(bool[i]==false){
            
                for(int j=i*i; j<n; j=j+i)
                    bool[j] = true;
            }
        }
        
        
        //If the number is prime then the bool[i] = false;
        //If the number is composite then bool[i] = true;
        
        for(int i=2; i<n; i++){
                
            if(bool[i]==false)
                count++;
        }
            
        return count;
    }
    
}