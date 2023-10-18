package test5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;
    @BeforeEach
    void createCar(){
        car = new Car("BMW", "YP666E", "Yaroslava", 2023);
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345", "123456", "1234"})
    @NullSource
    @EmptySource
    void testSetNumber(String number){
        car.setNumber(number);
        assertEquals(number, car.getNumber());
    }
    @ParameterizedTest
    @CsvSource({"'DE666A', 'DE666A'", "'YP666E', 'YP666E'"})
    void testSetNumberAnd(String number, String a){
        car.setNumber(number);
        assertEquals(a, car.getNumber());
    }

    @ParameterizedTest
    @CsvSource({"4, 14", "10, 20", "25, 35"})
    void sum(int input, int output) {
       assertEquals(output, car.sum(input));
    }
    @Test
    void sumFalse(){
        assertNotEquals(car.sum(10), 15);
    }
    @ParameterizedTest
    @DisplayName("My test`s name")
    @CsvFileSource(resources = {"/test.csv"}, numLinesToSkip = 1, delimiterString = "}")
    void tst(String input, String output){
        car.setNumber(input);
        assertEquals(output, car.getNumber());
    }
}