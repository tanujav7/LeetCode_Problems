class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTrack(n, k, 1, new ArrayList<>());
        return resList;
    }
    
    void backTrack(int n, int k, int num, List<Integer> list){
        if(k==list.size()){
            resList.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=num; i<=n; i++){
            list.add(i);
            backTrack(n, k, i+1, list);
            list.remove(list.size()-1);
        }
    }
}