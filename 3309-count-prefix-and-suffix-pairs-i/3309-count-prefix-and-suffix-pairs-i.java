class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int result = 0;
        for(int i=0; i<n; i++) {
            String s1 = words[i];
            for(int j=i+1; j<n; j++) {
                String s2 = words[j];
                if(s2.length() < s1.length()) continue;
                String prefix = s2.substring(0, s1.length());
                String suffix = s2.substring(s2.length() - s1.length());
                if(prefix.equals(s1) && suffix.equals(s1)) {
                    result++;
                }
            }
        }
        return result;
    }
}