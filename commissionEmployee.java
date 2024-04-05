package Assignment2;

public class commissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;
 
    public commissionEmployee(String firstName, String lastName, int socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (commissionRate>0 && commissionRate<=1) {
            this.commissionRate = commissionRate;
        }
        else {
            System.out.println("Error: Commission Rate not in desired range");
        }

        if(grossSales>0) {
            this.grossSales = grossSales;
        }
        else {
            System.out.println("Error: Gross sale less than zero");
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public String toString() {
        return String.format("Name: %s %s, Social Security Number: %d, Gross Sale: %f, Commission Rate: %f", getFirstName(),getLastName(),getSocialSecurityNumber(), grossSales, commissionRate);
    }

    @Override 
    public double earnings() {
        double z = commissionRate*grossSales;
        return z;
    }

}