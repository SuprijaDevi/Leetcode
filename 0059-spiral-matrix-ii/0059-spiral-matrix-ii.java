class Solution {
    public int[][] generateMatrix(int n) {
        int value = 1;
        int top = 0, left = 0, bottom = n - 1, right = n - 1;
        int matrix[][] = new int[n][n];
        while(top <= bottom && left <= right) {
            for(int i=left; i<=right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            if(top <= bottom) {
                for(int i=right; i>=left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }
            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }
        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<n; j++) {

        //     }
        // }
        return matrix;
    }
}