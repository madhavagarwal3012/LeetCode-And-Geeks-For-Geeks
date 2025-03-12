class Solution {
    public boolean checkInclusion(String s1, String s2) {
        List<String> substringList = new ArrayList<>();
        int[] frequency = new int[256];
        for(int startingIndex = 0; startingIndex < s2.length(); startingIndex++){
            for(int endingIndex = startingIndex + 1; endingIndex <= s2.length(); endingIndex++){
                if(endingIndex - startingIndex == s1.length()){
                    substringList.add(s2.substring(startingIndex, endingIndex));
                }
            }
        }
        for(int substringListIndex = 0; substringListIndex < substringList.size(); substringListIndex++){
            if(substringList.get(substringListIndex).length() == s1.length()){
                for(int index = 0; index < s1.length(); index++){
                    frequency[s1.charAt(index)]++;
                    frequency[substringList.get(substringListIndex).charAt(index)]--;
                }
                boolean flag = true;
                for(int index = 0; index < frequency.length; index++){
                    if(frequency[index] != 0){
                        flag = false;
                    }
                }
                if(flag){
                    return true;
                }
                frequency = new int[256];
            }
        }
        return false;
    }
}