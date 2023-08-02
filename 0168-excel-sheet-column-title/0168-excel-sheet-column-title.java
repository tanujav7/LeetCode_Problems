class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder str = new StringBuilder();
    
        while(columnNumber>0){
            columnNumber--;
            str.append((char)((columnNumber) % 26 + 'A'));
            columnNumber = columnNumber/26;
        }
        
        return str.reverse().toString();
    }
}