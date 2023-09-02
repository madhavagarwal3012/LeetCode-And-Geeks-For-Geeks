class Solution {
    public int maximumProduct(int[] nums) {
        int start = 0;
        int end = nums.length;
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int third_largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        while (start < end) {
            int current = nums[start];

            if (current > largest) {
                third_largest = second_largest;
                second_largest = largest;
                largest = current;
            } else if (current > second_largest) {
                third_largest = second_largest;
                second_largest = current;
            } else if (current > third_largest) {
                third_largest = current;
            }

            if (current < smallest) {
                second_smallest = smallest;
                smallest = current;
            } else if (current < second_smallest) {
                second_smallest = current;
            }

            start++;
        }

        return Math.max(largest * second_largest * third_largest, largest * smallest * second_smallest);
    }
}
