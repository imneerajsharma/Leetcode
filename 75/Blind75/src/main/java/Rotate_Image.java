
public class Rotate_Image {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row - 1; i++) {
            for (int j = i + 1; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("Transpose  Matrix:");
        printMatrix(matrix);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][col-1-j];
                matrix[i][col-1-j] = temp;
            }
        }
        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }

    public static void main(String[] args) {
        Rotate_Image rotate_image = new Rotate_Image();

        // Example input matrix
        int[][] matrix = {
                {1, 2, 3 ,4},
                {5, 6, 7 ,8},
                {9, 10, 11, 12 },
                {13, 14, 15, 16 }
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate_image.rotate(matrix);

//        System.out.println("Rotated Matrix:");
//        printMatrix(matrix);
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

