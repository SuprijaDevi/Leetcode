class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row * col != r * c) {
            return mat;
        }
        int[][] reshaped = new int[r][c];
        for(int i=0; i<row * col; i++) {
            reshaped[i / c][i % c] = mat[i / col][i % col];
        }
        return reshaped;
    }
}