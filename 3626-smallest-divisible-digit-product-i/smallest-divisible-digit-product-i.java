class Solution {
    public int smallestNumber(int n, int t) {
         while (n < 101) {
            int d = n;
            int prdt= 1;
            while (d > 0) {
                prdt *= d % 10;
                d /= 10;
            }
            if (prdt % t == 0)
                return n;
            n++;
        }
        return 0;
    }
}