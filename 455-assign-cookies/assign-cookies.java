import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int c = 0;
        int p = 0;
        while (c < g.length && p < s.length) {
            if (s[p] >= g[c]) {
                c++;
            }
            p++;
        }
        return c;
    }
}
