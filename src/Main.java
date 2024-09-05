import School.*;


public class Main {
    public static void main(String[] args) {
Student student = new Student("Praveen","3rd street,school avenue",13,'M',2002,"10th std");
Teacher teacher = new Teacher("Nithya","4th street,school avenue",25,'F',30012,"B.ed Physics",50000);
Driver driver = new Driver("Ashok","1st street,raja nagar",50,'M',10067,20);
Bus bus = new Bus(74643,50);

bus.assign(driver);
bus.assign(driver);
bus.assign(student);
bus.dropPerson(student);
bus.dropPerson(student);



    }
}