class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits);
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> threeDigitEvenList = new ArrayList<>();
        for(int index = 0; index < digits.length; index++){
            if(!map.containsKey(digits[index])){
                map.put(digits[index], 1);
            }
            else{
                map.put(digits[index], map.get(digits[index]) + 1);
            }
        }
        int maxDigit = digits[digits.length - 1] + 1;
        int maxNumber = maxDigit * 100;
        if(maxNumber == 1000){
            maxNumber = 999;
        }
        for(int startingNumber = 100; startingNumber <= maxNumber; startingNumber+=2){
            String number = String.valueOf(startingNumber);
            int digit1 = Character.getNumericValue(number.charAt(0));
            int digit2 = Character.getNumericValue(number.charAt(1));
            int digit3 = Character.getNumericValue(number.charAt(2));

            if((digit1 == digit2) && (digit2 == digit3)){
                if(map.containsKey(digit1) && map.get(digit1) > 2){
                    threeDigitEvenList.add(startingNumber);
                }
            }
            else if((digit1 == digit2) && (digit2 != digit3)){
                if(map.containsKey(digit1) && map.get(digit1) > 1){
                    if(map.containsKey(digit3) && map.get(digit3) > 0){
                        threeDigitEvenList.add(startingNumber);
                    }
                }
            }
            else if((digit3 == digit1) && (digit1 != digit2)){
                if(map.containsKey(digit3) && map.get(digit3) > 1){
                    if(map.containsKey(digit2) && map.get(digit2) > 0){
                        threeDigitEvenList.add(startingNumber);
                    }
                }
            }
            else if((digit2 == digit3) && (digit3 != digit1)){
                if(map.containsKey(digit2) && map.get(digit2) > 1){
                    if(map.containsKey(digit1) && map.get(digit1) > 0){
                        threeDigitEvenList.add(startingNumber);
                    }
                }
            }
            else{
                if(map.containsKey(digit1) && map.get(digit1) > 0){
                    if(map.containsKey(digit2) && map.get(digit2) > 0){
                        if(map.containsKey(digit3) && map.get(digit3) > 0){
                            threeDigitEvenList.add(startingNumber);
                        }
                    }
                }
            }
        }
        int[] threeDigitArray = new int[threeDigitEvenList.size()];
        for(int index = 0; index < threeDigitEvenList.size(); index++){
            threeDigitArray[index] = threeDigitEvenList.get(index);
        }
        return threeDigitArray;
    }
}