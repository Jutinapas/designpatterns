package lab9.part4;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {

    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();

    public PackageTour(String packageName) {
        this.packageName = packageName;
    }

    public void addTour(Tour tour) {
        this.tours.add(tour);
    }

    public void removeTour(Tour tour) {
        this.tours.remove(tour);
    }

    public int getToursSize() {
        return tours.size();
    }

    @Override
    public String getName() {
        return this.packageName;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : this.tours)
            total += t.getPrice();
        return total * 0.9;
    }

    @Override
    public int getAvailableSeats() {
        int total = this.tours.get(0).getAvailableSeats();
        for (Tour t : this.tours)
            if (t.getAvailableSeats() < total)
                total = t.getAvailableSeats();
        return total;
    }

}
