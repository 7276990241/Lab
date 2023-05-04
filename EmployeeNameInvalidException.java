package exceptionAndThread;

class EmployeeNameInvalidException extends Exception {
	public EmployeeNameInvalidException(String message) 
	{
       super(message);
   }
}
