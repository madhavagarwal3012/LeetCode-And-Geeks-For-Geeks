class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> stableMountainsList =  new ArrayList<>();
        for(int index = 0; index < height.length; index++){
            if(index > 0 && height[index - 1] > threshold){
                stableMountainsList.add(index);
            }
        }
        return stableMountainsList;
    }
}