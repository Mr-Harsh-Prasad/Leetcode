class Solution {
    int ans = 0;
    public int numTilePossibilities(String tiles) {
        int[] cnt =  new int[26];
        for(char c : tiles.toCharArray())
        cnt[c - 'A']++;
        dfs(cnt);
        return ans;
    }
    void dfs(int[] cnt){
        for(int i=0; i<26; i++){
            if(cnt[i] == 0) continue;
                ans++;
                cnt[i]--;
                dfs(cnt);
                cnt[i]++; 
        }
    }
}