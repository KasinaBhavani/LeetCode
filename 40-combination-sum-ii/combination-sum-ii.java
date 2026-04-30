class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(0,candidates, target);
        return res;
    }
    private void backtrack(int idx, int[] c , int T){
        if(T==0){
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=idx;i<c.length;i++){
            if(i> idx && c[i]==c[i-1]) continue;
            if(c[i]>T) continue;
            temp.add(c[i]);
            backtrack(i+1,c,T-c[i]);
            temp.remove(temp.size()-1);
        }
    }
}