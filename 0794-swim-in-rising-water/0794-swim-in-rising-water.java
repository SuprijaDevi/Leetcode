class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        boolean[][] visited = new boolean[n][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[] {grid[0][0], 0, 0});
        int max = 0;
        while(!pq.isEmpty()) {
            int[] current = pq.poll();
            int height = current[0], r = current[1], c = current[2];
            max = Math.max(max, height);
            if(r == n - 1 && c == n - 1) return max;
            if(visited[r][c]) continue;
            visited[r][c] = true;
            for(int[] d : dir) {
                int nr = r + d[0], nc = c + d[1];
                if(nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    pq.offer(new int[] {grid[nr][nc], nr, nc});
                }
            }
        }
        return max;
    }
}