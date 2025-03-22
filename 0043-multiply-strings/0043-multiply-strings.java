class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        List<String> sumList = new ArrayList<>();

        for(int index1 = 0; index1 < num1.length(); index1++){
            int number1 = Character.getNumericValue(num1.charAt(index1));
            for(int index2 = 0; index2 < num2.length(); index2++){
                StringBuilder product = new StringBuilder();
                int number2 = Character.getNumericValue(num2.charAt(index2));
                product.append(number1 * number2);
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
            int sum = 0;
            for(int sumListIndex = sumList.size() -1; sumListIndex >= 0; sumListIndex--){
                String number = sumList.get(sumListIndex);
                sum+=Character.getNumericValue(number.charAt(index));
            }
            sum+= carry;
            if(sum > 9){
                carry = sum / 10;
                sum = sum % 10;
                product.append(String.valueOf(sum));
            }
            else{
                product.append(String.valueOf(sum));
                carry = 0;
            }
        }
        if(carry != 0){
            product.append(carry);
        }
        return product.reverse().toString();
    }
}