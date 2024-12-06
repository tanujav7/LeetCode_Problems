class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTrack(n, 1, k, new ArrayList<>());
        return resList;
    }
    
    void backTrack(int n, int num, int k, List<Integer> list){
        if(k==list.size()){
            resList.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=num; i<=n; i++){
            list.add(i);
            backTrack(n, i+1, k, list);
            list.remove(list.size()-1);
        }
    }
}