public class zeroMatrix {
    public static void main(String[] args) {
        
    }

    public static void setZeroes(int[][] matrix) {
        boolean zeroFirstRow = false;
        boolean zeroFirstCol = false;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                zeroFirstCol = true;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                zeroFirstRow = true;
            }
        }

        // go through rest of matrix marking first row and col whether it needs to be zeroed out 
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // zeroe out the marked rows and cols 
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // check and zero out first row and col
        if (zeroFirstRow) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        if (zeroFirstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
    
}

// so that we don't need to utilize more space than necessary
// store the first row and left column 
// go through matrix starting from first + i and elft + i
// set the first and left to 0 and then go through first row and left
// and appropriately set that row and column 0
// 
