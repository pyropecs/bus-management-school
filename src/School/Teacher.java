package School;

public class Teacher extends Person {
    private int employeeNumber;
    private String employeeDegree;
    private double salary;

    public Teacher(String name, String address, int age, char gender, int employeeNumber, String employeeDegree, double salary) {

        super(name, address, age, gender);
        this.employeeNumber = employeeNumber;
        this.employeeDegree = employeeDegree;
        this.salary = salary;

    }

    @Override
    public void about() {

        System.out.println("Im "+getName() + " and I'm a teacher in this school with a degree " + employeeDegree + "with a employee number " + employeeNumber + " having salary of " + salary);

    }


}
