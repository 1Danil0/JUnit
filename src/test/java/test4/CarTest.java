package test4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;
    @BeforeEach
    void createCar(){
        car = new Car("BMW", "YP666E", "Yaroslava", 2023);
    }
    @Test
    void textPrivateEmptyMethod() {
        try {
            Method method = Car.class.getDeclaredMethod("getYear", null);
            method.setAccessible(true);
            assertEquals(2023, (int) method.invoke(car, null));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    void testPrivateParametrizedMethod() throws InvocationTargetException, IllegalAccessException {
        try {
            Method method = Car.class.getDeclaredMethod("getYear", int.class);
            method.setAccessible(true);
            assertEquals(2023, (int) method.invoke(car, 5));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

}