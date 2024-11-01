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
        for(int index = 0; index < twoPowerList.size(); index++){
            HashMap<Character, Integer> digitMap = new HashMap<>();
            number = twoPowerList.get(index);
            for(int numberIndex = 0; numberIndex < number.length(); numberIndex++){
                if(!digitMap.containsKey(number.charAt(numberIndex))){
                    digitMap.put(number.charAt(numberIndex), 1);
                }
                else{
                    digitMap.put(number.charAt(numberIndex), digitMap.get(number.charAt(numberIndex)) + 1);
                }
            }
            boolean check = true;
            HashMap<Character, Integer> numberDigitMap = new HashMap<>();
            number = String.valueOf(n);
            for(int numberIndex = 0; numberIndex < number.length(); numberIndex++){
                if(!numberDigitMap.containsKey(number.charAt(numberIndex))){
                    if(!digitMap.containsKey(number.charAt(numberIndex))){
                        check = false;
                        break;
                    }
                    numberDigitMap.put(number.charAt(numberIndex), 1);
                }
                else{
                    numberDigitMap.put(number.charAt(numberIndex), numberDigitMap.get(number.charAt(numberIndex)) + 1);
                    if(numberDigitMap.get(number.charAt(numberIndex)) > digitMap.get(number.charAt(numberIndex))){
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