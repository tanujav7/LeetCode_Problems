class Solution {
    public int lastStoneWeight(int[] stones) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int num : stones)
            list.add(num);
        
        while(list.size() > 1){
            Collections.sort(list);
            int a = list.remove(list.size()-1);
            int b = list.remove(list.size()-1);
            
            if(a!=b)
                list.add(a-b);
        }
        
        return list.size()==1 ? list.get(0) : 0;
        
    }
}