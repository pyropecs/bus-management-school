import School.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //School student is created

        int choice = 0;
        Student student = null;
        Teacher teacher = null;
        Driver driver = null;
        LuxuryBus luxuryBus = null;
        NormalBus normalBus = null;

        while (choice <= 5 && choice >= 0) {

            System.out.println("Steps");
            System.out.println("0.Continue");
            System.out.println("1.Add Student");
            System.out.println("2.Add Teacher");
            System.out.println("3.Add Driver");
            System.out.println("4.Create luxury bus");
            System.out.println("5.Create Normal Bus");
            System.out.println("6.Complete");
            System.out.println("Enter your Choice (1-5)");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    continue;
                case 1:
                    //student inputs

                    System.out.println("Enter Your name");
                    String studentName = sc.nextLine();

                    System.out.println("Enter your address");
                    String studentAddress = sc.nextLine();

                    System.out.println("Enter your age");
                    int studentAge = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter your gender:(M/F)");
                    char studentGender = sc.next().charAt(0);

                    System.out.println("Enter the Roll Number");
                    int studentRollNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the class");
                    String studentClass = sc.nextLine();

                    student = new Student(studentName, studentAddress, studentAge,
                            studentGender, studentRollNumber, studentClass);

                    System.out.println("Student added successfully.");
                    student.about();

                    break;
                case 2:
                    //teacher inputs
                    System.out.println("Enter Your name");
                    String teacherName = sc.nextLine();

                    System.out.println("Enter your address");
                    String teacherAddress = sc.nextLine();

                    System.out.println("Enter your age");
                    int teacherAge = sc.nextInt();

                    System.out.println("Enter your gender:(M/F)");
                    char teacherGender = sc.next().charAt(0);

                    System.out.println("Enter the Employee Number");
                    int employeeNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the Degree");
                    String employeeDegree = sc.nextLine();

                    System.out.println("Enter the salary");
                    int salary = sc.nextInt();
                    sc.nextLine();

                    teacher = new Teacher(teacherName, teacherAddress,
                            teacherAge, teacherGender, employeeNumber, employeeDegree, salary);

                    System.out.println("Teacher added successfully.");
                    teacher.about();

                    break;
                case 3:
                    //driver inputs
                    System.out.println("Enter Your name");
                    String driverName = sc.nextLine();

                    System.out.println("Enter your address");
                    String driverAddress = sc.nextLine();

                    System.out.println("Enter your age");
                    int driverAge = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter your gender:(M/F)");
                    char driverGender = sc.next().charAt(0);

                    System.out.println("Enter the license Number");
                    int licenseNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the years of experience");
                    int yearsOfExperience = sc.nextInt();
                    sc.nextLine();

                    driver = new Driver(driverName, driverAddress,
                            driverAge, driverGender, licenseNumber, yearsOfExperience);

                    System.out.println("Driver added successfully.");
                    driver.about();

                    break;
                case 4:
                    //Luxury bus inputs

                    System.out.println("Enter the Luxury Bus Number");
                    int luxuryBusNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the capacity");
                    int luxuryBusCapacity = sc.nextInt();
                    sc.nextLine();

                    luxuryBus = new LuxuryBus(luxuryBusNumber, luxuryBusCapacity);

                    System.out.println("Luxury bus " + luxuryBus.getBusNumber() + " added successfully.");

                    break;
                case 5:
                    //Normal bus inputs
                    System.out.println("Enter the Normal Bus Number");
                    int normalBusNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the capacity");
                    int normalBusCapacity = sc.nextInt();
                    sc.nextLine();

                    normalBus = new NormalBus(normalBusNumber, normalBusCapacity);

                    System.out.println("Normal bus " + normalBus.getBusNumber() + " added successfully.");

                    break;

            }


        }


        try {

            //Details of the Luxury Bus
            luxuryBus.showBusDetails();
            //Details of the Normal Bus
            normalBus.showBusDetails();
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
            //Disable air conditioning
            luxuryBus.disableAirConditioning();
            //Showing luxury Bus without Air condition
            luxuryBus.showBusDetails();

        } catch (NullPointerException e) {

            System.out.println("complete every steps before you exit");
        }


    }
}