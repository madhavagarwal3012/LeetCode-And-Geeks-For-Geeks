class Solution {
    public int pivotInteger(int Totalnumbers) {
        if(Totalnumbers <= 1){
            return Totalnumbers;
        }
        else{
            int number = 1;
            while(number <= Totalnumbers){
                int sumtillPivot = (number * (number +1))/ 2;       //Formula from arithmetic series
                int sumtillN = (number + Totalnumbers) * (Totalnumbers - number + 1) /2;

                if(sumtillPivot == sumtillN){
                    return number;
                }
                number++;
            }
        }
        return -1;
    }
}