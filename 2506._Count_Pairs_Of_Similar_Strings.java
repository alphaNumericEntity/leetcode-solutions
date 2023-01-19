class Solution {
    public int similarPairs(String[] arr) {
        Map<String,Integer> map = new HashMap<>();
        for (var x : arr) {
            var sorted = f(x);
            map.put(sorted,map.getOrDefault(sorted,0)+1);
        }
        var ans = 0;
        for (var x : map.values()){
            ans += x * (x-1)/2;
        }
        return ans;
    }
    
    String f(String word) {
        Set<Character> set = new HashSet<>();
        
        for (char x : word.toCharArray()) set.add(x);
         StringBuilder sb = new StringBuilder();
        set.forEach(sb::append);
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
