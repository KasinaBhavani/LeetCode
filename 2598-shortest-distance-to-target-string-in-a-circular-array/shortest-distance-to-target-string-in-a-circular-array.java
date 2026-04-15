class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDist = n;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int d = Math.abs(i - startIndex);
                minDist = Math.min(minDist, Math.min(d, n - d));
            }
        }

        return minDist == n ? -1 : minDist;
    }
}

