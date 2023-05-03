class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> pre = new ArrayList<>();
        
        pre.add(1);
        res.add(pre);
        
        for(int i=2; i<=numRows; i++){
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for(int j=0; j<pre.size()-1; j++){
                current.add(pre.get(j)+pre.get(j+1));
            }
            current.add(1);
            res.add(current);
            pre = current;
        }
        return res;
    }
}