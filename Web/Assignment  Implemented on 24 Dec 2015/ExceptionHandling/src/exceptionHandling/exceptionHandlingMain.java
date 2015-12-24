package exceptionHandling;

import java.io.IOException;

public class exceptionHandlingMain {

	public static void main(String[] args) throws IOException {
		ageException(120);
		devideByZeroException(10,0);
		iOException();
	}

	static void iOException() throws IOException{
				throw new IOException();		
	}
	
	static void ageException(int age) {
		if (age>100 || age<0) {
			try {
				throw new UserDefinedException("Invalid age");
			} catch (UserDefinedException e) {
				System.out.println("User defined Exception Occured");
			}
		} else {

		}
	}
	
	static void devideByZeroException(int dividend,int divisor){
		
		try {
			int result=dividend/divisor;
		} catch (Exception e) {
			try {
				throw new UserDefinedException("Invalid divisor");
			} catch (UserDefinedException e1) {
				System.out.println("DevideByZero Excetion Occured");
			}
		}
	}
}
