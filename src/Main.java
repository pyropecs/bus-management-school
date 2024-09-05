import School.*;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Praveen","3rd street,school avenue",13,
                'M',2002,"10th std");
        Teacher teacher = new Teacher("Nithya","4th street,school avenue",
                25,'F',30012,"B.ed Physics",50000);
        Driver driver = new Driver("Ashok","1st street,raja nagar",
                50,'M',10067,20);
        LuxuryBus luxuryBus = new LuxuryBus(2002,50);
        NormalBus normalBus = new NormalBus(3001,50);
        //assigning driver to luxury bus
        luxuryBus.assign(driver);
        //assigning eligible passenger to luxury bus
        luxuryBus.assign(teacher);
        //dropping off passenger from eligible bus
        luxuryBus.dropPerson(teacher);
        //assigning ineligible passenger to a luxury bus
        luxuryBus.assign(student);
        //assigning passenger to a normal bus
        normalBus.assign(teacher);
        //assigning a passenger to a normal bus
        normalBus.assign(student);
        //assigning a passenger to luxury bus, but they are already in normal bus
        luxuryBus.assign(teacher);
    }
}