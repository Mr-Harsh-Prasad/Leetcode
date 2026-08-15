class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(i<=j){
                if(nums[j] != val){
                    if(nums[i] == val){
                    nums[i] = nums[j];
                    nums[j] = val;
                    j--;
                    }
                } else {
                    j--;
                    i--;
                }
            } else {
                break;
            }
        }
        int k = j+1;
        return k;
    }
}