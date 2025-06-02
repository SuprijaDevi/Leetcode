class Solution {
    public int firstUniqChar(String s) {
        // for(int i=0; i<s.length(); i++) {
        //     boolean check = true;
        //     for(int j=i+1; j<s.length(); j++) {
        //         if(s.charAt(i) == s.charAt(j)) {
        //             check = false;
        //             break;
        //         }
        //     }
        //     if(check) {
        //         return i;
        //     }
        // }
        // return -1;
        int frequency[] = new int[26];
        for(char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        for(int i=0; i<s.length(); i++) {
            if(frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}