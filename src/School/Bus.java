package School;

import java.util.ArrayList;

public class Bus {
    private final int busNumber;
    private Driver busDriver;
    private ArrayList<Person> passengers;
    private int capacity;

    public Bus(int busNumber, int capacity) {
        this.busNumber = busNumber;
        this.capacity = capacity;

    }

    public void assign(Driver d) {

        if (busDriver != null) {
            this.busDriver = d;
        } else {
            System.out.println("Already bus driver is There");
        }

    }


    public void assign(Person p) {

        if (capacity >= passengers.size()) {
            passengers.add(p);
            capacity += 1;
        } else {
            System.out.println("Bus is Already full");
        }

    }

    public void dropPerson(Person p) {

        if (passengers.contains(p) == false) {
            passengers.remove(p);
            capacity -= 1;
        } else {
            System.out.println("the Passenger is not there in the bus");
        }

    }

    public void showBusDetails() {

        System.out.println("The Bus Number " + this.busNumber);
        System.out.println("the capacity of the bus " + this.capacity);

    }

}
