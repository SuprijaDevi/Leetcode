class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles, empty = numBottles;
        if(numBottles < numExchange) return numBottles;
        while(empty >= numExchange) {
            empty -= numExchange;
            numExchange++;
            total++;
            empty++;
        }
        return total;
    }
}