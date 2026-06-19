class Solution {
    public int largestAltitude(int[] gain) {
        int c = 0;
        int m = 0;
        for (int i : gain) {
            c += i;
            m= Math.max(m, c);
        }
        return m;
    }
}