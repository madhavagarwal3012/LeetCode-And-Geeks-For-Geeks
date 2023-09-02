class Solution {
    public int maximumProduct(int[] nums) {
        int start = 0;
        int end = nums.length;
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int third_largest = Integer.MIN_VALUE;
        
        while (start < end) {
            if (nums[start] > largest) {
                third_largest = second_largest;
                second_largest = largest;
                largest = nums[start];
            } else if (nums[start] > second_largest) {
                third_largest = second_largest;
                second_largest = nums[start];
            } else if (nums[start] > third_largest) {
                third_largest = nums[start];
            }
            start++;
        }
        
        start = 0;
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        
        while (start < end) {
            if (nums[start] < smallest) {
                second_smallest = smallest;
                smallest = nums[start];
            } else if (nums[start] < second_smallest) {
                second_smallest = nums[start];
            }
            start++;
        }
        
        int product1 = largest * second_largest * third_largest;
        int product2 = largest * smallest * second_smallest;
        
        return Math.max(product1, product2);
    }
}
