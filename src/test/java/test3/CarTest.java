package test3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;
    @BeforeEach
    void createCar(){
        car = new Car("BMW", "YP666E", "Yaroslava", 2023);
    }

    @Test
    void getName() {
        assertEquals("BMW", car.getName());
    }

    @Test
    void getNumber() {
        assertEquals("YP666E", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("DE666A");
        assertEquals("DE666A", car.getNumber());
    }

    @Test
    void getOwner() {
        assertEquals("Yaroslava", car.getOwner());
    }

    @Test
    void setOwner() {
        car.setOwner("Danil");
        assertEquals("Danil", car.getOwner());
    }

    @Test
    void getYear() {
        assertEquals(2023, car.getYear());
    }
    @Test
    void getOwners(){
        assertArrayEquals(new String[]{"Yaroslava"}, car.getOwners().toArray());
    }
    @Test
    void addOwner(){
        car.addOwner("Danil");
        assertArrayEquals(new String[]{"Yaroslava", "Danil"}, car.getOwners().toArray());
    }
    @Test
    void getOwnersWithNewOwner(){
        car.setOwner("Danil");
        assertArrayEquals(new String[]{"Yaroslava", "Danil"}, car.getOwners().toArray());
    }
}