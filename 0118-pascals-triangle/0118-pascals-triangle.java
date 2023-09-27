class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        ArrayList<List<Integer>> res = new ArrayList<>();
        
        List<Integer> prev = new ArrayList<>();
        
        prev.add(1);
        res.add(prev);
        
        for(int i=2; i<=numRows; i++){
          List<Integer> current = new ArrayList<>();
            current.add(1);
              for(int j=0; j<prev.size()-1; j++){
                  current.add(prev.get(j) + prev.get(j+1));
              }
            current.add(1);
            res.add(current);
            prev = current;
        }
        
        return res;
    }
}