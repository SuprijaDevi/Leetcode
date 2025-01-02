class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(int i=0; i<n; i++) {
            prefix[i] = (i > 0 ? prefix[i - 1] : 0);
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                prefix[i]++;
            }
        }
        int[] result = new int[queries.length];
        for(int i=0; i<queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            result[i] = prefix[r] - (l > 0 ? prefix[l - 1] : 0);
        }
        return result;
    }
}