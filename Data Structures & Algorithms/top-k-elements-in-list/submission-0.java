class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> l = new HashMap<>();
        for(int num : nums){
            l.put(num,l.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> p = new PriorityQueue<>((a,b)-> l.get(b)-l.get(a));
        p.addAll(l.keySet());

        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = p.poll();
        }
        return ans;
    }
}