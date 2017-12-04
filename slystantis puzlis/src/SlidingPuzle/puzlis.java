package SlidingPuzle;

import java.util.Scanner;

/*
 * Mindaugas Jankauskis 20153673
 * Sliding puzzle
 * tuscias langas, kitus sudelioti reikia is eiles:
 * 1 2 3
 * 4 5 6
 * 7 8
 * kad laimeti
 */
public class puzlis extends gameMechanics{
    public static void main(String[] args) {
        int[][] gameMatrix = new int[3][3];

        int pasirinkimas;
        Scanner keyboard = new Scanner(System.in);

        // zaidimo puzle prazioje
        randomizeMatrix(gameMatrix);

        // prad
        System.out.println();
        printMatrix(END_GAME_MATRIX);
        System.out.println("↑ taip turi atrodyti puzlis kad laimetum");

        while (true) {
            System.out.println("dabartinis puzlio issidestymas:");
            printMatrix(gameMatrix);

            System.out.println("Iveskite skaiciu nuo 1 iki 8 kuri norite pajudinti i tuscia vieta:");
            pasirinkimas = Integer.parseInt(keyboard.next());

            if (canMove(gameMatrix, pasirinkimas))
                move(gameMatrix, pasirinkimas);
            else
                System.out.println(pasirinkimas + " neįmanoma pajudint");

            if (isIdentical(gameMatrix, END_GAME_MATRIX)) {
                printMatrix(END_GAME_MATRIX);
                System.out.println("laimejai puzlio zaidima!!!");
                break;
            }
        }
    }
}
