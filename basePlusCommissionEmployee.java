package Assignment2;

public class basePlusCommissionEmployee extends Employee{
    private double baseSalary;

    public basePlusCommissionEmployee(String firstName, String lastName, int socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (baseSalary>0) {
            this.baseSalary = baseSalary;
        }

        else {
            System.out.println("Error");
        }
    }
 

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return baseSalary;
    }

    public String toString() {
        return String.format("Name: %s %s, Social Security Number: %d, Base salary: ", getFirstName(), getLastName(), getSocialSecurityNumber(), baseSalary);
    }


    
}
