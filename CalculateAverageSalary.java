package Practice;

import java.util.*;

//This class will calculate the average of employee salary
public class CalculateAverageSalary {
	public static void main(String args[]) {
		
		//Creating ArrayList of type Float 
		ArrayList<Float> Employee = new ArrayList<Float>();
		
		//Adding element in an ArrayList
	    Employee.add((float) 1000);
	    Employee.add((float) 1500);
	    Employee.add((float) 2000);
	    Employee.add((float) 1400);
	    Employee.add((float) 1900);
	    Employee.add((float) 1600);
	    
	    //Declaring the variable
	    float total = 0;
	    float avg;
	    
	    //Iterating ArrayList
	    for(int i=0 ;i< Employee.size();i++)
	    	
	    	//Calculating the average
	    	total += Employee.get(i);
	        avg = total / Employee.size();
	    	System.out.println("The Average of salary is " + avg);
	        
	}

}
