package lab9.part5;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    final static int READY = 0;
    final static int SELECTED = 1;
    final static int SUCCESS = 2;

    int state;
    List<Station> stations;
    Station currentStation;
    Station selectedStation;
    double currentCost;

    public VendingMachine(Station currentStation, double currentCost) {
        this.state = READY;
        this.stations = new ArrayList<>();
        this.currentStation = currentStation;
        this.currentCost = currentCost;
        System.out.println("Current Station : " + currentStation.getName());
    }

    public void addStation(Station station) {
        this.stations.add(station);
    }

    public void removeStation(Station station) {
        this.stations.remove(station);
    }

    public void selectStation(int index) {
        if (state == READY) {
            this.selectedStation = stations.get(index);
            if (currentStation.getCost() >= selectedStation.getCost()) {
                currentCost += currentStation.getCost() - selectedStation.getCost();
            } else if (currentStation.getCost() < selectedStation.getCost()) {
                currentCost += selectedStation.getCost() - currentStation.getCost();
            }
            state = SELECTED;
            System.out.println("Need " + currentCost + " More");
        } else System.out.println("You can't select station for now");
    }

    public void insertCoin(double coin) {
        currentCost -= coin;
        if (currentCost > 0) System.out.println("Need " + currentCost + " More");
        else if (currentCost == 0) {
            state = SUCCESS;
            dispenseTicket();
        }
        else if (currentCost < 0) {
            eject(currentCost * -1);
            state = SUCCESS;
            dispenseTicket();
        }

    }

    public void eject(double cost) {
        //ทอนเงิน
    }

    public void dispenseTicket() {
        if (state == SUCCESS) {
            //ออกตั๋วตาม selectedStation
        }
        else System.out.println("You can't get ticket for now");
    }

}
