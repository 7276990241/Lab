package exceptionAndThread;

public class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(String message) {
        super(message);
    }
}