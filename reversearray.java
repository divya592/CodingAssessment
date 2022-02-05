package Practice;

import java.util.Scanner;

public class reversearray {
	public static void main(String[] args) {
		
		//Declaring array marks and printing in reverse order
		int [] marks = {10,20,30,40,50,60,70,80,90,100};
		for (int i=marks.length-1 ; i>=0; i--) {
			System.out.print(marks[i] + " ");
	   }
		
		
		//Asking the User for Input array and printing it in Reverse Order
		Scanner scan = new Scanner(System.in);
		System.out.println(" ");
		
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int [] UserArray = new int[n];
		
		System.out.println("Enter the array element");
		for(int j=0;j<n;j++) {
			UserArray[j] = scan.nextInt();
		}
		
		System.out.println("The Array is in Reverse Order ");
		for(int j = n-1; j >= 0;j--) {
			System.out.print(UserArray[j] + " ");
		}
	}

}
