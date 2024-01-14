class Solution {
    public boolean closeStrings(String word1, String word2) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        int l1 = word1.length();
        int l2 = word2.length();

        if(l1!=l2)
        return false;

        for(int i=0; i<l1; i++){
            freq1[word1.charAt(i)-'a']++;
        }

        for(int i=0; i<l2; i++){
            freq2[word2.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++){
            if((freq1[i]==0 && freq2[i]!=0) || (freq2[i]==0 && freq1[i]!=0))
            return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for(int i=0; i<26; i++){
            if(freq1[i]!=freq2[i])
            return false;
        }

        return true;
    }
}