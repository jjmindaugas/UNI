package SlidingPuzzle;

abstract public class MatrixControls {
    // Check which position in matrix does the piece hold
    static boolean canMove(int[][] matrix, int piece) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == piece)
                    return canMovePiece(i, j, matrix);
            }
        }
        return false;
    }

    // Check which position in matrix does the piece hold
    static void move(int[][] matrix, int piece) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == piece) {
                    movePiece(i, j, matrix);
                    return;
                }
            }
        }
    }

    // Check whether selected piece can be moved
    private static boolean canMovePiece(int i, int j, int[][] matrix) {
        try {
            if (matrix[i + 1][j] == 0) return true;
        } catch (IndexOutOfBoundsException ignored) {
        }
        try {
            if (matrix[i - 1][j] == 0) return true;
        } catch (IndexOutOfBoundsException ignored) {
        }
        try {
            if (matrix[i][j + 1] == 0) return true;
        } catch (IndexOutOfBoundsException ignored) {
        }
        try {
            if (matrix[i][j - 1] == 0) return true;
        } catch (IndexOutOfBoundsException ignored) {
        }
        return false;
    }

    // Move selected piece to nearby empty (0) position
    private static void movePiece(int i, int j, int[][] matrix) {
        try {
            if (matrix[i + 1][j] == 0) {
                matrix[i + 1][j] = matrix[i][j];
                matrix[i][j] = 0;
                return;
            }
        } catch (IndexOutOfBoundsException ignored) {
        }
        try {
            if (matrix[i - 1][j] == 0) {
                matrix[i - 1][j] = matrix[i][j];
                matrix[i][j] = 0;
                return;
            }
        } catch (IndexOutOfBoundsException ignored) {
        }
        try {
            if (matrix[i][j + 1] == 0) {
                matrix[i][j + 1] = matrix[i][j];
                matrix[i][j] = 0;
                return;
            }
        } catch (IndexOutOfBoundsException ignored) {
        }
        try {
            if (matrix[i][j - 1] == 0) {
                matrix[i][j - 1] = matrix[i][j];
                matrix[i][j] = 0;
                return;
            }
        } catch (IndexOutOfBoundsException ignored) {
        }
    }
}
