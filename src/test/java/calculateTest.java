import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculateTest {

    @Test
    void sum() {
        calculate cal = new calculate();
        double sum = cal.sum(5, 1.1);
        assertEquals(6.1, sum);
    }

    @Test
    void sub() {
        calculate cal = new calculate();
        double sub = cal.sub(5,1.2);
        assertEquals(3.8,sub);
    }

    @Test
    void mul() {
        calculate cal = new calculate();
        double mul = cal.mul(5,1.2);
        assertEquals(6, mul);
    }

    @Test
    void div() {
        calculate cal = new calculate();
        double div = cal.div(30.5, 5);
        assertEquals(6.1, div);
    }
}