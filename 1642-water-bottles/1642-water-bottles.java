class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles, remaining = 0;
        // remaining = numBottles % numExchange;
        while((numBottles / numExchange) >= 1) {
            int exchange = numBottles / numExchange;
            remaining = numBottles % numExchange;
            total += exchange;
            remaining += exchange;
            numBottles = remaining;
        }
        return total;
    }
}