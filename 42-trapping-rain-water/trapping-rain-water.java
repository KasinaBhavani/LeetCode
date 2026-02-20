class Solution {
    public int trap(int[] height) {
       if(height == null || height.length==0){
        return 0;
       }
       int l=0,r=height.length-1;
       int lmax=0;
       int rmax=0;
       int res=0;
       while(l<r){
        if(height[l]<height[r]){
            if(height[l]>=lmax){
                lmax=height[l];
            }
            else{
                res+=lmax-height[l];
            }
            l++;
        }
        else{
            if(height[r]>=rmax){
                rmax=height[r];
            }
            else{
                res+=rmax-height[r];
            }
            r--;
        }
       }
       return res;
    }
}