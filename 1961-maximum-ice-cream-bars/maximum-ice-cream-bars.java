class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;

        for (int c : costs) {
            maxCost = Math.max(maxCost, c);
        }

        int[] freq = new int[maxCost + 1];

        for (int c : costs) {
            freq[c]++;
        }

        int ans = 0;

        for (int p = 1; p <= maxCost; p++) {
            if (freq[p] == 0) {
                continue;
            }

            int B = Math.min(freq[p], coins / p);

            ans += B;
            coins -= B * p;

            if (coins < p) {
                break;
            }
        }

        return ans;
    }
}