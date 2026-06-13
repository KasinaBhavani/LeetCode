class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for (String w : words) {
            long sum = 0;

            for (char ch : w.toCharArray()) {
                sum += weights[ch - 'a'];
            }

            int rem = (int)(sum % 26);
            ans.append((char)('z' - rem));
        }

        return ans.toString();
    }
}