package test2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    static Dog dog;
//    @BeforeEach
//    void prepareData(){
//        dog = new Dog("Danil", 12);
//    }
    @BeforeAll
    static void prepareData(){
        dog = new Dog("Danil", 12);
    }

    @Test
    void getName() {
        assertEquals("Danil", dog.getName());
    }

    @Test
    void testSetDogName() {
        dog.setName("Shit");
        assertEquals("Danil", dog.getName());
    }
    @Test
    void testSetDogEmptyName() {
        Dog dog = new Dog();
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