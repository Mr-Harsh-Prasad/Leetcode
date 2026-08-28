import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> found = new HashSet<>();
        for(int x : nums1){
            set.add(x);
        }

        int[] temp = new int[nums2.length];
        int count = 0;
        
        for(int x : nums2){
            if(set.contains(x)){
                found.add(x);
            }
        }

        int[] result = new int[found.size()];
        int i = 0;
        for(int x: found){
            result[i++] = x;
        }

        return result;
    }
}