class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int m= cost[0];
        int n = cost[1];
        
        for (int i = 2; i < cost.length; i++) {
            int c= cost[i] + Math.min(m,n);
            m = n;
            n=c;
        }
        
        return Math.min(m, n);
    }
}
