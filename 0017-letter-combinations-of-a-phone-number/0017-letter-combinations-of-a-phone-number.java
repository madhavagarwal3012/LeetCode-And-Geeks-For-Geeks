class Solution {
    public List<String> letterCombinationsHelper(char digit){
        if(digit == '2'){
            List<String> list = new ArrayList<>();
            list.add("a");
            list.add("b");
            list.add("c");
            return list;
        }
        else if(digit == '3'){
            List<String> list = new ArrayList<>();
            list.add("d");
            list.add("e");
            list.add("f");
            return list;
        }
        else if(digit == '4'){
            List<String> list = new ArrayList<>();
            list.add("g");
            list.add("h");
            list.add("i");
            return list;
        }
        else if(digit == '5'){
            List<String> list = new ArrayList<>();
            list.add("j");
            list.add("k");
            list.add("l");
            return list;
        }
        else if(digit == '6'){
            List<String> list = new ArrayList<>();
            list.add("m");
            list.add("n");
            list.add("o");
            return list;
        }
        else if(digit == '7'){
            List<String> list = new ArrayList<>();
            list.add("p");
            list.add("q");
            list.add("r");
            list.add("s");
            return list;
        }
        else if(digit == '8'){
            List<String> list = new ArrayList<>();
            list.add("t");
            list.add("u");
            list.add("v");
            return list;
        }
        else if(digit == '9'){
            List<String> list = new ArrayList<>();
            list.add("w");
            list.add("x");
            list.add("y");
            list.add("z");
            return list;
        }
        else{
            List<String> list = new ArrayList<>();
            return list;
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> outputString = new ArrayList<>();
        if(digits.length() > 1){
            List<String> helperString = letterCombinationsHelper(digits.charAt(digits.length() - 1));
            List<String> resultString = letterCombinations(digits.substring(0, digits.length() - 1));
            for(int resultIndex = 0; resultIndex < resultString.size(); resultIndex++){
                for(int helperIndex = 0; helperIndex < helperString.size(); helperIndex++){
                    outputString.add(resultString.get(resultIndex) + helperString.get(helperIndex));
                }
            }
        }
        else if(digits.length() == 1){
            outputString = letterCombinationsHelper(digits.charAt(0));
        }
        return outputString;
    }
}