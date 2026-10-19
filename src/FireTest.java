import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FireTest {
    @Test
    public void testTimeToBurnExample() {
        char[][] forest = {
            {'t','.','.','t','t','t','t','.','t'},
            {'.','.','t','t','.','.','.','.','t'},
            {'.','.','t','t','t','t','t','t','t'},
            {'t','t','t','t','.','.','.','.','.'}
        };

        int matchR = 2;
        int matchC = 6;

        int expected = 8;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    // Add more tests!
    @Test
    public void testSingleTree() {
        char[][] forest = {{'t'}};
        assertEquals(0, Fire.timeToBurn(forest,0 ,0));
    }
    @Test 
    public void testMatchOutOfBounds() {
        char[][] forest = {{'t', 't', 't'}};
        assertEquals(0, Fire.timeToBurn(forest, 5 , 5));
        assertEquals(0, Fire.timeToBurn(forest, -1, 0));
    }

    @Test
    public void twoForestsTouchDiagonally() {
        char[][] forest = {
            {'t','t','t','.','.','t','t','t','t'},
            {'t','t','t','t','.','t','t','t','t'},
            {'t','t','t','.','t','t','t','t','t'},
            {'t','t','t','.','.','t','t','t','t'}
        };

        int matchR = 1;
        int matchC = 7;

        int expected = 4;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testMatchOnPeriod() {
        char[][] forest = {
            {'t', 't', '.', '.', '.'}
        };

        int matchR = 0;
        int matchC = 4;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
}
