class Solution {
    public int[] arrayRotation(int [] array, int direction, char side){
        direction = direction % array.length;
        int [] rotatedArray = new int[array.length];

        for(int index = 0; index < array.length; index++){
            int newIndex = (index + direction) % array.length;
            if(side == 'L'){
                rotatedArray[index] = array[newIndex];
            }
            else if(side == 'R'){
                rotatedArray[newIndex] = array[index];
            }
        }
        return rotatedArray;
    }
    public void rotate(int[] nums, int k) {
        int[] result = arrayRotation(nums, k, 'R');
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}