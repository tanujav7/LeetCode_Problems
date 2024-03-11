class Solution {
    public String customSortString(String order, String s) {
         int N = s.length();
        Character[] result = new Character[N];
        for (int i = 0; i < N; i++) {
            result[i] = s.charAt(i);
        }

        // Define the custom comparator
        Arrays.sort(result, (c1, c2) -> {
            // The index of the character in order determines the value to be sorted by
            return order.indexOf(c1) - order.indexOf(c2);
        });

        // Return the result
        String resultString = "";
        for (Character c: result) {
            resultString += c;
        }
        return resultString;
    }
}