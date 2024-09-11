class Solution {
    public String numbertoBinary(int number){
        if(number == 0){
            return "0";
        }
        int base = 1;
        int power = 0;
        String binaryNumber = "";
        while(base < number){
            base = base * 2;
            if(base > number){
                break;
            }
            power++;
        }
        if(Math.pow(2, power) == number){
            binaryNumber += "1";
            for(int index = 0; index < power; index++){
                binaryNumber += "0";
            }
        }
        else{
            binaryNumber += "1";
            number = number - (int)Math.pow(2, power);
            power--;
            while(power >= 0){
                if(Math.pow(2, power) <= number){
                    number = number - (int)Math.pow(2, power);
                    binaryNumber += "1";
                }
                else{
                    binaryNumber += "0";
                }
                power--;
            }
        }
        return binaryNumber;
    }
    public int minBitFlips(int start, int goal) {
        String number1 = numbertoBinary(start);
        String number2 = numbertoBinary(goal);
        int index1 = 0;
        int index2 = 0;

        int flips = 0;

        if(number1.length() < number2.length()){
            int difference = number2.length() - number1.length();
            index1 = difference;
            for(int index = 0; index < index1; index++){
                number1 = "0" + number1;
            }
            for(int index = 0; index < number2.length(); index++){
                if(number1.charAt(index) != number2.charAt(index)){
                    flips++;
                }
            }
        }
        else if(number2.length() < number1.length()){
            int difference = number1.length() - number2.length();
            index2 = difference;
            for(int index = 0; index < index2; index++){
                number2 = "0" + number2;
            }
            for(int index = 0; index < number1.length(); index++){
                if(number1.charAt(index) != number2.charAt(index)){
                    flips++;
                }
            }
        }
        else{
            for(int index = 0; index < number1.length(); index++){
                if(number1.charAt(index) != number2.charAt(index)){
                    flips++;
                }
            }
        }
        return flips;
    }
}