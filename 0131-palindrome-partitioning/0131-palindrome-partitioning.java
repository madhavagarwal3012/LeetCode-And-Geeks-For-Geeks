class Solution {
    private boolean isPalindrome(String part){
        for(int startingIndex = 0, endingIndex = part.length() - 1; startingIndex < endingIndex; startingIndex++, endingIndex--){
            if(part.charAt(startingIndex) != part.charAt(endingIndex)){
                return false;
            }
        }
        return true;
    }
    private void partitionHelper(List<List<String>> result, List<String> palindromeParts, String s){
        if(s.length() == 0){
            result.add(new ArrayList<>(palindromeParts));
            return;
        }
        for(int index = 0; index < s.length(); index++){
            String part = s.substring(0, index + 1);
            if(isPalindrome(part)){
                palindromeParts.add(part);
                partitionHelper(result, palindromeParts, s.substring(index + 1));
                palindromeParts.remove(palindromeParts.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> palindromeParts = new ArrayList<>();
        partitionHelper(result, palindromeParts, s);

        return result;
    }
}