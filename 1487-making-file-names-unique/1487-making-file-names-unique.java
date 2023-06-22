class Solution {
    public String[] getFolderNames(String[] names) {
        String[] res = new String[names.length];
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i = 0; i < names.length; i++) {
            if (hashMap.containsKey(names[i]) == true) {
                int num = hashMap.get(names[i]);
                while (hashMap.containsKey(names[i] + "(" + num + ")") == true) {
                    num++;
                }
                hashMap.put(names[i] + "(" + num + ")", 1);
              hashMap.put(names[i], hashMap.get(names[i]) + 1);
                res[i] = names[i] + "(" + num + ")";
            }
            else {
                hashMap.put(names[i], 1);
                res[i] = names[i];
            }  
        }
        return res;

    }
}