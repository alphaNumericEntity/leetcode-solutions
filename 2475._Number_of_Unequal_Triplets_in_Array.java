class Solution {
    public int unequalTriplets(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // total combinations
        int ans = n * (n - 1) * (n - 2) / 6;

        for (int cnt : map.values()) {
            if (cnt < 2) {
                continue;
            }

            int same3cnt = cnt * (cnt - 1) * (cnt - 2) / 6;
            int same2cnt = (n - cnt) * cnt * (cnt - 1) / 2;
            ans -= same3cnt + same2cnt;
        }

        return ans; 
    }
}

//https://leetcode.com/problems/number-of-unequal-triplets-in-array/discuss/2833105/The-Fastest-O(n)-Solution%3A-Math-Combinations
