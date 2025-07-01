class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        int result[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            int k = 0;
            for(int j=m-1; j>=0; j--) {
                result[i][k] = image[i][j];
                if(result[i][k] == 0) result[i][k] = 1;
                else result[i][k] = 0;
                k++;
            }
        }
        return result;
    }
}