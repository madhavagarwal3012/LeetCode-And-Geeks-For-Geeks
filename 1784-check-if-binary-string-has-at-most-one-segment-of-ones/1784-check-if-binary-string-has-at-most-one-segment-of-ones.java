class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()<=2 && s.charAt(0)=='1'){
            return true;
        }
        int oneCount=0;
        int numberofOne=0;
        int check=0;
        
        int index=0;
        while(index<s.length()){
            if(s.charAt(index)=='1'){
                if(check>0){
                    return false;
                }
                numberofOne++;
            }
            else{
                if(oneCount<numberofOne){
                    oneCount=numberofOne;
                    check++;
                }
                numberofOne=0;
            }
            index++;
        }
        if(oneCount<numberofOne){
            oneCount=numberofOne;
        }
        if(oneCount>1){
            return true;
        }
        if(oneCount<=1 && check>0){
            return true;
        }
        return false;
    }
}