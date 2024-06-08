class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int number = 1;
        int index = 0;

        while(index < arr.length){
            while(number < arr[index]){
                if(number == arr[index]){
                    break;
                }
                else{
                    count++;
                    if(count == k){
                      return number;
                    }
                    number++;
                }
            }
            number++;
            index++;
        }
        if(count == 0 || count < k){
          while(count<k-1){
            count++;
            number++;
          }
        }
        return number;
    }
}