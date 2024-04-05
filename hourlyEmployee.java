package Assignment2;

public class hourlyEmployee extends Employee {

    private double wage;
    private double hours;
    
    public hourlyEmployee(String firstName, String lastName, int socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage > 0.0) {
            this.wage = wage;
        } 
        else {
            System.out.println("Error: The wage cannot be less than 0");
        }

        if (hours > 0.0 && hours < 168.0) {
            this.hours = hours;
        }
        else {
            System.out.println("Error: The hours are not in the desired range");
        }
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        if (hours<40) {
            double x = wage*hours;
            return x;
        }
        else {
            double y = 40*wage + (hours - 40)*1.5;
            return y;
        }
    }

    // Creating the method to return the string rep of the object 
    public String toString() {
        return String.format("Name: %s %s, Social Security Number: %d, Wage: %f, Hours: %f", getFirstName(), getLastName(), getSocialSecurityNumber(), wage, hours);
    }

}
