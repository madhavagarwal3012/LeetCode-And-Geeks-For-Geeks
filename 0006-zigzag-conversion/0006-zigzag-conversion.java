class Solution {
    public String convert(String s, int numRows) {
        if(numRows > s.length()){
            return s;
        }
        String zigZag = "";
        String[] zz = new String[numRows];

        for(int stringIndex = 0; stringIndex < numRows; stringIndex++){
            zz[stringIndex] = "";
        }
        int characterIndex = 0;
        while(characterIndex < s.length()){
            for(int movingDownIndex = 0; movingDownIndex < numRows && characterIndex < s.length(); movingDownIndex++, characterIndex++){
                zz[movingDownIndex] += s.charAt(characterIndex);
            }
            for(int movingUpIndex = numRows - 2; movingUpIndex > 0 && characterIndex < s.length(); movingUpIndex--, characterIndex++){
                zz[movingUpIndex] += s.charAt(characterIndex);
            }
        }
        for(int stringIndex = 0; stringIndex < numRows; stringIndex++){
            zigZag += zz[stringIndex];
        }
        return zigZag;
    }
}