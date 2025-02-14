package org.example.B4;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salry;
    public Employee(int id, String firstName, String lastName, int salry) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salry = salry;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
    public int getSalry() {
        return salry;
    }

    public void setSalry(int salry) {
        this.salry = salry;
    }
    public int getAnnualSalary(){
        return salry*12;
    }
    public int raiseSalary(int percent){
        return salry+salry*percent;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ",Name='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", salry=" + salry +
                '}';
    }
}