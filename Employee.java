package Assignment2;

abstract public class Employee {

    private String firstName;
    private String lastName;
    private int socialSecurityNumber;

    public Employee(String firstName, String lastName, int socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    public String toString() {
        return String.format("Name: %s %s, Social Security Number: %d", firstName, lastName, socialSecurityNumber);
    }

    // Abstract method earnings 
    abstract double earnings();

}