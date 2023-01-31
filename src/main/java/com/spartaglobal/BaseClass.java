package com.spartaglobal;


public class BaseClass {
    private String fn;
    private String lastName;
    private int age;
    private String hobbies;
    private int houseNo = 0;
    private String street = "";
    private String town = "";


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }


    public BaseClass() { }

    public BaseClass(String fName, String lName)
    {
        this.fn = fName;
        this.lastName = lName;
    }
    public BaseClass(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }
    public BaseClass(String fName, String lName, int hNo, String street, String town) {
        this(fName, lName);
        this.houseNo = hNo;
        this.street = street;
        this.town = town;
    }


    public String getFullName() {
        return fn + " " + lastName;
    }

    public String move() {
        return "Walking along";
  //      System.out.println("Can't get here");
    }

    public String move(int times) {
        return "Walking along " + times + " times";
    }

    @Override
    public  String toString() {
    var addressString = "Address: " + houseNo + " " + street + ", "  + town;
    return super.toString() + " Name: " + fn + "  " + lastName + " Age: " + age + ". " + addressString;
}

    //public int stupidMethod()
    //{
    //    return 3;
    //}
}