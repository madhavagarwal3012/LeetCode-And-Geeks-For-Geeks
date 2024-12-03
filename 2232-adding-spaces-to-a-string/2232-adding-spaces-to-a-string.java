class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder output = new StringBuilder();
        output.append(s);
        int indexValue = 1;
        for(int index = 0; index < spaces.length; index++){
            output.insert(spaces[index], ' ');
            if(index < spaces.length - 1){
                spaces[index + 1] = spaces[index + 1] + indexValue;
                indexValue++;
            }
        }
        return output.toString();
    }
}