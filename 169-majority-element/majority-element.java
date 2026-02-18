class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int tmp=0;
        for(int num:nums){
            if(c==0){
                tmp=num;
            }
            if(num==tmp){
                c++;
            }
            else{
                c--;
            }
        }
        return tmp;
    }
}