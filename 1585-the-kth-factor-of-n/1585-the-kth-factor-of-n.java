class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n % i == 0 && --k == 0) 
            // list.add(i);
            return i;
        }
        // return (k > list.size()) ? -1 : list.get(k - 1);
        return -1; 
    }
}