class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
    void solve(int start, int[] nums, int remain, List<Integer> path, List<List<Integer>> ans){
        if(remain==0){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=start; i<nums.length; i++){
            if(nums[i]>remain) break;
            if(i>start && nums[i] == nums[i-1]) continue;
            path.add(nums[i]);
            solve(i+1, nums, remain-nums[i], path, ans);
            path.remove(path.size() -1);
        }
    }
}