class Solution {
    public int romanToInt(String s) {
        // int I=1;
        // int V=5;
        // int X=10;
        // int L=50;
        // int C=100;
        // int D=500;
        // int M=1000;
        
        int start=0;
        int sum=0;
        int previous_sum=0;
        int final_sum=0;
        int end=s.length();
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
            if(start==0){
                final_sum=sum;
                previous_sum=sum;
                start++;
                continue;
            }
            if(previous_sum>=sum ||sum==final_sum){
                final_sum=sum+final_sum;
                System.out.println("final_sum fs1:"+final_sum);
            }
            else if(sum>previous_sum){
                System.out.println("sum :"+sum);
                System.out.println("previous_sum :"+previous_sum);
                System.out.println("final_sum fs2 :"+final_sum);
                
                sum=sum-previous_sum;
                final_sum=final_sum-previous_sum;
                final_sum=sum+final_sum;
            }
            System.out.println("start :"+start);
            System.out.println("sum :"+sum);
            start++;
            System.out.println("previous_sum :"+previous_sum);
            previous_sum=sum;
        }
        
        return final_sum;
    }
}