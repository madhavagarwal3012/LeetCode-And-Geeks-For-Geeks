class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int reverseCounter = 0;
        int[] diagonalElements = new int[mat.length * mat[0].length];
        ArrayList<Integer> diagonalList = new ArrayList<>();
        
        for(int diagonalElementsIndex = 0; diagonalElementsIndex < diagonalElements.length;){           for(int column = 0; column < mat[0].length; column++){
                int traversingColumn = column;
                int row = 0;
                if(reverseCounter > 0 && reverseCounter % 2 == 0){
                    while(row < mat.length && traversingColumn >= 0){
                        diagonalList.add(mat[row++][traversingColumn--]);
                    }
                    for(int index = diagonalList.size() - 1; index >= 0; index--){
                        diagonalElements[diagonalElementsIndex++] = diagonalList.get(index);
                    }
                    diagonalList = new ArrayList<>();
                }
                else{
                    while(row < mat.length && traversingColumn >= 0){
                        diagonalElements[diagonalElementsIndex++] = mat[row++][traversingColumn--];
                    }
                }
                reverseCounter++;
            }
            for(int row = 1; row < mat.length; row++){
                int traversingColumn = mat[0].length - 1;
                int traversingRow = row;
                if(reverseCounter > 0 && reverseCounter % 2 == 0){
                    while(traversingRow < mat.length && traversingColumn >= 0){
                        diagonalList.add(mat[traversingRow++][traversingColumn--]);
                    }
                    for(int index = diagonalList.size() - 1; index >= 0; index--){
                        diagonalElements[diagonalElementsIndex++] = diagonalList.get(index);
                    }
                    diagonalList = new ArrayList<>();
                }
                else{
                    while(traversingRow < mat.length && traversingColumn >= 0){
                        diagonalElements[diagonalElementsIndex++] = mat[traversingRow++][traversingColumn--];
                    }
                }
                reverseCounter++;
            }
        }
        return diagonalElements;
    }
}