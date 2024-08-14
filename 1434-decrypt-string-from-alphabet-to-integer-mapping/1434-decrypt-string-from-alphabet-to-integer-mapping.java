class Solution {
    public String freqAlphabets(String s) {
        HashMap<String, String> map =  new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.put("6", "f");
        map.put("7", "g");
        map.put("8", "h");
        map.put("9", "i");
        map.put("10#", "j");
        map.put("11#", "k");
        map.put("12#", "l");
        map.put("13#", "m");
        map.put("14#", "n");
        map.put("15#", "o");
        map.put("16#", "p");
        map.put("17#", "q");
        map.put("18#", "r");
        map.put("19#", "s");
        map.put("20#", "t");
        map.put("21#", "u");
        map.put("22#", "v");
        map.put("23#", "w");
        map.put("24#", "x");
        map.put("25#", "y");
        map.put("26#", "z");
        
        int indexCheck = 0;
        String decrypt = "";
        for(int index = 0; index < s.length(); index++){
            if(s.charAt(index) == '#'){
                for(int subIndex = indexCheck; subIndex < index - 2; subIndex++){
                    String encrypt = s.substring(subIndex, subIndex + 1);
                    decrypt += map.get(encrypt);
                }
                String encrypt = s.substring(index - 2, index + 1);
                decrypt += map.get(encrypt);
                indexCheck = index + 1;
            }
        }
        if(indexCheck < s.length()){
            for(int index = indexCheck; index < s.length(); index++){
                String encrypt = s.substring(index, index + 1);
                decrypt += map.get(encrypt);
            }
        }
        return decrypt;
    }
}