package practice31;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {

    @org. junit.Test
    public void sum()  throws Exception {
        Numbers numbers = new Numbers();
        int actual =numbers.sum(5);
        int expected =15;
        assertEquals(expected,actual);
    }
}