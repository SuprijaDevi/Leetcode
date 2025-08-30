class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int highest = current;
        for(int i=0; i<gain.length; i++) {
            current += gain[i];
            highest = Math.max(highest, current);
        }
        return highest;
    }
}