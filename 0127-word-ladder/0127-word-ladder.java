class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) {
            return 0;
        }
        Set<String> wordSet = new HashSet<>(wordList);

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int level = 1;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                String currentWord = queue.poll();
                char currentWordChar[] = currentWord.toCharArray();
                for(int j=0; j<currentWordChar.length; j++) {
                    char originalChar = currentWordChar[j];
                    for(char c='a'; c<='z'; c++) {
                        currentWordChar[j] = c;
                        String nextWord = new String(currentWordChar);
                        if(nextWord.equals(endWord)) {
                            return level + 1;
                        }
                        if(wordSet.contains(nextWord) && !visited.contains(nextWord)) {
                            queue.offer(nextWord);
                            visited.add(nextWord);
                        }
                    }
                    currentWordChar[j] = originalChar;
                }
            }
            level++;
        }
        return 0;
    }
}