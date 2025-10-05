class Solution {
    int dir[][] = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if(heights == null || heights.length == 0 || heights[0].length == 0) {
            return result;
        }
        int r = heights.length, c = heights[0].length;
        boolean pacific[][] = new boolean[r][c];
        boolean atlantic[][] = new boolean[r][c];

        for(int i=0; i<c; i++) {
            dfs(heights, 0, i, Integer.MIN_VALUE, pacific);
            dfs(heights, r-1,  i, Integer.MIN_VALUE, atlantic);
        }
        for(int i=0; i<r; i++) {
            dfs(heights, i, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, i,  c-1, Integer.MIN_VALUE, atlantic);
        }

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }
    public void dfs(int[][] heights, int i, int j, int prev, boolean[][] ocean) {
        if(i < 0 || i >= ocean.length || j < 0 || j >= ocean[0].length) return;
        if(heights[i][j] < prev || ocean[i][j]) return;
        ocean[i][j] = true;
        for(int[] d : dir) {
            dfs(heights, i+d[0], j+d[1], heights[i][j], ocean);
        }
    }
}