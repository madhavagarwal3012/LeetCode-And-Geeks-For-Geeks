class Solution {
    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));

        String binaryDate = "";
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
            binaryDate += "1";
            for(int index = 0; index < power; index++){
                binaryDate += "0";
            }
            binaryDate += "-";
        }
        else{
            binaryDate += "1";
            year = year - (int)Math.pow(2, power);
            power--;
            while(power >= 0){
                if(Math.pow(2, power) <= year){
                    binaryDate += "1";
                    year = year - (int)Math.pow(2,power);
                }
                else{
                    binaryDate += "0";
                }
                power--;
            }
            binaryDate += "-";
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
            binaryDate += "1";
            for(int index = 0; index < power; index++){
                binaryDate += "0";
            }
            binaryDate += "-";
        }
        else{
            binaryDate += "1";
            month = month - (int)Math.pow(2, power);
            power--;
            while(power >= 0){
                if(Math.pow(2, power) <= month){
                    binaryDate += "1";
                    month = month - (int)Math.pow(2,power);
                }
                else{
                    binaryDate += "0";
                }
                power--;
            }
            binaryDate += "-";
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
            binaryDate += "1";
            for(int index = 0; index < power; index++){
                binaryDate += "0";
            }
        }
        else{
            binaryDate += "1";
            day = day - (int)Math.pow(2, power);
            power--;
            while(power >= 0){
                if(Math.pow(2, power) <= day){
                    binaryDate += "1";
                    day = day - (int)Math.pow(2,power);
                }
                else{
                    binaryDate += "0";
                }
                power--;
            }
        }
        return binaryDate;
    }
}