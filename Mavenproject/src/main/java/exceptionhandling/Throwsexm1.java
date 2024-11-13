package exceptionhandling;

import java.io.IOException;

public class Throwsexm1 {         //unchecked
		
		public static void m() throws ArithmeticException
		{
			throw new ArithmeticException();
			
		}
		public static void main(String[] args) throws ArithmeticException
		{
			m();
		}

	}