class Solution {
    public int busyStudent(int[] start, int[] end, int query) {
        int ans = 0;
        for (int i=0;i<start.length;i++) {
            if (start[i]<=query && end[i]>=query) ans++;
        }
        return ans;
    }
}
