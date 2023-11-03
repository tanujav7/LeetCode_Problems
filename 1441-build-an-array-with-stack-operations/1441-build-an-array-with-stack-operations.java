class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> list = new ArrayList<>();
        int i = 1;
        
        for(int j=0; j<target.length; j++){
            while(i < target[j]) {
                list.add("Push");
                list.add("Pop");
                i++;
            }
            
            list.add("Push");
            i++;
        }
        
        return list;
    }
}