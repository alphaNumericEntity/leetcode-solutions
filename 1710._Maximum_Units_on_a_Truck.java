class Solution {
    public int maximumUnits(int[][] arr, int size) {
        Arrays.sort(arr, (a,b)-> b[1]-a[1]);
        int ans = 0;
        for (var x : arr) {
             if (size >= x[0]) {
                ans += x[0] * x[1];
                size -= x[0];
            }else {
                ans += size * x[1];
                return ans;
            }
        }
        return ans;
    }
}
