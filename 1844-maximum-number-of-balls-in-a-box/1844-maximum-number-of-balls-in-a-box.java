class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int maximumFrequency = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ballNumber = lowLimit; ballNumber <= highLimit; ballNumber++){
            int sum = 0;
            String number = String.valueOf(ballNumber);
            for(int index = 0; index < number.length(); index++){
                sum = sum + Character.getNumericValue(number.charAt(index));
            }
            if(!map.containsKey(sum)){
                map.put(sum,1);
            }
            else{
                map.put(sum,map.get(sum)+1);
            }
        }
        for(int frequency : map.values() ){
            if(maximumFrequency < frequency){
                maximumFrequency = frequency; 
            }
        }
        return maximumFrequency;
    }
}