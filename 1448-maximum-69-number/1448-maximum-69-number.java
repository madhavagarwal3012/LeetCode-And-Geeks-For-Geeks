class Solution {
    public int maximum69Number (int num) {
        int count6 = 0;
        int count9 = 0;
        int index = 0;

        String number = String.valueOf(num);
        String maximum = "";
        while(index < number.length()){
            if(number.charAt(index)=='6'){
                if(count6 == 0){
                    maximum +='9';
                }
                else{
                    maximum +=number.charAt(index);
                }
                count6++;
            }
            else{
                maximum +=number.charAt(index);
                count9++;
            }
            index++;
        }
        if(count9 == number.length()){
            return num;
        }
        else{
            int max = Integer.parseInt(maximum);
            return max;
        }

    }
}