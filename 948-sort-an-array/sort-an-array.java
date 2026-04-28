class Solution {
    public int[] sortArray(int[] nums) {
        return mergesort(nums);
    }
    private int[] mergesort(int[] nums){
        if(nums.length<=1) return nums;
        int mid=nums.length/2;
        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums,mid,nums.length);
        left = mergesort(left);
        right = mergesort(right);
        return merge(left,right);
    }
    private int[] merge(int[] l, int[] r){
        int[] res=new int[l.length+r.length];
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length){
            if(l[i]<=r[j]){
                res[k++]=l[i++];
            }
            else{
                res[k++] =r[j++];
            }
        }
        while(i<l.length) res[k++] =l[i++];
        while(j<r.length) res[k++] =r[j++];
        return res;
    }

}