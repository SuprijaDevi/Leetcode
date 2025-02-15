class Twitter {
    
    int timestamp = 0;
    Map<Integer, Set<Integer>> following;
    Map<Integer, List<Tweet>> tweets;
    public class Tweet {
        int id;
        int time;
        public Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }
    public Twitter() {
        following = new HashMap<>();
        tweets = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweets.putIfAbsent(userId, new ArrayList<>());
        tweets.get(userId).add(new Tweet(tweetId, timestamp++));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> maxHeap = new PriorityQueue<>((a, b) -> b.time - a.time);
        if(tweets.containsKey(userId)) {
            maxHeap.addAll(tweets.get(userId));
        }
        if(following.containsKey(userId)) {
            for(int followee : following.get(userId)) {
                if(tweets.containsKey(followee)) {
                    maxHeap.addAll(tweets.get(followee));
                }
            }
        }
        List<Integer> feed = new ArrayList<>();
        int count = 0;
        while(!maxHeap.isEmpty() && count < 10) {
            feed.add(maxHeap.poll().id);
            count++;
        }
        return feed;
    }
    
    public void follow(int followerId, int followeeId) {
        if(followerId != followeeId) {
            following.putIfAbsent(followerId, new HashSet<>());
            following.get(followerId).add(followeeId);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */