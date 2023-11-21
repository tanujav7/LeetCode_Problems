class Solution {
     List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
         backTrack(n, 1, k, new ArrayList<>());
         return resList;
    }
    void backTrack(int n, int i, int k, List<Integer> list){
        if(list.size()==k){
            resList.add(new ArrayList<>(list));
            return;
        }
        
        for(int num = i; num<=n; num++){
            list.add(num);
            backTrack(n, num + 1, k, list);
            list.remove(list.size()-1);
        }
    }
}