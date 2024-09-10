class Solution {
    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));

        String binary = "";
        int base = 1;
        int power = 0;
        int bitCount = 1;

        while(base < year){
            base = base * 2;
            if(base > year){
                break;
            }
            power++;
            bitCount++;
        }
        if(Math.pow(2,power) == year){
            binary += "1";
            for(int index = 0; index < power; index++){
                binary += "0";
            }
            binary += "-";
        }
        else{
            binary += "1";
            year = year - (int)Math.pow(2, power);
            power--;
            while(power >= 0){
                if(Math.pow(2, power) <= year){
                    binary += "1";
                    year = year - (int)Math.pow(2,power);
                }
                else{
                    binary += "0";
                }
                power--;
            }
            binary += "-";
        }

        base = 1;
        power = 0;
        bitCount = 1;

        while(base < month){
            base = base * 2;
            if(base > month){
                break;
            }
            power++;
            bitCount++;
        }
        if(Math.pow(2,power) == month){
            binary += "1";
            for(int index = 0; index < power; index++){
                binary += "0";
            }
            binary += "-";
        }
        else{
            binary += "1";
            month = month - (int)Math.pow(2, power);
            power--;
            while(power >= 0){
                if(Math.pow(2, power) <= month){
                    binary += "1";
                    month = month - (int)Math.pow(2,power);
                }
                else{
                    binary += "0";
                }
                power--;
            }
            binary += "-";
        }

        base = 1;
        power = 0;
        bitCount = 1;

        while(base < day){
            base = base * 2;
            if(base > day){
                break;
            }
            power++;
            bitCount++;
        }
        if(Math.pow(2,power) == day){
            binary += "1";
            for(int index = 0; index < power; index++){
                binary += "0";
            }
        }
        else{
            binary += "1";
            day = day - (int)Math.pow(2, power);
            power--;
            while(power >= 0){
                if(Math.pow(2, power) <= day){
                    binary += "1";
                    day = day - (int)Math.pow(2,power);
                }
                else{
                    binary += "0";
                }
                power--;
            }
        }
        return binary;
    }
}