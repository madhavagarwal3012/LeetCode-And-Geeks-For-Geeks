class Solution {
    public int romanToInt(String s) {
        
        int start=0;
        int end=s.length();
        int sum=0;
        int previous_sum=0;
        int final_sum=0;
        while(start<end){
            
            if(s.charAt(start)=='I'){
                sum=1;
            }
            else if(s.charAt(start)=='V'){
                sum=5;
            }
            else if(s.charAt(start)=='X'){
                sum=10;
            }
            else if(s.charAt(start)=='L'){
                sum=50;
            }
            else if(s.charAt(start)=='C'){
                sum=100;
            }
            else if(s.charAt(start)=='D'){
                sum=500;
            }
            else if(s.charAt(start)=='M'){
                sum=1000;
            }
            if(previous_sum>=sum){
                final_sum=sum+final_sum;
            }
            else if(sum>previous_sum){
                sum=sum-previous_sum;
                final_sum=final_sum-previous_sum;
                final_sum=sum+final_sum;
            }
            start++;
            previous_sum=sum;
        }
        return final_sum;
    }
}