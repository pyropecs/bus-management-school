import School.*;


public class Main {
    public static void main(String[] args) {
        //School student is created
        Student student = new Student("Praveen","3rd street,school avenue",13,
                'M',2002,"10th std");
        //School teacher is created
        Teacher teacher = new Teacher("Nithya","4th street,school avenue",
                25,'F',30012,"B.ed Physics",50000);
        //School driver is created
        Driver driver = new Driver("Ashok","1st street,raja nagar",
                50,'M',10067,20);
        //Luxury Bus is created
        LuxuryBus luxuryBus = new LuxuryBus(2002,50);
        //Normal Bus is created
        NormalBus normalBus = new NormalBus(3001,50);
        //To enable air Conditioning
        luxuryBus.enableAirConditioning();
        //Assigning driver to luxury bus
        luxuryBus.assign(driver);
        //Assigning eligible passenger to luxury bus
        luxuryBus.assign(teacher);
        //Dropping off passenger from eligible bus
        luxuryBus.dropPerson(teacher);
        //Assigning ineligible passenger to a luxury bus
        luxuryBus.assign(student);
        //Assigning passenger to a normal bus
        normalBus.assign(teacher);
        //Assigning a passenger to a normal bus
        normalBus.assign(student);
        //Assigning a passenger to luxury bus, but they are already in normal bus
        luxuryBus.assign(teacher);
    }
}