class Solution {
    public int[] twoSum(int[] numbers, int target) {
        List<Integer> targetList = new ArrayList<>();
        int index = 0;
        while(index < numbers.length){
            int tempIndex = index;
            int subIndex = numbers.length - 1;
            while(subIndex > index){
                if(numbers[index] + numbers[subIndex] ==  target){
                    targetList.add(index + 1);
                    targetList.add(subIndex + 1);
                    tempIndex = numbers.length - 1;
                    break;
                }
                else if(numbers[index] + numbers[subIndex] >  target){
                    subIndex--;
                }
                else{
                    index++;
                }
            }
            index = tempIndex + 1;
        }
        int arr[] = new int[targetList.size()];
        for(index = 0; index < targetList.size(); index++){
            arr[index] = targetList.get(index);
        }
        return arr;
    }
}