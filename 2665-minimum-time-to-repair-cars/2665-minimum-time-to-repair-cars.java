class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long minimumTime = 1, maximumTime = ranks[ranks.length - 1] * (long)cars * (long)cars;
        while(minimumTime < maximumTime){
            long mid = (minimumTime + maximumTime) / 2;
            long sum = 0;
            for(int index = 0; index < ranks.length; index++){
                sum += (long) Math.floor(Math.sqrt((double) mid / ranks[index]));
            }
            if (sum >= cars) {
                maximumTime = mid;  
            } 
            else {
                minimumTime = mid + 1;
            }
        }
        return minimumTime;
    }
}