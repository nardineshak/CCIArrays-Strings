public class rotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printMatrix(matrix);
        solution(matrix);
        System.out.println();
        printMatrix(matrix);
        
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solution(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    
    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        printMatrix(matrix);
        System.out.println();
    }

    public static void reverse(int[][] matrix){
        for (int[] matrix1 : matrix) {
            int left = 0;
            int right = matrix1.length - 1; 
            while (left < right) {
                int temp = matrix1[left];
                matrix1[left] = matrix1[right];
                matrix1[right] = temp;
                left++;
                right--;
            }
        }
    }
}


// transpose the matrix
// reverse every row of the matrix
