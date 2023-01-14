class Solution {
    public int repeatedNTimes(int[] arr) {
        for (int i=2;i<arr.length;i++) {
            if (arr[i]==arr[i-1] || arr[i]==arr[i-2]) return arr[i];
        }
        return arr[0];
    }
}
