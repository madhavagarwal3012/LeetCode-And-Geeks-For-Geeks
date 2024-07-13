class Solution {
    public int maxNumberOfBalloons(String text) {
        int bCount = 0;
        int aCount = 0;
        int lCount = 0;
        int oCount = 0;
        int nCount = 0;
        int balloonCount = 0;
        for(int index = 0; index < text.length(); index++){
            if(text.charAt(index) == 'b'){
                bCount++;
            }
            else if(text.charAt(index) == 'a'){
                aCount++;
            }
            else if(text.charAt(index) == 'l'){
                lCount++;
            }
            else if(text.charAt(index) == 'o'){
                oCount++;
            }
            else if(text.charAt(index) == 'n'){
                nCount++;
            }
        }
        while(bCount > 0  && aCount > 0 && lCount > 1 && oCount > 1 && nCount > 0){
            int characterCount = 0;
            if(bCount > 0){
                characterCount++;
                bCount--;
            }
            if(aCount > 0){
                characterCount++;
                aCount--;
            }
            if(lCount > 1){
                characterCount+=2;
                lCount-=2;
            }
            if(oCount > 1){
                characterCount+=2;
                oCount-=2;
            }
            if(nCount > 0){
                characterCount++;
                nCount--;
            }
            if(characterCount == 7){
                balloonCount++;
            }
        }
        return balloonCount;
    }
}