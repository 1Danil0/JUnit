package test7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog;
    @BeforeEach
    void createDog(){
        dog = new Dog("Danil", 22);
    }

    @Test
    void exception() {
        assertThrows(IllegalArgumentException.class, () ->
            dog.exception()
        );
    }
    @Test
    void excep(){
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> dog.exception());
        assertEquals("exc", exception.getMessage());
    }
}