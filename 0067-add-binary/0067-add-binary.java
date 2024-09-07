class Solution {
    public String addBinary(String a, String b) {
        if(a.length() < b.length()){
            String c = a;
            a = b; 
            b = c;
        }
        int carry = 0;
        String binarySum = "";
        for(int aIndex = a.length() - 1, bIndex = b.length() - 1; aIndex >=0; aIndex--){
            int aValue = Character.getNumericValue(a.charAt(aIndex)) + carry;
            if(aValue == 2){
                aValue = 0;
                carry = 1;
            }
            else{
                carry = 0;
            }
            int bValue = -1;
            if(bIndex >= 0){
                bValue = Character.getNumericValue(b.charAt(bIndex));
                bIndex--;
            }
            if(bValue == -1){
                binarySum += String.valueOf(aValue);
            }
            else if(aValue + bValue == 2){
                binarySum += "0";
                carry = 1;
            }
            else{
                binarySum += String.valueOf(aValue + bValue);
            }
        }
        if(carry == 1){
            binarySum += "1";
        }
        String reverse = "";
        for(int binarySumIndex = binarySum.length() - 1; binarySumIndex >= 0; binarySumIndex--){
            reverse += binarySum.charAt(binarySumIndex);
        }
        return reverse;
    }
}