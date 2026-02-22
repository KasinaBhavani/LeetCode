class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> l = new ArrayList<>();
        l.add(0);
        for(int i=0;i<n;i++){
            int size=l.size();
            int offset=1<<i;
            for(int j=size-1;j>=0;j--){
                l.add(l.get(j)|offset);
            }
        }
        return l;
    }
}