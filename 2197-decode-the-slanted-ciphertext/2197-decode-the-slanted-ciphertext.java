class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int matrixLength = encodedText.length() / rows;
        char[][] matrix = new char[rows][matrixLength];
        int index = 0;

        for(int row = 0; row < rows; row++){
            for(int column = 0; column < matrixLength; column++){
                matrix[row][column] = encodedText.charAt(index++);
            }
        }
        StringBuilder decrypt = new StringBuilder();
        boolean firstCharacterFlag = false;
        int diagonalRowStart = rows - 1;
        while(diagonalRowStart >= 0 && !firstCharacterFlag){
            int traversingRow = diagonalRowStart;
            int traversingColumn = 0;
            while(traversingRow < rows && traversingColumn < matrixLength){
                if(matrix[traversingRow][traversingColumn] != ' '){
                    firstCharacterFlag = true;
                }
                decrypt.append(matrix[traversingRow][traversingColumn]);
                traversingRow++;
                traversingColumn++;
            }
            if(!firstCharacterFlag && diagonalRowStart != 0){
                decrypt.setLength(0);
            }
            diagonalRowStart--;
        }
        int diagonalColumnStart = 1;
        while(diagonalColumnStart < matrixLength){
            int traversingRow = 0;
            int traversingColumn = diagonalColumnStart;
            while(traversingRow < rows && traversingColumn < matrixLength){
                if(matrix[traversingRow][traversingColumn] != ' '){
                    firstCharacterFlag = true;
                }
                decrypt.append(matrix[traversingRow][traversingColumn]);
                traversingRow++;
                traversingColumn++;
            }
            if(!firstCharacterFlag){
                decrypt.setLength(0);
            }
            diagonalColumnStart++;
        }
        while(decrypt.length() > 0 && decrypt.charAt(decrypt.length() - 1) == ' '){
            decrypt.deleteCharAt(decrypt.length() - 1);
        }
        return decrypt.toString();
    }
}