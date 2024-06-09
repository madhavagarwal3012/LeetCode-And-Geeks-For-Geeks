class Solution {
    public static int helper(int n){     // I have made this function to do */ operation. 
        int output = 0;                 //  Before performing subtraction because 
        if(n > 2){                     //   Precedence of */ is higher than - operator.
            output = n * (--n);
            output = output / (--n);
        }
        return output;
    }
    public static int clumsy(int n) {
        int count = 1;
        int factorial = n;
        int factHelp = 0;
        n = n - 1;

        while(n > 0){
            if(count == 1){
                factorial = factorial * n;
            }
            else if(count == 2){
                factorial = factorial / n;
            }
            else if(count == 3){
                factorial = factorial + n;
            }
            else if(count == 4){
                factHelp = helper(n);
                if(factHelp == 0){
                  factHelp = n;
                }
                factorial = factorial - factHelp;
                n-=2;
                count-=2;

            }
            n--;
            count++;
            if(count == 5){
                count = 1;
            }
        }
        return factorial;
    }
}