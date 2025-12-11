class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        HashMap<Integer, int[]> xCoordinatesMap = new HashMap<>();
        HashMap<Integer, int[]> yCoordinatesMap = new HashMap<>();
        int coveredBuildingsCount = 0;

        for(int[] building :  buildings){
            if(!xCoordinatesMap.containsKey(building[0])){
                int[] minMaxArray = new int[2];
                minMaxArray[0] = building[1];
                minMaxArray[1] = building[1];
                xCoordinatesMap.put(building[0], minMaxArray);
            }
            else{
                int[] minMaxArray = xCoordinatesMap.get(building[0]);
                int minimumY = Math.min(minMaxArray[0], building[1]);
                int maximumY = Math.max(minMaxArray[1], building[1]);
                minMaxArray[0] = minimumY;
                minMaxArray[1] = maximumY;
            }
            if(!yCoordinatesMap.containsKey(building[1])){
                int[] minMaxArray = new int[2];
                minMaxArray[0] = building[0];
                minMaxArray[1] = building[0];
                yCoordinatesMap.put(building[1], minMaxArray);
            }
            else{
                int[] minMaxArray = yCoordinatesMap.get(building[1]);
                int minimumX = Math.min(minMaxArray[0], building[0]);
                int maximumX = Math.max(minMaxArray[1], building[0]);
                minMaxArray[0] = minimumX;
                minMaxArray[1] = maximumX;
            }
        }
        for(int[] building : buildings){
            int x = building[0];
            int y = building[1];

            int[] minMaxCoordinatesOfX = yCoordinatesMap.get(building[1]);

            int[] minMaxCoordinatesOfY = xCoordinatesMap.get(building[0]);

            if(x > minMaxCoordinatesOfX[0] && x < minMaxCoordinatesOfX[1] && y > minMaxCoordinatesOfY[0] && y < minMaxCoordinatesOfY[1]){
                coveredBuildingsCount++;
            }
        }
        return coveredBuildingsCount;
    }
}