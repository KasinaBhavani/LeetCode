class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length> nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> m = new HashMap<>();
        for(int n : nums1){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(int n : nums2){
            if(m.containsKey(n)&& m.get(n)>0){
                res.add(n);
                m.put(n,m.get(n)-1);
            }
        }
        int[] r = new int[res.size()];
        for(int i=0;i<res.size();i++){
            r[i]=res.get(i);
        }
        return r;
    }
}