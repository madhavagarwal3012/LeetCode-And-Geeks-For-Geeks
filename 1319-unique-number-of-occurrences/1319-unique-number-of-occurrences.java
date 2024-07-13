class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Boolean> occurence = new HashMap<>();
        for(int index = 0; index < arr.length; index++){
            if(!map.containsKey(arr[index])){
                map.put(arr[index],1);
            }
            else{
                map.put(arr[index],map.get(arr[index])+1);
            }
        }
        for(int frequency : map.values()){
            if(!occurence.containsKey(frequency)){
                occurence.put(frequency,true);
            }
            else{
                return false;
            }
        }
        return true;
    }
}