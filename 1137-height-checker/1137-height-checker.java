class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int original[] = new int[heights.length];
        for(int i=0; i<heights.length; i++) {
            original[i] = heights[i];
        }
        Arrays.sort(heights);
        for(int i=0; i<heights.length; i++) {
            if(heights[i] != original[i]) {
                count++;
            }
        }
        return count;
    }
}