class Solution {
    public int countEven(int num) {
        int digitSum = 0;
        int countNum = 2;

        while(countNum <= num){
            int sum = 0;
            int subIndex = 0;
            String number = String.valueOf(countNum);
            while(subIndex < number.length()){
                sum = sum + Character.getNumericValue(number.charAt(subIndex));
                subIndex++;
            }
            if(sum % 2 == 0){
                digitSum++;
            }
            countNum++;
        }
        return digitSum++;
    }
}