package SlidingPuzzle;

import java.util.Scanner;

import static SlidingPuzzle.MatrixControls.canMove;
import static SlidingPuzzle.MatrixControls.move;


/*
 * Mindaugas Jankauskis PRIf-15/2 student code: 20153673
 * Sliding puzzle
 * Slide numbers to empty space until it matches positions below:
 * 1 2 3
 * 4 5 6
 * 7 8
 * Move numbers to nearby empty position by writing them
 */
public class Puzzle extends GameMechanics {
    public static void main(String[] args) {
        int[][] gameMatrix = new int[3][3];
        int choice;
        Scanner keyboard = new Scanner(System.in);
        // Generate random puzzle solution for starting game
        randomizeMatrix(gameMatrix);
        // Game start
        System.out.println();
        printMatrix(END_GAME_MATRIX);
        System.out.println("↑ Move pieces until your puzzle looks like one above");
        while (true) {
            System.out.println("Current puzzle:");
            printMatrix(gameMatrix);
            System.out.println("Type a number (1 to 8) to move it to empty space:");
            choice = Integer.parseInt(keyboard.next());
            if (canMove(gameMatrix, choice)) {
                move(gameMatrix, choice);
            }
            else
                System.out.println(choice + " Cannot move selected number");
            if (isIdentical(gameMatrix, END_GAME_MATRIX)) {
                printMatrix(END_GAME_MATRIX);
                System.out.println("You won, Congratulations!!!");
                break;
            }
        }
    }
}