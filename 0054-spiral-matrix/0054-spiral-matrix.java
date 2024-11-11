class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        int row_begin = 0, row_end = row;
        int col_begin = 0, col_end = col;

        List<Integer> list = new ArrayList<>();

        while (row_begin <= row_end && col_begin <= col_end) {

            for (int i = col_begin; i <= col_end; i++) {
                list.add(matrix[row_begin][i]);
            }
            row_begin++;

            for (int i = row_begin; i <= row_end; i++) {
                list.add(matrix[i][col_end]);
            }
            col_end--;

            if (row_begin <= row_end) {
                for (int i = col_end; i >= col_begin; --i) {
                    list.add(matrix[row_end][i]);
                }
            }
             row_end--;

            if (col_begin <= col_end) {
                for (int i = row_end; i >= row_begin; --i) {
                    list.add(matrix[i][col_begin]);
                }
            }
            col_begin++;
        }

        return list;
    }
}