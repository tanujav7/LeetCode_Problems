class Solution {
    public String addBinary(String a, String b) {

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int n1 = 0, n2 = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            if (i >= 0) {
                n1 = a.charAt(i--) - '0';
            } else {
                n1 = 0;
            }
            
            if (j >= 0) {
                n2 = b.charAt(j--) - '0';
            } else {
                n2 = 0;
            }
            
            int sum = n1 + n2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        
        return sb.reverse().toString();
    }
}
