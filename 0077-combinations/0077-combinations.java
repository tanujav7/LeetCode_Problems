class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTrack(n, k, 1, new ArrayList<>());
        return resList;
    }
    
    void backTrack(int n, int k, int i, List<Integer> list){
        if(list.size()==k){
            resList.add(new ArrayList<>(list));
            return;
        }
        
        for(int j=i; j<=n; j++){
            list.add(j);
            backTrack(n, k, j+1, list);
            list.remove(list.size()-1);
        }
    }
}