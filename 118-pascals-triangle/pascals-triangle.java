class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> t = new ArrayList<>();
        if(numRows==0){
            return t;
        }
        List<Integer> f= new ArrayList<>();
        f.add(1);
        t.add(f);
        for(int i=1;i<numRows ; i++){
            List<Integer> p = t.get(i-1);
            List<Integer> c = new ArrayList<>();
            c.add(1);
            for(int j=1;j<i;j++){
                c.add(p.get(j-1)+p.get(j));
            }
            c.add(1);
            t.add(c);
        }
        return t;
    }
}