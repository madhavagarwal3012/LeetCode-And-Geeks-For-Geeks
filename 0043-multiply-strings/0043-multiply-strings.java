class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        if(num2.length() > num1.length()){
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        List<String> sumList = new ArrayList<>();

        for(int index2 = 0; index2 < num2.length(); index2++){
            int number2 = Character.getNumericValue(num2.charAt(index2));
            for(int index1 = 0; index1 < num1.length(); index1++){
                StringBuilder product = new StringBuilder();
                int number1 = Character.getNumericValue(num1.charAt(index1));
                product.append(number2 * number1);
                if(index1 + index2 > 0){
                    int zeroLength = index1 + index2;
                    while(zeroLength > 0){
                        product.append(0);
                        zeroLength--;
                    }
                }
                sumList.add(product.toString());
            }
        }
        int maxLength = sumList.get(sumList.size() - 1).length();
        for(int index = 0; index < sumList.size(); index++){
            StringBuilder zeroes = new StringBuilder();
            int length = maxLength - sumList.get(index).length();
            for(int countZero = 0; countZero < length; countZero++){
              zeroes.append("0");
            }
            sumList.set(index, zeroes + sumList.get(index));
        }
        StringBuilder product = new StringBuilder();
        int carry = 0;
        for(int index = maxLength - 1; index >= 0; index--){
            int sum = carry;
            for (int sumListIndex = sumList.size() - 1; sumListIndex >= 0; sumListIndex--) {
                sum += Character.getNumericValue(sumList.get(sumListIndex).charAt(index));
            }
            carry = sum / 10;
            product.append(sum % 10);
            sum+= carry;
        }
        if (carry > 0) {
            product.append(carry);
        }
        return product.reverse().toString();
    }
}