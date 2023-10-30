class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> resList = new ArrayList<>();
        
        List<Integer> pre = new ArrayList<>();
        
        pre.add(1);
        resList.add(pre);
        
        for(int i=2; i<=numRows; i++){
             List<Integer> cur = new ArrayList<>();
            cur.add(1);
            
                for(int j=0; j<pre.size()-1; j++)
                    cur.add(pre.get(j)+pre.get(j+1));
            
            cur.add(1);
            
            pre = cur;
            
            resList.add(cur);
        }
        
        return resList;
    }
}