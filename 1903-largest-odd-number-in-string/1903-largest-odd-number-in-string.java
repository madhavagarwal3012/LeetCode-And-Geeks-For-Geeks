class Solution {
    public String largestOddNumber(String num) {
        int end=num.length()-1;
	    while(end>=0){
            if(num.charAt(end)%2==1){
                return num.substring(0,end+1);
            }
            end--;
        }
        return "";
    }
}
