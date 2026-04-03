class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int l=0;
        for(int x: nums){
            sum+=x;
        }
        for(int i=0;i<nums.length;i++){
            if(l==sum-l-nums[i]){
                return i;
            }
            l+=nums[i];
        }
        return -1;
    }
}