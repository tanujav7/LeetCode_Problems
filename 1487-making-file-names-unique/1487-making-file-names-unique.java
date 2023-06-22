class Solution {
    public String[] getFolderNames(String[] names) {
        
        Map<String, Integer> map = new HashMap<>();
        
        String str[] = new String[names.length];
        
        for(int i=0; i<names.length; i++){
            if(map.containsKey(names[i])){
                int index = map.get(names[i]);
                while(map.containsKey(names[i]+"("+index+")"))
                    index++;
                map.put(names[i]+"("+index+")",1);
                map.put(names[i],map.get(names[i])+1);
                str[i] = names[i]+"("+index+")";
            }
            else{
                map.put(names[i],1);
                str[i] = names[i];
            }
        }
        
        return str;

    }
}