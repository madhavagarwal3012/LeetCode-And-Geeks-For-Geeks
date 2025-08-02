class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> innerList = new ArrayList<>();
        List<List<Integer>> outerList = new ArrayList<>();

        if(numRows == 1){
            innerList.add(1);
            outerList.add(innerList);
            return outerList;
        }
        else if(numRows == 2){
            innerList.add(1);
            outerList.add(innerList);

            innerList = new ArrayList<>();
            innerList.add(1);
            innerList.add(1);

            outerList.add(innerList);
            return outerList;
        }
        outerList = generate(2);
        int previousIndex = 1;
        for(int row = 3; row <= numRows; row++){
            innerList.add(1);
            int fillerIndex = 1;
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