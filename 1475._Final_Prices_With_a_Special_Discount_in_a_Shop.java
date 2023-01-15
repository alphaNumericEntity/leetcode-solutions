class Solution {
    public int[] finalPrices(int[] arr) {
        Stack<int[]> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            while(stack.size()>0 && stack.peek()[0]>=arr[i]) {
                var pop = stack.pop();
                ans[pop[1]] = pop[0]-arr[i];
            }
            stack.push(new int[]{arr[i],i});
        }
        while(stack.size()>0) {
            var pop = stack.pop();
            ans[pop[1]] = pop[0];
        }
        return ans;
    }
}
