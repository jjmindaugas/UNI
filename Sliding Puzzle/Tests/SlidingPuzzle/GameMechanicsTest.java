package SlidingPuzzle;


import static org.junit.Assert.*;

public class GameMechanicsTest {

    int [][]gameMatrix = new int[][]{{1,2,3},{1,2,3},{1,2,3}};
    int [][]gameMatrix2 = new int[][]{{1,2,3},{1,2,3},{1,2,3}};

    @org.junit.Test
    public void TestIsIdentical() {
        assertTrue(GameMechanics.isIdentical(gameMatrix,gameMatrix));
    }

    @org.junit.Test
    public void TestRandomizeMatrix() {
        GameMechanics.randomizeMatrix(gameMatrix2);
        assertNotEquals(gameMatrix,gameMatrix2);
    }
}