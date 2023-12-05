class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(n, 1, k, new ArrayList<>());
        return resList;
    }
    
    void backtrack(int n, int num, int k, List<Integer>list){
        if(list.size()==k){
            resList.add(new ArrayList<>(list));
            return;
        }
        
        else{
            for(int i=num; i<=n; i++){
                list.add(i);
                backtrack(n, i+1, k, list);
                list.remove(list.size()-1);
            }
        }
    }
}