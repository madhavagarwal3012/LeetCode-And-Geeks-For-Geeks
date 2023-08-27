class Solution {
    public int addDigits(int n) {
        if(n>9){
            String str= Integer.toString(n);
            int i=1;
            int sum=Character.getNumericValue(str.charAt(0));
            while(i<str.length()){
                sum=sum+Character.getNumericValue(str.charAt(i));
                i++;
            }
            if(sum>9){
                str= Integer.toString(sum);
                i=1;
                int final_sum=Character.getNumericValue(str.charAt(0));
                while(i<str.length()){
                    final_sum=final_sum+Character.getNumericValue(str.charAt(i));
                    i++;
                }
                if(final_sum>9){
                   str= Integer.toString(final_sum);
                    i=1;
                    final_sum=Character.getNumericValue(str.charAt(0));
                    while(i<str.length()){
                        final_sum=final_sum+Character.getNumericValue(str.charAt(i));
                        i++;
                    } 
                }
                return final_sum;
            }
            else{
                return sum;
            }
            
        }
        return n;
    }
}