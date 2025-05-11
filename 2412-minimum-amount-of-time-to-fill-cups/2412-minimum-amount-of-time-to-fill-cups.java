class Solution {
    public int fillCups(int[] amount) {
        int secondsCount = 0;
        Arrays.sort(amount);
        while(amount[0] != 0 || amount[1] != 0 || amount[2] != 0){
            if((amount[0] == amount[1]) && (amount[1] == amount[2])){
                secondsCount++;
                amount[0] = amount[0] - 1;
                amount[1] = amount[1] - 1;
            }
            else if(amount[0] == 0 && amount[1] == 0){
                secondsCount+=amount[2];
                amount[2] = 0;
            }
            else if(amount[0] == 0 && amount[2] == 0){
                secondsCount+=amount[1];
                amount[1] = 0;
            }
            else if(amount[2] == 0 && amount[1] == 0){
                secondsCount+=amount[0];
                amount[0] = 0;
            }
            else{
                secondsCount++;
                amount[2] = amount[2] - 1;
                amount[1] = amount[1] - 1;
            }
            Arrays.sort(amount);
        }
        return secondsCount;
    }
}