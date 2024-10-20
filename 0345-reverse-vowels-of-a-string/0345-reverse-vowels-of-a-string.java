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
         
        int i = 0, j = s.length()-1;
        
        char arr[] = s.toCharArray();
        
        while(i<j){
            if(!set.contains(arr[i]))
                i++;
            
            else if(!set.contains(arr[j]))
                j--;
            
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        String res = new String(arr);
        
        return res;
    }
}