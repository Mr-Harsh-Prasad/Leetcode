class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        if(n<days){
            return -1;
        }
        long low = 0;
        long high = 0;
        for(int x : weights){
            low = Math.max(low ,x);
            high +=x;
        }
        long ans = -1;
        while(low <=high){
            long mid = low + (high - low)/2;
            int ship = 1;
            long sum = 0;
            for(int x : weights){
                if(sum + x > mid){
                    ship++;
                    sum = x;
                } else {
                    sum += x;
                }
            }
            if(ship <= days){
                ans = mid;
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return (int) ans;
    }
}