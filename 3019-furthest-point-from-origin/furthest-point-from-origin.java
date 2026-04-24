class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cL = 0;
        int cR = 0;
        int cBlank = 0;
        for (char move : moves.toCharArray()) {
            if (move == 'L') {
                cL++;
            } else if (move == 'R') {
                cR++;
            } else {
                cBlank++;
            }
        }
        return Math.abs(cL - cR) + cBlank;
    }
}
