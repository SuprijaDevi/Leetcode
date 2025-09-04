class Solution {
    public int findClosest(int x, int y, int z) {
        int xDistance = z - x, yDistance = z - y;
        xDistance = Math.abs(xDistance);
        yDistance = Math.abs(yDistance);
        if(xDistance < yDistance) return 1;
        else if(xDistance > yDistance) return 2;
        else return 0;
    }
}