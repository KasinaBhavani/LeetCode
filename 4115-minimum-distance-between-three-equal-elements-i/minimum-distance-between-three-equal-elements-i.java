class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int min= Integer.MAX_VALUE;
        boolean f = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] == nums[j] && nums[j] == nums[k]) {
                        int c = (j - i) + (k - j) + (k - i);
                        min = Math.min(min, c);
                        f = true;
                    }
                }
            }
        }
        return f ? min : -1;
    }
}
