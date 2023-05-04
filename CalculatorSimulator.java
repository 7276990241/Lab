package exceptionAndThread;

public class CalculatorSimulator {
	public static void main(String[] args) {
        try {
            String empName = "Dominic Torreto";
            boolean isIndian = true;
            double empSal = 75000;

            double taxAmount = TaxCalculator.calculateTax(empName, isIndian, empSal);

            System.out.println("Tax amount is: " + taxAmount);
        } 
        catch (CountryNotValidException e) 
        {
            System.out.println("Country not valid: " + e.getMessage());
            e.printStackTrace();
        } 
        catch (EmployeeNameInvalidException e) 
        {
            System.out.println("Employee name not valid: " + e.getMessage());
            e.printStackTrace();
        } 
        catch (TaxNotEligibleException e) 
        {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

