class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        int max= -1;
        int rem = 0;

        for (int[] interval : intervals) {
            if (interval[1] > max) {
                rem++;
                max = interval[1];
            }
        }
        return rem;
    }
} 