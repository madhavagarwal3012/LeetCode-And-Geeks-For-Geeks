class Solution {
    public int[] getConcatenation(int[] arr) {
        int steps=2;
        int index=0;
        int doubleIndex=0;
        
        int doublearr[] = new int[2*arr.length];
        while(steps>0){
            index=0;
            while(index<arr.length){
                doublearr[doubleIndex]=arr[index];
                index++;
                doubleIndex++;
            }
            steps--;
        }
        return doublearr;
    }
}