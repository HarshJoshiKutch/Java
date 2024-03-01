public class spiralmatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top row mate jya row starting first same j rahse but column change thase

            for (int j = startCol; j <= endCol; j++) // j for column and i for row
            {
                System.out.println(matrix[startRow][j] + " ");
            }

            // right mate jya have first row na last element ne cover kari lidho che and
            // have tema aapne tena niche na elemet thi start karivanu che

            for (int i = startRow + 1; i <= endRow; i++) // means upper thi niche sudhi jase
            {
                System.out.println(matrix[i][endCol] + " ");
            }

            // bottom boundry mate

            for (int j = endCol - 1; j >= startCol; j--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.println(matrix[endRow][j] + " ");
            }

            // left column mate

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.println(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        System.out.println();

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8, },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        printSpiral(matrix);
    }
}