class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> subSequence = new ArrayList<>();
        subSequence.add(words[0]);
        int alternateCheck = groups[0];
        for(int index = 1; index < groups.length; index++){
            if(alternateCheck != groups[index]){
                subSequence.add(words[index]);
            }
            alternateCheck = groups[index];
        }
        return subSequence;
    }
}