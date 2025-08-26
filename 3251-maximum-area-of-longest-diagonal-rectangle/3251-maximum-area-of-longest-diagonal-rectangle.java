class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = 0, result = 0;
        for(int i=0; i<dimensions.length; i++) {
            int len = dimensions[i][0];
            int wid = dimensions[i][1];
            int diagonal = len * len + wid * wid;
            int area = len * wid;
            if(diagonal > maxDiagonal || (diagonal == maxDiagonal && area > result)) {
                maxDiagonal = diagonal;
                result = area;
            }
        }
        return result;
    }
}