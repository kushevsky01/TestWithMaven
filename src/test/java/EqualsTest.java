import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualsTest {
    private static final Object Error = "Нет корней";

    @Test
    void roots1() {
        Equals eq = new Equals();
        double[] exp = new double[]{3};
        double[] act = eq.roots(1, -6, 9);
        assertArrayEquals(exp,act);
    }

    @Test
    void roots2() {
        Equals eq = new Equals();
        double[] exp = new double[]{-1,4};
        double[] act = eq.roots(1, -3, -4);
        assertArrayEquals(exp, act);
    }

    @Test
    void roots3() {
        Equals eq = new Equals();
        double[] act = eq.roots(5, 2, 3);
        assertEquals(Error, act);
    }


}