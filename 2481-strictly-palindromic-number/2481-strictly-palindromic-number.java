class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int baseCount = 2; baseCount <= n - 2; baseCount++){
            String number = Integer.toString(n, baseCount);
            String reversedNumber = "";

            for(int index = number.length() - 1; index >= 0; index--){
                reversedNumber += number.charAt(index);
            }
            if(!number.equals(reversedNumber)){
                return false;
            }
        }
        return true;
    }
}