class Solution {
    public String convertToTitle(int columnNumber) {
        HashMap<Integer, String> map = new HashMap<>();
        for(int order = 1; order <= 26; order++){
            map.put(order, "" + (char)('A' + (order - 1)));
        }
        String excelColumn = "";
        if(columnNumber > 26 && columnNumber < 100){
            if(columnNumber % 26 != 0){
                int quotient = columnNumber / 26;
                int divisibleValue = 26 * quotient;
                excelColumn = map.get(divisibleValue/26) + map.get(columnNumber - divisibleValue);
            }
            else{
                excelColumn = map.get(columnNumber / 26 - 1) + map.get(26);
            }
        }
        else{
            while(columnNumber > 26){
                if(columnNumber % 26 == 0){
                    excelColumn = map.get(26) + excelColumn;
                    columnNumber = columnNumber / 26 - 1;
                }
                else{
                    int quotient = columnNumber / 26;
                    int divisibleValue = 26 * quotient;
                    excelColumn = map.get(columnNumber - divisibleValue) + excelColumn;
                    columnNumber = quotient;
                }
            }
            excelColumn = map.get(columnNumber) + excelColumn;
        }
        return excelColumn;
    }
}