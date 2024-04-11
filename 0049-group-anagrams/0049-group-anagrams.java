class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> resList = new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        
        for(String s : strs){
            char arr[] = s.toCharArray();
             Arrays.sort(arr);
            String str = new String(arr);
            
            if(map.containsKey(str)){
                map.get(str).add(s);
            }
            
            else{
                map.put(str, new ArrayList<>());
                map.get(str).add(s);
            }
        }
        
        return new ArrayList<>(map.values());
    }
}