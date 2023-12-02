class Solution {
    public int countCharacters(String[] words, String chars) {
                int res = 0;
        for(String word : words){
            boolean check = checkCharacter(word, chars);
            if(check)
            res = res + word.length();
        }

        return res;
    }

    boolean checkCharacter(String word, String chars){
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<chars.length(); i++){
            char ch = chars.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int count = 0;
        
         for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            count = (map.containsKey(ch)) ? map.get(ch)-1 : -1;

            if(count==-1)
            return false;

            map.put(ch, count);
        }

        return true;
    }
}