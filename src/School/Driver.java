package School;

public class Driver extends Person{
private int licenseNumber;
private double yearsOfExperience;
public Driver(String name,String address,int age,char gender,int licenseNumber,double yearsOfExperience){
    super(name, address, age, gender);
    this.licenseNumber = licenseNumber;
    this.yearsOfExperience = yearsOfExperience;

}
@Override
    public void about(){
    System.out.println("Im a Driver in this school having experience " + yearsOfExperience + "with a license number "+licenseNumber);
}



}
