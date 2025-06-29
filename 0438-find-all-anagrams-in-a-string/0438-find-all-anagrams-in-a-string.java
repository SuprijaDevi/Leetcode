class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int slen = s.length(), plen = p.length();
        
        if (slen < plen) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (int i = 0; i < plen; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= slen - plen; i++) {
            if (Arrays.equals(pCount, sCount)) {
                result.add(i);
            }
            if (i + plen < slen) {
                sCount[s.charAt(i) - 'a']--;
                sCount[s.charAt(i + plen) - 'a']++;
            }
        }
        return result;
    }
}
