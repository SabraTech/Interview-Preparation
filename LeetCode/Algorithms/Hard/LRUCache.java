class LRUCache {

    HashMap<Integer, Integer> cache;
    Queue<Integer> queue;
    int size;

    public LRUCache(int capacity) {
        size = capacity;
        cache = new HashMap<>();
        queue = new LinkedList<Integer>();
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            queue.remove(key);
            queue.offer(key);
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.put(key, value);
            queue.remove(key);
            queue.offer(key);
        } else {
            if(size == cache.size()){
                cache.remove(queue.poll());
                cache.put(key, value);
                queue.offer(key);
            }else{
                cache.put(key, value);
                queue.offer(key);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
