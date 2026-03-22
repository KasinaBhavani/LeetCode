class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int k=0;k<4;k++){
            if(isSame(mat,target))
            return true;
            int[][] rot=new int[n][n];
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    rot[c][n-1-r]=mat[r][c];
                }
            }
            mat=rot;
        }
        return false;
    }
    private boolean isSame(int[][] mat, int[][] target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=target[i][j])
                   return false;
            }
        }
        return true;
    }
}