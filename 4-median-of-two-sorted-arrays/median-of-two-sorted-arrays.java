class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int t=m+n;
        int p1=0,p2=0;
        int c=0,l=0;
        for(int i=0;i<=t/2;i++){
            l=c;
            if(p1<m && (p2>=n||nums1[p1]<nums2[p2])){
                c=nums1[p1++];
            }
            else{
                c=nums2[p2++];
            }
        }
        if(t%2==0){
            return (l+c)/2.0;
        }
        else{
            return (double) c;
        }
    }
}