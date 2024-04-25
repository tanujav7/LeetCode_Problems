class Solution {
    public int maxVowels(String s, int k) {
        
        Set<Character> set = new HashSet<>();
        
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        
        char arr[] = s.toCharArray();
        
        int count = 0, maxCount = 0;
        
        for(int i=0; i<k; i++){
            if(set.contains(arr[i]))
                count++;
        }
        
        maxCount = count;
        
        int n = arr.length;
        
        for(int i=k; i<n; i++){
            if(set.contains(arr[i]))
                count++;
             if(set.contains(arr[i-k]))
                count--;
            
            maxCount = Math.max(count, maxCount);
        }
        
        return maxCount;
        
    }
}