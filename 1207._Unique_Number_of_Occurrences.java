class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] cnt = new int[2001];
        
        var set = new HashSet<Integer>();
        for (int x : arr) cnt[x+1000]++;
        for (int x : cnt) {
            if (x!=0 && !set.add(x)) return false;
        }
        return true;
    }
}
