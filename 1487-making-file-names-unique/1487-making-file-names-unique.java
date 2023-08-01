class Solution {
    public String[] getFolderNames(String[] names) {
        
        Map<String, Integer> map = new HashMap<>();
        int n = names.length;
        String arr[] = new String[n];
        
        for(int i=0; i<n; i++){
            String s = names[i];
            if(map.containsKey(s)){
                int index = map.get(s);
                while(map.containsKey(s+"("+index+")"))
                    index++;
                map.put(s+"("+index+")",1);
                map.put(s, map.get(s)+1);
                arr[i] = s+"("+index+")";
           
            }
            
            else{
                map.put(s,1);
                arr[i] = s;
            }
        }
        
        return arr;
    }
}