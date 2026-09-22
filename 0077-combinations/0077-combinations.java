class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(1, n, k, new ArrayList<>(), ans);
        return ans;
    }
    void solve(int start, int n, int k, List<Integer> path, List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=start; i<=n-k+1; i++){
            path.add(i);
            solve(i+1, n, k-1, path, ans);
            path.remove(path.size() -1);
        }
    }
}