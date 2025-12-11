class Solution {
    public List<String> buildArray(int[] target, int n) {
        HashSet<Integer> elementSet = new HashSet<>();
        for(int index = 0; index < target.length; index++){
            elementSet.add(target[index]);
        }

        List<String> result = new ArrayList<>();
        int maxThreshold = target[target.length - 1];
        for(int number = 1; number <= n; number++){
            if(number > maxThreshold){
                break;
            }
            result.add("Push");
            if(!elementSet.contains(number)){
                result.add("Pop");
            }
        }
        return result;
    }
}