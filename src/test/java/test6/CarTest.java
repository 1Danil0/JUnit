package test6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;
    @BeforeEach
    void createCar() {
        car = new Car("BMW", "YP666E", "Iaroslava", 2023);
    }
    @Test
    @Execution(ExecutionMode.CONCURRENT)
    void getOwner(){
        assertEquals("Iaroslava", car.getOwner());
    }
    @Test
    @Execution(ExecutionMode.CONCURRENT)
    void getOwners(){
        assertArrayEquals(new String[]{"Iaroslava"}, car.getOwners().toArray());
    }
    @Test
    @Execution(ExecutionMode.CONCURRENT)
    void getName(){
        assertEquals("BMW", car.getName());
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
//    @DisabledOnOs(OS.MAC)
    @DisabledOnJre(JRE.JAVA_17)
    void sum() {
        assertEquals("YP666E", car.getNumber());
    }
}