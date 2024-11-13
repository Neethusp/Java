package exceptionhandling;

import java.io.IOException;

public class Throwsexmchecked {             //checked exception
	
	public static void m() throws IOException
	{
		throw new IOException();
		
	}
	public static void main(String[] args) throws IOException
	{
		m();
	}

}
