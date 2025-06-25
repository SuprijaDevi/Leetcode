class Solution {
    public boolean judgeCircle(String moves) {
        char[] move = moves.toCharArray();
        int ud = 0, rl = 0;
        for(char c : move) {
            if(c == 'U') ud += 1;
            else if(c == 'D') ud -= 1;
            else if(c == 'R') rl += 1;
            else rl -= 1;
        }
        if(ud == 0 && rl == 0) return true;
        return false;
    }
}