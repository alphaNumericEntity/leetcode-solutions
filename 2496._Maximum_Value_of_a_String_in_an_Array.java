class Solution {
    public int maximumValue(String[] strs) {
        int max = -1;
        for (var x : strs) max = Math.max(max,f(x));
        return max;
    }
    
    int f(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return str.length();
        }
    }
}
