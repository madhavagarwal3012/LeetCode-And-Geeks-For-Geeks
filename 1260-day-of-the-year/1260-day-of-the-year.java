class Solution {
    public int dayOfYear(String date) {
        int year = (Character.getNumericValue(date.charAt(0)) * 1000) + (Character.getNumericValue(date.charAt(1)) * 100) + (Character.getNumericValue(date.charAt(2)) * 10) + Character.getNumericValue(date.charAt(3));
        int month = (Character.getNumericValue(date.charAt(5)) * 10) + Character.getNumericValue(date.charAt(6));
        int day = (Character.getNumericValue(date.charAt(8)) * 10) + Character.getNumericValue(date.charAt(9));

        int dayCount = 0;

        for(int monthIndex = 1; monthIndex < month; monthIndex++){
            if(monthIndex == 1){
                dayCount = dayCount + 31;
            }
            else if(monthIndex == 2){
                if(year % 4 == 0 && year % 100 != 0){
                    dayCount = dayCount + 29;
                }
                else if(year % 100 == 0 && year % 400 == 0){
                    dayCount = dayCount + 29;
                }
                else{
                    dayCount = dayCount + 28;
                }
            }
            else if(monthIndex == 3){
                dayCount = dayCount + 31;
            }
            else if(monthIndex == 4){
                dayCount = dayCount + 30;
            }
            else if(monthIndex == 5){
                dayCount = dayCount + 31;
            }
            else if(monthIndex == 6){
                dayCount = dayCount + 30;
            }
            else if(monthIndex == 7){
                dayCount = dayCount + 31;
            }
            else if(monthIndex == 8){
                dayCount = dayCount + 31;
            }
            else if(monthIndex == 9){
                dayCount = dayCount + 30;
            }
            else if(monthIndex == 10){
                dayCount = dayCount + 31;
            }
            else if(monthIndex == 11){
                dayCount = dayCount + 30;
            }
        }
        return dayCount + day;
    }
}