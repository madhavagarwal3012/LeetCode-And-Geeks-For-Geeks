class Solution {
    public boolean isFascinating(int n) {
        String fascinating = "";
        fascinating += n;
        fascinating += 2*n;
        fascinating += 3*n;

        int number = 1;
        int count = 0;
        int duplicate = 0;
        while(number <= 9){
            String digit = String.valueOf(number);
            duplicate = 0;
            int index = 0;
            while(index < fascinating.length()){
                if(number == Character.getNumericValue(fascinating.charAt(index))){
                    duplicate++;
                }
                index++;
            }
            if(duplicate > 1){
                return false;
            }
            if(fascinating.contains(digit)){
                count++;
            }
            number++;
        }
        return count == 9;
    }
}