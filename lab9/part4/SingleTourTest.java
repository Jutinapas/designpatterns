package lab9.part4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleTourTest {

    private SingleTour tourWatPhraKaew;

    @BeforeEach
    void setup() {
        tourWatPhraKaew = new SingleTour("Tour Wat Phra Kaew", 500, 50, 20);
    }

    @Test
    void testSetName() {
        assertEquals("Tour Wat Phra Kaew", tourWatPhraKaew.getName());
        tourWatPhraKaew.setName("Wat Phra Kawe Trip");
        assertEquals("Wat Phra Kawe Trip", tourWatPhraKaew.getName());
    }

    @Test
    void setPrice() {
        assertEquals(500, tourWatPhraKaew.getPrice());
        tourWatPhraKaew.setPrice(550);
        assertEquals(550, tourWatPhraKaew.getPrice());
    }

    @Test
    void setAllSeats() {
        assertEquals(30, tourWatPhraKaew.getAvailableSeats());
        tourWatPhraKaew.setAllSeats(100);
        assertEquals(80, tourWatPhraKaew.getAvailableSeats());
    }

    @Test
    void setReservedSeats() {
        assertEquals(30, tourWatPhraKaew.getAvailableSeats());
        tourWatPhraKaew.setReservedSeats(40);
        assertEquals(10, tourWatPhraKaew.getAvailableSeats());
    }

    @Test
    void getName() {
        assertEquals("Tour Wat Phra Kaew", tourWatPhraKaew.getName());
    }

    @Test
    void getPrice() {
        assertEquals(500, tourWatPhraKaew.getPrice());
    }

    @Test
    void getAvailableSeats() {
        assertEquals(30, tourWatPhraKaew.getAvailableSeats());
    }

}