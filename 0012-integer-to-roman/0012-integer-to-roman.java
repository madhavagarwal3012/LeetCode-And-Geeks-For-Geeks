class Solution {
    public String intToRoman(int num) {
        String roman = "";
        while(num >= 1000){
            roman += "M";
            num = num - 1000;
        }
        while(num >= 900){
            roman += "CM";
            num = num - 900;
        }
        while(num >= 500){
            roman += "D";
            num = num - 500;
        }
        while(num >= 400){
            roman += "CD";
            num = num - 400;
        }
        while(num >= 100){
            roman += "C";
            num = num - 100;
        }
        while(num >= 90){
            roman += "XC";
            num = num - 90;
        }
        while(num >= 50){
            roman += "L";
            num = num - 50;
        }
        while(num >= 40){
            roman += "XL";
            num = num - 40;
        }
        while(num >= 10){
            roman += "X";
            num = num - 10;
        }
        while(num >= 9){
            roman += "IX";
            num = num - 9;
        }
        while(num >= 5){
            roman += "V";
            num = num - 5;
        }
        while(num >= 4){
            roman += "IV";
            num = num - 4;
        }
        while(num >= 1){
            roman += "I";
            num = num - 1;
        }
        return roman;
    }
}