class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        ArrayList<Integer> remainingElementList = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int index = 0; index < arr1.length; index++){
            if(!map1.containsKey(arr1[index])){
                map1.put(arr1[index],1);
            }
            else{
                map1.put(arr1[index],map1.get(arr1[index])+1);
            }
        }
        for(int index = 0; index < arr2.length; index++){
            if(!map2.containsKey(arr2[index])){
                map2.put(arr2[index],1);
            }
            else{
                map2.put(arr2[index],map2.get(arr2[index])+1);
            }
        }
        for(int index = 0; index < arr1.length; index++){
            if(!map2.containsKey(arr1[index])){
                remainingElementList.add(arr1[index]);
            }
        }
        int indexRemained = 0;
        for(int index = 0; index < arr2.length; index++){
            int frequency = map1.get(arr2[index]);
            map1.remove(arr2[index]);
            map2.remove(arr2[index]);
            while(frequency > 0){
                arr1[indexRemained] = arr2[index];
                indexRemained++;
                frequency--;
            }
        }
        for(int index = 0; index < remainingElementList.size(); index++){
            arr1[indexRemained] = remainingElementList.get(index);
            indexRemained++;
        }
        return arr1;
    }
}