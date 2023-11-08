package com.filehandling.create;
import java.util.*;
import java.io.*;
public class FileHandling 
{
	public static void main(String[] args) 
	{
		//Creating the File
		File obj=new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\Oopscodes\\FileHandling\\Surya.txt");
		try 
		{
			obj.createNewFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		//Write to a file
		try 
		{
			FileWriter write=new FileWriter(obj);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Message");
			String msg=sc.nextLine();
			write.write(msg);
			write.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//Reading the file
		try 
		{
			Scanner sc=new Scanner(obj);
			while(sc.hasNext())
			{
				String line=sc.nextLine();
				System.out.println(line);
			}
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		//delete file
		if(obj.delete())
		{
			System.out.println("Your file deleted");
		}
		else
		{
			System.out.println("Problem to Delete the file");
		}
			
		
	}
}
