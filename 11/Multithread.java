// thread creation by extending Thread Class
class MultithreadingDemo extends Thread 
{ 
	public void run() 
	{ 
		try
		{ 
			// Displaying the thread that is running 
			System.out.println ("CSVTU " + 
				Thread.currentThread().getId() + 
				" is running"); 

		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 

// Main Class 
public class Multithread 
{ 
	public static void main(String[] args) 
	{ 
		int n = 10; // Number of threads 
		for (int i=0; i<10; i++) 
		{ 
			MultithreadingDemo object = new MultithreadingDemo(); 
			object.start(); 
		} 
	} 
} 
