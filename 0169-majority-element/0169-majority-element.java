class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                j = nums[i];
                count++;
            } else {
                if(j == nums[i]){
                    count++;
                } else {
                    count--;
                }
            }
        }
        return j;
    }
}