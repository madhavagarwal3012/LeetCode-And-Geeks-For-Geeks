class NumArray {
    int data[];
    int sum;
    public NumArray(int[] nums) {
        data = nums;
        sum = 0;
    }
    
    public int sumRange(int left, int right) {
        sum = 0;
        for(int index=left; index<=right; index++){
            sum = sum + data[index];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */