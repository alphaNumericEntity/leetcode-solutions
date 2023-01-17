class Solution {
    public List<Integer> luckyNumbers (int[][] arr) {
        var map = new HashMap<Integer,Integer>();
        int m = arr.length, n = arr[0].length;
        for (int i=0;i<n;i++) {
            map.put(i,max(arr,m,i));
        }
        
        List<Integer> ans = new ArrayList<>();
        for (var row : arr) {
            var min_index = min_index(row,n);
            int min = min_index[0], index = min_index[1];
            if (map.get(index)==min) ans.add(min);
            
        }
        return ans;
        
    }
    
    int[] min_index(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        int[] ans  = new int[2];
        for (int i=0;i<n;i++) {
            if (min > arr[i]) {
                ans[0] = arr[i];
                ans[1] = i;
                min = ans[0];
            }
        }
        return ans;
    }
    
    int max(int[][] arr, int m, int index) {
        int max = -1;
        for (int i=0;i<m;i++) max = Math.max(arr[i][index],max);
        return max;
    }
}
