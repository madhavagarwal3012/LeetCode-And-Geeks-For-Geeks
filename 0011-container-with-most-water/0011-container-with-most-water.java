class Solution {
    public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;
        while(leftPointer < rightPointer){
            int rectangleArea = Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer);
            if(rectangleArea > maxArea){
                maxArea = rectangleArea;
            }
            if(height[leftPointer] < height[rightPointer]){
                leftPointer++;
            }
            else{
                rightPointer--;
            }
        }
        return maxArea;
    }
}