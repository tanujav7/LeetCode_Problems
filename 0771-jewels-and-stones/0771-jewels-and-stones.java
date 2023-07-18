class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
     /*   int count = 0;
        
        for(int i=0; i<jewels.length(); i++){
            for(int j=0; j<stones.length(); j++){
                if(jewels.charAt(i)==stones.charAt(j))
                    count++;
            }
        }
        
        return count;*/
        
        
        Set<Character> set = new HashSet<>();
        
        for(int i=0; i<jewels.length(); i++)
            set.add(jewels.charAt(i));
      
        int count = 0;
        
        for(int i=0; i<stones.length(); i++){
           if(set.contains(stones.charAt(i)))
               count++;
        }
        
        return count;
    }
}