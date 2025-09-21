class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] min = new int[timePoints.size()];
        for(int i=0; i<timePoints.size(); i++) {
            String time = timePoints.get(i);
            int h = Integer.parseInt(time.substring(0, 2));
            int m = Integer.parseInt(time.substring(3, 5));
            min[i] = h * 60 + m;
        }
        Arrays.sort(min);
        int result = Integer.MAX_VALUE;
        for(int i=0; i<min.length - 1; i++) {
            result = Math.min(result, min[i +1] - min[i]);
        }
        return Math.min (
            result, 24 * 60 - min[min.length - 1] + min[0]
        );
    }
}