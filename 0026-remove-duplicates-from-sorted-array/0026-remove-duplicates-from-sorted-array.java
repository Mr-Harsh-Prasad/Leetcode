class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[k] != nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }

        int unique = k+1;
        return unique;
    }
}