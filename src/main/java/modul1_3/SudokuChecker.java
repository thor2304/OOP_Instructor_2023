package modul1_3;

public class SudokuChecker {
    public static void main(String[] args) {
        int[][] sudokuPlate = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {2, 3, 4, 5, 6, 7, 8, 9, 1},
                {3, 4, 5, 6, 7, 8, 9, 1, 2},

                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {5, 6, 7, 8, 9, 1, 2, 3, 4},
                {6, 7, 8, 9, 1, 2, 3, 4, 5},

                {7, 8, 9, 1, 2, 3, 4, 5, 6},
                {8, 9, 1, 2, 3, 4, 5, 6, 7},
                {9, 1, 2, 3, 4, 5, 6, 7, 8}
        };

        boolean valid = true;

        for (int[] row : sudokuPlate) {
            if (arrayIsNotUnique(row)) {
                valid = false;
                break;
            }
        }

        if (!valid) {
            System.out.println("Sudoku plate not valid due to rows");
            return;
        }

        // Loop through the columns
        for (int i = 0; i < sudokuPlate[0].length; i++) {
            // Create an array to hold the value for this column
            int[] column = new int[sudokuPlate.length];

            // Loop through the rows to fill out the column with the value from this row
            for (int j = 0; j < sudokuPlate.length; j++) {
                column[j] = sudokuPlate[j][i];
            }

            // Check if this column is valid
            if (arrayIsNotUnique(column)) {
                valid = false;
                break;
            }
        }


        if (!valid) {
            System.out.println("Sudoku plate not valid due to columns");
            return;
        }


        // Loop through the columns of squares
        for (int squareIndex = 0; squareIndex < 9; squareIndex++) {
            // Create an array to hold the value for this column
            int[] square = new int[9];
            // The below indexes are indexes when viewing the board as 9 large squares
            int columnIndex = squareIndex % 3;
            int rowIndex = squareIndex / 3; // This will floor the division

            // Loop through the values to fill out the square with the values
            for (int j = 0; j < 9; j++) {
                square[j] = sudokuPlate[(j % 3) + 3 * rowIndex][(j / 3) + 3 * columnIndex];
            }

            // Check if this column is valid
            if (arrayIsNotUnique(square)) {
                valid = false;
                break;
            }
        }


        if (!valid) {
            System.out.println("Sudoku plate not valid due to Squares");
            return;
        }

        System.out.println("Sudoku plate is valid");
    }

    private static boolean arrayIsNotUnique(int[] numbers) {
        boolean[] numbersSeen = new boolean[10]; // We go to 10, since we will see numbers from 1 to 9
        for (int number :
                numbers) {
            if (numbersSeen[number]) {
                return true;
            }
            numbersSeen[number] = true;
        }

        return false;
    }

}
