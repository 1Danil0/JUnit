package test1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testGetDogName() {
        Dog dog = new Dog("Danil", 12);
        assertEquals("Danil", dog.getName());
    }

    @Test
    void testSetDogName() {
        Dog dog = new Dog("Danil", 12);
        dog.setName("Shit");
        assertEquals("Shit", dog.getName());
    }

    @Test
    void getAge() {

    }

    @Test
    void setAge() {

    }
}