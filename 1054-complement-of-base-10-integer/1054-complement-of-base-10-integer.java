class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        String result = "";
        for(char c : binary.toCharArray()) {
            if(c == '1') result += 0;
            else result += 1;
        }
        return Integer.parseInt(result, 2);
    }
}