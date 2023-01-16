class Solution {
    public List<Integer> twoOutOfThree(int[] arr1, int[] arr2, int[] arr3) {
        var ans = new HashSet<Integer>();
        Set <Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        for (int x : arr1) set1.add(x);
        for (int x: arr2) if (set1.contains(x)) ans.add(x); else set2.add(x);
        set1.addAll(set2);
        for (int x: arr3) if (set1.contains(x)) ans.add(x);
        return new ArrayList<>(ans);
    }
}
