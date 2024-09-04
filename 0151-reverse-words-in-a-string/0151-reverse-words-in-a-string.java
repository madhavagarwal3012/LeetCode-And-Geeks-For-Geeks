class Solution {
    public String reverseWords(String s) {
        List<String> originalString = new ArrayList<String>();
        int startingIndex = 0;
        for(int index = 0; index < s.length(); index++){
            if(s.charAt(index) == ' ' && index != 0 && index != s.length() - 1){
                originalString.add(s.substring(startingIndex, index).trim());
                while(index < s.length() && s.charAt(index) == ' '){
                    index++;
                    startingIndex = index;
                }

            }
        }
        if(startingIndex < s.length()){
            originalString.add(s.substring(startingIndex, s.length()).trim());
        }
        s = "";

        for(int index = originalString.size() - 1; index >=0; index--){
            s += originalString.get(index);
            s += " ";
        }
        return s.trim();
    }
}