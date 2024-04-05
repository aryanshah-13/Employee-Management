package Assignment2;

public class salariedEmployee extends Employee {
    

    private double weeklySalary;

    public salariedEmployee(String firstName, String lastName, int socialSecurityNumber, double weeklySalary) {

        super(firstName, lastName, socialSecurityNumber); // super calls the constructor of the super class employee

        if (weeklySalary > 0.0) {
            this.weeklySalary = weeklySalary;
        } 
        else {
            System.out.println("Error: Weekly salary must be greater than 0.0");
        }
    }

    public double getWeeklySalary() {
        return weeklySalary;
    } 

    public String toString() {
        return String.format("Name: %s %s, Social Security Number: %d, Weekly salary: %f", getFirstName(), getLastName(), getSocialSecurityNumber(), weeklySalary);
    }

    @Override 
    public double earnings() {
        return weeklySalary - 500;
    }

}