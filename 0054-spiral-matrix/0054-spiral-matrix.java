class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int top = 0, left = 0, bottom = row - 1, right = column - 1;
        List<Integer> spiral = new ArrayList<>();
        while(top <= bottom && left <= right) {
            for(int i=left; i<=right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                spiral.add(matrix[i][right]);
            } 
            right--;
            if(top <= bottom) {
                for(int i=right; i>=left; i--) {
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }
        return spiral;
    }
}