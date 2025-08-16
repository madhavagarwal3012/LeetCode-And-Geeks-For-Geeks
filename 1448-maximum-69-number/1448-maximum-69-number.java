class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        num = 0;
        int position = 10;
        boolean check = true;
        int length = sb.length();
        for(int index = 0; index < length; index++){
            num *= position;
            if(sb.charAt(index) == '6' && check){
                num += 9;
                check = false;
            }
            else{
                num += Character.getNumericValue(sb.charAt(index));
            }
        }
        return num;
    }
}