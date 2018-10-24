package Serialization;
import java.io.*;

class Demo implements java.io.Serializable
{
	public int a;
	public String b;
	
	//Default Constructor
	public Demo(int a, String b)
	{
		this.a = a;
		this.b = b;
	}
}

public class Serialization 
{

	public static void main(String[] args)
	{
		Demo object = new Demo(1, "test");
		String filename = "file.ser";
		
		///Serialization
		
		try
		{
			//Saving object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			//Method for serialization of an object'
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialzied");
			
		}
		
		catch(IOException ex)
		{
			System.out.println("IOException has been caught");
		}
		
		Demo object1 = null;

	
	
	//Deserialization
	try
	{
		
		///Reading the object from a file
		
		FileInputStream file = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(file);
		
		//Method for deserialization
		
		object1 = (Demo)in.readObject();
		
		in.close();
		file.close();
		
		System.out.println("Object has been deserialized ");
		System.out.println("a = " + object1.a);
		System.out.println("b = " + object1.b);
	}
	
	
	catch(IOException ex)
	{
		System.out.println("IOException has been caught");
	}
	

	
	catch(ClassNotFoundException ex)
	{
		System.out.println("ClassNotFoundException has been caught");
	}
	
	
	}
	
	


}
