class Solution {
    public boolean checkZeroOnes(String s) {
        int numberofOne=0;
        int oneCount=0;
        
        int numberofZero=0;
        int zeroCount=0;
        
        int index=0;
        while(index<s.length()){
            if(s.charAt(index)=='1'){
                if(zeroCount<numberofZero){
                    zeroCount=numberofZero;
                }
                numberofZero=0;
                numberofOne++;
            }
            else{
                if(oneCount<numberofOne){
                    oneCount=numberofOne;
                }
                numberofOne=0;
                numberofZero++;
            }
            index++;
        }
        if(zeroCount<numberofZero){
            zeroCount=numberofZero;
        }
        if(oneCount<numberofOne){
            oneCount=numberofOne;
        }
        if(zeroCount<oneCount){
            return true;
        }
        return false;
    }
}