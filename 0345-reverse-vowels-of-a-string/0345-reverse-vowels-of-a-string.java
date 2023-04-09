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
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            
            if(!set.contains(arr[start]))
                start++;
            
            else if(!set.contains(arr[end]))
                end--;
            
            else{
                
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            
        }
        
        String res = new String(arr);
        return res;
       
    }
}