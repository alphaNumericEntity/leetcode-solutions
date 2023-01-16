class Solution {
    public int smallestEqual(int[] arr) {
        for (int i=0;i<arr.length;i++) if (arr[i]== i % 10) return i;
        return -1;
    }
}
