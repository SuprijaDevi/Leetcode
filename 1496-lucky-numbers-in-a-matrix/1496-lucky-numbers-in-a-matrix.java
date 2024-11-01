class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<row; i++) {
            int min = matrix[i][0];
            int jIndex = 0;
            for(int j=1; j<col; j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    jIndex = j;
                }
            }

            boolean isLucky = true;
            for(int k=0; k<row; k++) {
                if(matrix[k][jIndex] > min) {
                    isLucky = false;
                    break;
                }
            }
            if(isLucky) {
                lucky.add(min);
            }
        }
        return lucky;
    }
}