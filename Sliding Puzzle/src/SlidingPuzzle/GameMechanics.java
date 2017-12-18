package SlidingPuzzle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class GameMechanics {
    // Generate final solution
    static int[][] END_GAME_MATRIX = new int[3][3];

    static {
        END_GAME_MATRIX[0][0] = 1;
        END_GAME_MATRIX[0][1] = 2;
        END_GAME_MATRIX[0][2] = 3;
        END_GAME_MATRIX[1][0] = 4;
        END_GAME_MATRIX[1][1] = 5;
        END_GAME_MATRIX[1][2] = 6;
        END_GAME_MATRIX[2][0] = 7;
        END_GAME_MATRIX[2][1] = 8;
        END_GAME_MATRIX[2][2] = 0;
    }

    // Generate random matrix for game start
    static void randomizeMatrix(int[][] randomMatrix) {
        List<Integer> randomArrayList = new ArrayList<>(9);
        for (int i = 0; i < 9; i++) randomArrayList.add(i);
        Collections.shuffle(randomArrayList);
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                randomMatrix[i][j] = randomArrayList.get(k);
                k++;
            }
        }
    }

    // Check whether your current matrix and final solution are identical
    static boolean isIdentical(int[][] gameMatrix, int[][] endgameMatrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (endgameMatrix[i][j] != gameMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Print matrix
    static void printMatrix(int[][] mas2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mas2[i][j] != 0)
                    System.out.print(mas2[i][j] + " ");
                else if (mas2[i][j] == 0)
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

