import School.*;


public class Main {
    public static void main(String[] args) {
Student student = new Student("Praveen","3rd street,school avenue",13,'M',2002,"10th std");
Teacher teacher = new Teacher("Nithya","4th street,school avenue",25,'F',30012,"B.ed Physics",50000);
Driver driver = new Driver("Ashok","1st street,raja nagar",50,'M',10067,20);
LuxuryBus luxuryBus = new LuxuryBus(2002,50);
NormalBus normalBus = new NormalBus(3001,50);
luxuryBus.assign(driver);
luxuryBus.assign(teacher);
luxuryBus.dropPerson(teacher);
luxuryBus.assign(student);
normalBus.assign(driver);
normalBus.assign(driver);
normalBus.assign(teacher);
normalBus.assign(student);
normalBus.dropPerson(student);
normalBus.dropPerson(student);





    }
}