class Solution {
    public String convert(String s, int numRows) {
        if(numRows > s.length()){
            return s;
        }
        String zigZag = "";
        String[] zz = new String[numRows];

        for(int index = 0; index < numRows; index++){
            zz[index] = "";
        }
        int sIndex = 0;
        while(sIndex < s.length()){
            for(int movingDownIndex = 0; movingDownIndex < numRows && sIndex < s.length(); movingDownIndex++, sIndex++){
                zz[movingDownIndex] += s.charAt(sIndex);
            }
            for(int movingUpIndex = numRows - 2; movingUpIndex > 0 && sIndex < s.length(); movingUpIndex--, sIndex++){
                zz[movingUpIndex] += s.charAt(sIndex);
            }
        }
        for(int index = 0; index < numRows; index++){
            zigZag += zz[index];
        }
        return zigZag;
    }
}