package School;

import java.util.ArrayList;

public class Bus {
    private final int busNumber;
    private Driver busDriver;
    protected ArrayList<Person> passengers = new ArrayList<>();
    protected int capacity;


    public Bus(int busNumber, int capacity) {

        this.busNumber = busNumber;
        this.capacity = capacity;

    }


//run time polymorphism
    public void assign(Driver driver) {
//assign the bus driver to the bus
        if (busDriver == null) {
            this.busDriver = driver;
            System.out.println("driver " + driver.getName() + " assigned successfully on bus number " + busNumber);
        } else {
            System.out.println("Already bus driver "+ this.busDriver.getName()+ " is There");
        }

    }


    public void assign(Person passenger) {
//assign the person to the bus
        int passengersCapacity = capacity - 1;
        if ( passengersCapacity  >= passengers.size() ) {
            passengers.add(passenger);
            System.out.println("passenger " + passenger.getName() +  " assigned successfully on bus number " + busNumber);
        } else {
            System.out.println("Bus is Already full");
        }

    }

    public void dropPerson(Person passenger) {
//person will get drop from the bus
        if (passengers.contains(passenger) == true) {
            passengers.remove(passenger);
            System.out.println("passenger " + passenger.getName() + " dropped successfully");
        } else {
            System.out.println("the Passenger "+passenger.getName() +" is not there in the bus");
        }

    }


//getters


    public int getBusNumber() {
        return busNumber;
    }

    public int getCapacity() {
        return capacity;
    }
}
