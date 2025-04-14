class Solution {
    public int getKth(int lo, int hi, int k) {
        int[] powerArray = new int [hi - lo + 1];
        int[] kArray = new int[hi - lo + 1];
        HashMap<Integer, Integer> powerValueMap = new HashMap<>();
        int powerArrayIndex = 0;
        while(lo <= hi){
            int powerValue = 0;
            int loTemp = lo;
            while(loTemp != 1){
                if(powerValueMap.containsKey(lo)){
                    powerValue += powerValueMap.get(lo);
                    lo = 1;
                }
                else if(loTemp % 2 == 1){
                    loTemp = 3 * loTemp + 1;
                }
                else{
                    loTemp /= 2;
                }
                powerValue++;
            }
            if(!powerValueMap.containsKey(lo)){
                powerValueMap.put(lo, powerValue);
            }
            powerArray[powerArrayIndex] = powerValue;
            kArray[powerArrayIndex] = lo;
            for(int index = powerArrayIndex; index > 0; index--){
                if(powerArray[index] < powerArray[index - 1]){
                    int temp = powerArray[index];
                    powerArray[index] = powerArray[index - 1];
                    powerArray[index - 1] = temp;

                    temp = kArray[index];
                    kArray[index] = kArray[index - 1];
                    kArray[index - 1] = temp;
                }
            }
            powerArrayIndex++;
            lo++;
        }
        return kArray[k - 1];
    }
}