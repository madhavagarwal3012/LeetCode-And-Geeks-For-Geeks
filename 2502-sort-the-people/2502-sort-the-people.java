class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for(int index = 0; index < heights.length; index++){
            map.put(heights[index], names[index]);
        }
        Arrays.sort(heights);
        int sortedIndex = 0;
        for(int index = heights.length - 1; index >= 0; index--){
            names[sortedIndex] = map.get(heights[index]);
            sortedIndex++;
        }
        return names;
    }
}