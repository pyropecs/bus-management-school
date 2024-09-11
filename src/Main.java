import School.*;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //School student is created


        Student student = null;
        Teacher teacher = null;
        Driver driver = null;
        LuxuryBus luxuryBus = null;
        NormalBus normalBus = null;
        Scanner sc = new Scanner(System.in);
        boolean notExitChoice = true;
        while (notExitChoice) {
            int choice = 0;
            System.out.println("Steps");
            System.out.println("0.Continue");
            System.out.println("1.Add Student");
            System.out.println("2.Add Teacher");
            System.out.println("3.Add Driver");
            System.out.println("4.Create Bus ");
            System.out.println("5.Complete");


            choice = getValidInteger("Enter your Choice (0-5)", sc, "choice");


            switch (choice) {
                case 0:
                    continue;
                case 1:
                    //Student Inputs

                    Person studentBasicDetails = createPerson(sc);
                    int studentRollNumber = getValidInteger("Enter Student Roll Number", sc, "Roll Number");

                    System.out.println("Enter Student class");
                    String studentClass = sc.nextLine();

                    student = new Student(studentBasicDetails.getName(), studentBasicDetails.getAddress(), studentBasicDetails.getAge(),
                            studentBasicDetails.getGender(), studentRollNumber, studentClass);

                    System.out.println("Student added successfully.");
                    student.about();

                    break;
                case 2:
                    //Teacher Inputs
                    Person teacherBasicDetails = createPerson(sc);
                    int employeeNumber = getValidInteger("Enter Employee Number", sc, "Employee Number");

                    System.out.println("Enter Teacher Degree");
                    String employeeDegree = sc.nextLine();


                    int salary = getValidInteger("Enter Teacher salary", sc, "Teacher Salary");

                    teacher = new Teacher(teacherBasicDetails.getName(), teacherBasicDetails.getAddress(),
                            teacherBasicDetails.getAge(), teacherBasicDetails.getGender(), employeeNumber, employeeDegree, salary);

                    System.out.println("Teacher added successfully.");
                    teacher.about();

                    break;
                case 3:
                    //Driver Inputs
                    Person driverBasicDetails = createPerson(sc);


                    int licenseNumber = getValidInteger("Enter Driver license Number", sc, "Driver license Number");


                    int yearsOfExperience = getValidInteger("Enter Driver years of experience", sc, "Years of Experience");


                    driver = new Driver(driverBasicDetails.getName(), driverBasicDetails.getAddress(),
                            driverBasicDetails.getAge(), driverBasicDetails.getGender(), licenseNumber, yearsOfExperience);

                    System.out.println("Driver added successfully.");
                    driver.about();

                    break;
                case 4:
                    //Luxury bus inputs
                    Bus bus = createBus(sc);
                    int busType;
                    boolean notValidBusType = true;

                    while (notValidBusType) {

                        System.out.println("What type of bus you want to create ");
                        System.out.println("1.Luxury bus");
                        System.out.println("2.Normal bus");

                        busType = sc.nextInt();
                        if (busType == 1) {
                            luxuryBus = new LuxuryBus(bus.getBusNumber(), bus.getCapacity());

                            System.out.println("Luxury bus " + luxuryBus.getBusNumber() + " added successfully.");
                            notValidBusType = false;

                        } else if (busType == 2) {
                            normalBus = new NormalBus(bus.getBusNumber(), bus.getCapacity());

                            System.out.println("Normal bus " + normalBus.getBusNumber() + " added successfully.");
                            notValidBusType = false;

                        } else {
                            System.out.println("Invalid bus type.Please Try again");
                        }
                        sc.nextLine();
                    }

                    break;
                case 5:
                    notExitChoice = false;
                    break;
                default:
                    System.out.println("Choice didn't exist.Please try again");


            }


        }
        sc.close();

        try {

            //Details of the Luxury Bus
            luxuryBus.showBusDetails();
            //Details of the Normal Bus
            normalBus.showBusDetails();
            //To enable air Conditioning
            luxuryBus.enableAirConditioning();
            //Assigning driver to luxury bus
            luxuryBus.assign(driver); //Todo:implement the class whether concurrently not serially

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
            // Null pointer will be occurred when inputs are not given properly
            System.out.println("complete every steps before you exit");
        }


    }


    public static Person createPerson(Scanner sc) {

        System.out.println("Enter name");
        String personName = sc.nextLine();
        System.out.println("Enter address");
        String personAddress = sc.nextLine();

        int personAge = getValidInteger("Enter age", sc, "age");

        boolean NotValidGender = true;
        char personGender = 'm';
        while (NotValidGender) {
            System.out.println("Enter gender:(M/F)");
            String genderInput = sc.next();
            personGender = Character.toUpperCase(genderInput.charAt(0));
            if ((personGender == 'M' || personGender == 'F') && genderInput.length() == 1) {
                NotValidGender = false;
            } else {
                System.out.println("Invalid Gender Type.Please Enter M/F");
            }
        }

        return new Person(personName, personAddress, personAge, personGender);
    }

    public static Bus createBus(Scanner sc) {
        int busNumber = getValidInteger("Enter the Bus Number", sc, "Bus Number");
        int busCapacity = getValidInteger("Enter the Capacity of The Bus", sc, "Bus Capacity");
        return new Bus(busNumber, busCapacity);
    }

    public static int getValidInteger(String message, Scanner sc, String type) {
        boolean notValid = true;

        int value = 0;
        while (notValid) {
            try {
                System.out.println(message);
                value = sc.nextInt();

                notValid = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid " + type + " Please try again");
            }
            sc.nextLine();
        }
        return value;
    }


}