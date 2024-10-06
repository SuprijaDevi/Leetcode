class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) {
            return true;
        }
        long left = 1, right = num - 1;
        while(right >= left) {
            long middle = (right + left) / 2;

            if(middle * middle == num) {
                return true;
            } else if(middle * middle > num) {
                 right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }
}