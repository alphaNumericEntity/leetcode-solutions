class Solution {
    public boolean divideArray(int[] arr) {
        int[] cnt = new int[501];
        for (int x : arr) cnt[x]++;
        for (int x : cnt) if (x%2==1) return false;
        return true;
    }
}
