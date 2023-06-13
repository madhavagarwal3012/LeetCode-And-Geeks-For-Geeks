class Solution {
    public int[] plusOne(int[] digits) {
        int digits_length=digits.length;
        int len=digits.length;
        int end=len-1;
        int carry=1;
        if(digits[0]==9 && len==1){
            len++;
        }
        if(len>1 && digits[end]==9 && digits_length>1 && digits[0]==9 && digits[1]==9 ){
            len++;
        }
        int ans[]=new int[len];
        int total=0;
        
        
        while(end>=0){
            total=digits[end]+carry;
            carry=total/10;
            ans[end]=total%10;
            if(digits[end]>8 && digits[0]>8 && digits_length==1){
                ans[end]=0;
                ans[0]=1;
                break;
            }
            else if(digits_length>1 &&digits[digits_length-1]==9 && digits[0]>8 && digits[1]>8 ){
                ans[end]=0;
                ans[0]=1;
                
            }
            end--;
        }
        return ans;
    }
 
}