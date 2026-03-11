class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size(); 
        int[] p = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                p[j] = triangle.get(i).get(j) + Math.min(p[j], p[j + 1]);
            }
        }
        return p[0];
    }
}

