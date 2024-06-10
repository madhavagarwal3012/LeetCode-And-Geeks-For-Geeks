class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int odd = 3;
        int sum = 0;
        int length = arr.length;
        int index = 0;
        while (index < length) {
            sum += arr[index];
            index++;
        }
        if (length % 2 == 1 && length > 1) {
            sum = sum+sum;
        }
        while (odd < length) {
            index = 0;
            while (index <= length - odd) {
                int subIndex = index;
                int count = 0;
                while (count < odd) {
                    sum += arr[subIndex];
                    subIndex++;
                    count++;
                }
                index++;
            }
            odd += 2;
        }
        return sum;
    }
}