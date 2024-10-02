class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int n = arr.length;
        int tempArr[] = new int[n];
        
        for(int i=0; i<n; i++){
            tempArr[i] = arr[i];
        }
        
        Arrays.sort(tempArr);
        
        //37,12,28,9,100,56,80,5,12
        //5,9,12,12,28,37,56,80,100 
        //1,2,3,3,4,5,6,7,8
        
        
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int j = 0;
        for(int i=0; i<n; i++){
            if(!map.containsKey(tempArr[i]))
                map.put(tempArr[i], ++j);
        }
        
        int k = 0;
        
        int res[] = new int[n];
        
        for(int i=0; i<n; i++){
            res[k++] = map.get(arr[i]);
        }
        
        return res;
        
    }
}