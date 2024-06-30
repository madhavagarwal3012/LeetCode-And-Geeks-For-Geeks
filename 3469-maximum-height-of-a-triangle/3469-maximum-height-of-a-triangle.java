class Solution {
    public int helper(int red, int blue){
        int output = 0;
        int row = 1;
        
        while(blue >= 0 && red >= 0 && (blue >= row || red >= row)){
            if(row % 2 == 1){
                blue = blue - row;
                if(blue < 0){
                    return output;
                }
            }
            else{
                red = red - row;
                if(red < 0){
                    return output;
                }
            }
            output = row;
            row++;
        }
        return output;
    }
    public int maxHeightOfTriangle(int red, int blue) {
        int firstHeight = helper(red, blue);
        int secondHeight = helper(blue, red);
        
        return Math.max(firstHeight, secondHeight);
    }
}