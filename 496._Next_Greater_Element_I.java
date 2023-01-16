class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int x : arr2) {
            while(stack.size()>0 && stack.peek()<x) {
                map.put(stack.pop(),x);
            }
            stack.push(x);
        }
        int[] ans = new int[arr1.length];
        for (int i=0;i<arr1.length;i++) {
            ans[i] = map.getOrDefault(arr1[i],-1);
        }
        return ans;
    }
}
