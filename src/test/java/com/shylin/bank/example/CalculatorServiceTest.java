package com.shylin.bank.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    // assertJ, hamcrest
    @Test
    void calculateShouldReturn2WhenAddOperationAddBothArgumentsAre1() {
        double actualResult = calculatorService.calculate(1, Operation.ADD, 1);
        double expectedResult = 2;

        assertEquals(expectedResult, actualResult, "expected result is not the same with actual");
    }

    @Test
    void calculateShouldReturn100WhenAddOperationAndArguments1And99() {
        double actualResult = calculatorService.calculate(1, Operation.ADD, 99);
        double expectedResult = 100;

        assertEquals(expectedResult, actualResult, "expected result is not the same with actual");
    }

    @Test
    void calculateShouldReturn98WhenMinusOperationAndArgument99And1() {
        double actualResult = calculatorService.calculate(99, Operation.MINUS, 1);
        double expectedResult = 98;

        assertEquals(expectedResult, actualResult, "expected result is not the same with actual");
    }

    @Test
    void calculateShouldReturn20WhenMultOperationAndArgument5And4() {
        double actualResult = calculatorService.calculate(5, Operation.MULT, 4);
        double expectedResult = 20;

        assertEquals(expectedResult, actualResult, "expected result is not the same with actual");
    }

    @Test
    void calculateShouldReturn5WhenDivOperationAndArgument20And4() {
        double actualResult = calculatorService.calculate(20, Operation.DIV, 4);
        double expectedResult = 5;

        assertEquals(expectedResult, actualResult, "expected result is not the same with actual");
    }

    @Test
    void calculateShouldThrowExceptionWhenDivisionIsZero() {
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> calculatorService.calculate(20, Operation.DIV, 0), "Exception should be throw when divisor is zero"
        );

        assertEquals(expectedException.getMessage(), "Divisor is zero");

    }

  /*  @Test
    public void test2() throws Exception {
        A expected = new A();
        expected.value = 1;
        A actual = new A();
        actual.value = 2;

        assertEquals(expected, actual);
    }

    public static void assertA(A expected, A actual) {
        assertEquals(expected.value, actual.value);
    }


    class A {
        public int value;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a = (A) o;
            return value == a.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }

        @Override
        public String toString() {
            return "A{" +
                    "value=" + value +
                    '}';
        }
    }*/
}