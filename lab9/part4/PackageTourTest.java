package lab9.part4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageTourTest {

    private SingleTour tourWatPhraKaew;
    private SingleTour tourTaladNam;
    private PackageTour tourBangkok;

    @BeforeEach
    void setup() {
        tourWatPhraKaew = new SingleTour("Tour Wat Phra Kaew", 500, 50, 38);
        tourTaladNam = new SingleTour("Tour Talad Nam", 350, 20, 10);
        tourBangkok = new PackageTour("Tour Bangkok");
        tourBangkok.addTour(tourWatPhraKaew);
        tourBangkok.addTour(tourTaladNam);
    }

    @Test
    void addTour() {
        SingleTour tourWatArun = new SingleTour("Tour Wat Arun", 300, 25, 10);
        assertEquals(2, tourBangkok.getToursSize());
        tourBangkok.addTour(tourWatArun);
        assertEquals(3, tourBangkok.getToursSize());
    }

    @Test
    void removeTour() {
        assertEquals(2, tourBangkok.getToursSize());
        tourBangkok.removeTour(tourWatPhraKaew);
        assertEquals(1, tourBangkok.getToursSize());
    }

    @Test
    void getName() {
        assertEquals("Tour Bangkok", tourBangkok.getName());
    }

    @Test
    void getPrice() {
        assertEquals(765, tourBangkok.getPrice());
    }

    @Test
    void getAvailableSeats() {
        assertEquals(10, tourBangkok.getAvailableSeats());
    }

}