class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> innerList = new ArrayList<>();
        List<List<Integer>> outerList = new ArrayList<>();

        int previousIndex = -1;
        for(int row = 1; row <= numRows; row++){
            innerList.add(1);
            int fillerIndex = 1;
            if(previousIndex < 0){
                outerList.add(innerList);
                previousIndex++;
                innerList = new ArrayList<>();
                continue;
            }
            List<Integer> temp = outerList.get(previousIndex);
            for(int elementIndex = 0; elementIndex < temp.size() - 1 && fillerIndex <= numRows - 2; elementIndex++){
                int sum = temp.get(elementIndex) + temp.get(elementIndex + 1);
                innerList.add(sum);
                fillerIndex++;
            }
            innerList.add(1);
            outerList.add(innerList);
            innerList = new ArrayList<>();
            previousIndex++;
        }
        return outerList;
    }
}