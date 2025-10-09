class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> type = new HashSet<>();
        for(int ty : candyType) {
            type.add(ty);
        }
        int unique = type.size(), max = candyType.length / 2;
        return Math.min(unique, max);
    }
}