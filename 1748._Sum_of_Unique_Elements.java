class Solution {
    public int sumOfUnique(int[] arr) {
        int[] cnt = new int[101];
        int ans = 0;
        for (int x : arr) cnt[x]++;
        for (int i=0;i<cnt.length;i++) if (cnt[i]==1) ans+=i;
        return ans;
    }
}
