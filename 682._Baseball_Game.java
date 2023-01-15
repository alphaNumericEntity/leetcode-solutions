class Solution {
    public int calPoints(String[] arr) {
        var list = new ArrayList<Integer>();
        for (var x : arr) {
            switch(x) {
                case "C":
                    list.remove(list.size() - 1);
                    break;
                case "D":{
                    var val1 = list.get(list.size()-1);
                    //var val2 = list.get(list.size()-2);
                    list.add(val1*2);
                    break;
                }
                    
                case "+":
                    var val1 = list.get(list.size()-1);
                    var val2 = list.get(list.size()-2);
                    list.add(val1+val2);
                    break;
                default:
                    list.add(Integer.parseInt(x));
            }
        }
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
