class Solution {
    public String reverseVowels(String s) {
        
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        
        char arr[] = s.toCharArray();
        
        int n = arr.length;
        
        
        int i=0, j=n-1;
        
        
        while(i<=j){
            char ch1 = arr[i];
            char ch2 = arr[j];
            
            
            if(set.contains(ch1) && set.contains(ch2)){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
            else if(!set.contains(ch1))
                i++;
            
            else
                j--;
        }
        
        String str = new String(arr);
        
        return str;
    }
}