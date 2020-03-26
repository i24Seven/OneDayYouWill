package theCollectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {
	// instance vars
	int id;
	String name;

	// to store data
	Employee(int i, String n) {
		id = i;
		name = n;
	}

	// a method to display data
	void displayData() {
		System.out.println(id + "\t" + name);
	}
}

public class Group {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// create Employee type array with size 4
		Employee arr[] = new Employee[5];

		// store 5 employee data into the array
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter id: ");
			int id = Integer.parseInt(br.readLine());

			System.out.println("Enter Name: ");
			String name = br.readLine();

			arr[i] = new Employee(id, name);
		}
		System.out.println("\nThe Employee data is: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i].displayData();
		}
	}
}