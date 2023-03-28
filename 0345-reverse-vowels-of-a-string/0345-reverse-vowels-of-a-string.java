class Solution {
    public String reverseVowels(String s) {
        Set <Character> set = new HashSet<>();
        
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
        
        char ch[] = s.toCharArray();
        int start = 0;
        int end = ch.length-1;
        
        while(start<end){

        if(!set.contains(ch[start])){
            start++;
           // continue;
        }
            
      else if(!set.contains(ch[end])){
            end--;
          //continue;
      }
        
      else{
        char c = ch[start];
        ch[start] = ch[end];
            ch[end] = c;
          start++;
          end--;
      }
        }
      
        String res = new String(ch);
        
        return res;
        
    }
}