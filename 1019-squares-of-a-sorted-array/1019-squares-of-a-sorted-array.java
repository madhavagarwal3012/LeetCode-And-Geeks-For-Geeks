class Solution {
    public void heapSort(int [] arr){
		int length = arr.length;
		for(int index = 0; index < length; index++) {
			int childIndex = index;
			while(childIndex > 0) {
				if(arr[childIndex] > arr[(childIndex - 1) / 2]) {
					int temp = arr[(childIndex - 1) / 2];
					arr[(childIndex - 1) / 2] = arr[childIndex];
					arr[childIndex] = temp;
				}
				else {
					break;
				}
				childIndex = (childIndex - 1) / 2;
			}
		}
		length--;
		while(length > 0) {
			int temp = arr[0];
			arr[0] = arr[length];
			arr[length] = temp;
			
			int parentIndex = 0;
			int maxIndex = parentIndex;
			int leftChildIndex = 2 * maxIndex + 1;
			int rightChildIndex = 2 * maxIndex + 2;
			
			while(leftChildIndex < length) {
				if(arr[leftChildIndex] > arr[maxIndex]) {
					maxIndex = leftChildIndex;
				}
				if(rightChildIndex < length && arr[rightChildIndex] > arr[maxIndex]) {
					maxIndex = rightChildIndex;
				}
				if(maxIndex == parentIndex) {
					break;
				}
				temp = arr[parentIndex];
				arr[parentIndex] = arr[maxIndex];
				arr[maxIndex] = temp;
				
				parentIndex = maxIndex;
				leftChildIndex = 2 * maxIndex + 1;
				rightChildIndex = 2 * maxIndex + 2;
			}
			length--;
		}
    }
    public int[] sortedSquares(int[] nums) {
        for(int index = 0; index < nums.length; index++){
            nums[index] = nums[index] * nums[index];
        }
        heapSort(nums);
        return nums;
    }
}