class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> innerList = new ArrayList<>();
        List<List<Integer>> outerList = new ArrayList<>();
        innerList.add(1);
        outerList.add(innerList);
        innerList = new ArrayList<>();

        int previousIndex = 0;
        for(int row = 2; row <= numRows; row++){
            innerList.add(1);
            List<Integer> temp = outerList.get(previousIndex);
            for(int elementIndex = 0; elementIndex < temp.size() - 1; elementIndex++){
                int sum = temp.get(elementIndex) + temp.get(elementIndex + 1);
                innerList.add(sum);
            }
            innerList.add(1);
            outerList.add(innerList);
            innerList = new ArrayList<>();
            previousIndex++;
        }
        return outerList;
    }
}