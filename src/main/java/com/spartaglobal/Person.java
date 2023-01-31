package com.spartaglobal;


public class Person {
    private String firstName;
    private String lastName;
    private int age;

private Address address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public Person() { }

    public Person(String firstName, String lName)
    {
        this.firstName = firstName;
        this.lastName = lName;
    }
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }
    public Person(String firstName, String lastName, Address add) {
        this(firstName, lastName);
        this.address = add;
    }

    public String getFullName() {
        return firstName + "" + lastName;
    }

    public String move() {
        return "Walking along";

    }

    public String move(int times) {
        return "Walking along " + times + " times";
    }

    @Override
    public  String toString() {
    //var addressString = getAddressString();
    return super.toString() + " Name: " + getFullName() + " Age: " + age + ". " + address.getAddressString();
}



}