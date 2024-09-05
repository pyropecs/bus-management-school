package School;

public class Student extends Person{
    private int rollNumber;
    private String _class;

    public Student(String name,String address,int age,char gender,int rollNumber,String _class){

        super(name, address, age, gender);
        this.rollNumber = rollNumber;
        this._class = _class;

    }

//method overriding compile-time polymorphism
    @Override
    public void about() {

        System.out.println("Im a Student in this school Im studying " + _class + " my roll number is " + rollNumber);

    }

}
