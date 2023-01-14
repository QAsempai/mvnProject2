package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        SQRService service = new SQRService();

        int actual = service.calculate(300, 200);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        SQRService service = new SQRService();

        int actual = service.calculate(300, 300);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test4() {
        SQRService service = new SQRService();

        int actual = service.calculate(100, 3000);
        int expected = 45;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test5() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
}
