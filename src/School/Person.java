package School;

public abstract class Person {
private String name;
private String address;
private int age;
private char gender;
public Person(String name,String address,int age,char gender){
    this.name = name;
    this.address = address;
    this.age = age;
    this.gender = gender;
}

abstract void about();

//getters and setters
public String getName(){
    return this.name;
}
public String getAddress(){
    return this.address;
}
public int getAge(){
    return this.age;
}
public char getGender(){
    return this.gender;
}

}
