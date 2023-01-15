class Solution {
    public int countNegatives(int[][] arr) {
        int ans = 0, m = arr.length, n = arr[0].length, j = 0, i =m-1;
        while(i>=0 && j<n) {
            if (arr[i][j]>=0) {
                
                j++;
            } else {
                ans+=n-j;
                i--;
            }
        }
        return ans;
    }
}
