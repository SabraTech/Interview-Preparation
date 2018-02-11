class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 1;
        for(Integer i : nums){
            if(!map.containsKey(i)){
                map.put(i, cnt);
            }else{
                map.put(i, map.get(i) + 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < k; i++){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            ans.add(entry.getKey());
        }
        return ans;

    }
}
