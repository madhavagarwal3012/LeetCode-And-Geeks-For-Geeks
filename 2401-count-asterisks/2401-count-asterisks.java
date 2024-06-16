class Solution {
    public int countAsterisks(String s) {
        int index = 0;
        int countPair = 0;
        int countAsterisks = 0;

        while(index < s.length()){
            if(s.charAt(index) == '|'){
                countPair++;
            }
            if(countPair == 0 || countPair == 2){
                if(s.charAt(index) == '*'){
                    countAsterisks++;
                }
            }
            if(countPair == 4){
                countPair = 0;
            }
            index++;
        }
        return countAsterisks;
    }
}