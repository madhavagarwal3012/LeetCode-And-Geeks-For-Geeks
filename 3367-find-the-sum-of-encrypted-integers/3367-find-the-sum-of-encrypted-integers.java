class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int index = 0; index < nums.length; index++){
            int maxDigit = Integer.MIN_VALUE;
            String element = String.valueOf(nums[index]);
            for(int elementIndex = 0; elementIndex < element.length(); elementIndex++){
                if(maxDigit < Character.getNumericValue(element.charAt(elementIndex))){
                    maxDigit = Character.getNumericValue(element.charAt(elementIndex));
                }
            }
            int elementLength = element.length();
            element = "";
            for(int elementIndex = 0; elementIndex < elementLength; elementIndex++){
                element += maxDigit;
            }
            sum = sum + Integer.parseInt(element);
        }
        return sum;
    }
}