class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int odd = 3;
        int index = 0;
        int sum = 0;
        int length = arr.length;
        while(index < length){
            sum = sum + arr[index];
            index++;
        }
        if(arr.length % 2 == 1 && arr.length > 1){
            sum = sum + sum;
        }
        while(odd != arr.length && odd < arr.length){
            index = 0;
            while(index <= arr.length - odd){
                int subIndex = index;
                int count = 0;
                while(count < odd){
                    sum = sum + arr[subIndex];
                    subIndex++;
                    count++;
                }
                index++;
            }
            odd+=2;
        }
        return sum;
    }
}