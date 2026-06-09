class Solution {
    public int longestConsecutive(int[] nums) {
        int r =0;
        Set<Integer> l = new HashSet<>();
        for(int num : nums){
            l.add(num);
        }
        for(int num : nums){
        int c=0;
        int cu = num;
        while(l.contains(cu)){
        c++;
        cu++;
        }
        
        r= Math.max(r,c);
        }
        return r;
    }
}
