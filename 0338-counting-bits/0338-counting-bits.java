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
    public int[] countBits(int n) {
        int bitsArray[] = new int[n+1];
        for(int index = 0; index < bitsArray.length; index++){
            String binaryNumber = numbertoBinary(index);
            int bitsLength = 0;
            for(int bitIndex = 0; bitIndex < binaryNumber.length(); bitIndex++){
                if(binaryNumber.charAt(bitIndex) == '1'){
                    bitsLength++;
                }
            }
            bitsArray[index] = bitsLength;
        }
        return bitsArray;
    }
}