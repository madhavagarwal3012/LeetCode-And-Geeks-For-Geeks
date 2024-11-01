class Solution {
    public boolean reorderedPowerOf2(int n) {
        String number = String.valueOf(n);
        List<String> twoPowerList = new ArrayList<>();
        int base = 1;

        String baseString = "";
        while(baseString.length() <= number.length()){
            baseString = String.valueOf(base);
            if(baseString.length() == number.length()){
                twoPowerList.add(baseString);
            }
            base *= 2;
        }
        HashMap<Character, Integer> numberDigitMap = new HashMap<>();
        for(int numberIndex = 0; numberIndex < number.length(); numberIndex++){
            if(!numberDigitMap.containsKey(number.charAt(numberIndex))){
                numberDigitMap.put(number.charAt(numberIndex), 1);
            }
            else{
                numberDigitMap.put(number.charAt(numberIndex), numberDigitMap.get(number.charAt(numberIndex)) + 1);
            }
        }
        for(int index = 0; index < twoPowerList.size(); index++){
            boolean check = true;
            HashMap<Character, Integer> digitMap = new HashMap<>();
            number = twoPowerList.get(index);
            for(int numberIndex = 0; numberIndex < number.length(); numberIndex++){
                if(!digitMap.containsKey(number.charAt(numberIndex))){
                    if(!numberDigitMap.containsKey(number.charAt(numberIndex))){
                        check = false;
                        break;
                    }
                    digitMap.put(number.charAt(numberIndex), 1);
                }
                else{
                    digitMap.put(number.charAt(numberIndex), digitMap.get(number.charAt(numberIndex)) + 1);
                    if(digitMap.get(number.charAt(numberIndex)) > numberDigitMap.get(number.charAt(numberIndex))){
                        check = false;
                        break;
                    }
                }
            }
            if(check){
                return true;
            }
        }
        return false;
    }
}