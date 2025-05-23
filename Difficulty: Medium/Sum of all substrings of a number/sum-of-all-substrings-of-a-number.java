class Solution {
    public static int sumSubstrings(String s) {
        // code here
        int sum = 0;
        for(int startingIndex = 0; startingIndex < s.length(); startingIndex++){
            for(int endingIndex = startingIndex + 1; endingIndex <= s.length(); endingIndex++){
                int number = Integer.parseInt(s.substring(startingIndex,endingIndex));
                sum += number;
            }
        }
        return sum;
    }
}