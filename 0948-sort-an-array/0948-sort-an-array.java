class Solution {
    public int[] sortArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for(int index = 0; index < arr.length; index++){
            if(!map.containsKey(arr[index])){
                if(arr[index] < minimum){
                    minimum = arr[index];
                }
                if(arr[index] > maximum){
                    maximum = arr[index];
                }
                map.put(arr[index], 1);
            }
            else{
                map.put(arr[index], map.get(arr[index]) + 1);
            }
        }
        int index = 0;
        for(int count = minimum; count <= maximum; count++){
            if(map.containsKey(count)){
                for(int frequency = map.get(count); frequency > 0; frequency--){
                    arr[index] = count;
                    index++;
                }
            }
        }
        map.clear();
        return arr;
    }
}