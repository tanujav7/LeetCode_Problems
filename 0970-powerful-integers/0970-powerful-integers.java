class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        
        
        Set<Integer> set = new HashSet<>();
        
        int a = (x==1) ? bound : (int) ((Math.log(bound))/(Math.log(x)));
        int b = (y==1) ? bound : (int) ((Math.log(bound))/(Math.log(y)));
        
        for(int i=0; i<=a; i++){
            for(int j=0; j<=b; j++){
                int val = (int) Math.pow(x,i) + (int) Math.pow(y,j);
                
                if(val<=bound)
                    set.add(val);
                
               if(y==1)
                   break;
            }
            
          if(x==1)
            break;
        }
        
        return new ArrayList<Integer>(set);
    }
}