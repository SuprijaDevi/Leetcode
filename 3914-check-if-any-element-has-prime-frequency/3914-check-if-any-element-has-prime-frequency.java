class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        for(int freq : frequency.values()) {
            if(isPrime(freq)) return true;
        }
        return false;
    }
    private boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}