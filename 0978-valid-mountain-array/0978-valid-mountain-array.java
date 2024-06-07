class Solution {
    public boolean validMountainArray(int[] arr) {
        int count=0;
        int index=0;
        int checkincrease=0;
        int checkdecrease=0;
        
        while(index<arr.length-1){
            if(arr[index]<arr[index+1]){
                if(index==0){
                    checkincrease++;
                }
                count++;
            }
            else if(arr[index]>arr[index+1]){
                if(index>0){
                    checkdecrease++;
                }
                if(index<arr.length-2 && arr[index+1]<arr[index+2]){
                    return false;
                }
                count++;
            }
            else{
                count--;
            }
            index++;
        }
        if(count==arr.length-1 && arr.length>=3 && checkincrease>0 && checkdecrease>0){
            return true;
        }
        return false;
    }
}