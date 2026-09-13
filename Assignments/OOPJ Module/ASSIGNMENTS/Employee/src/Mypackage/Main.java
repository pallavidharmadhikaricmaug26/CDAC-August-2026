package Mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	static final int CAPACITY = 100;
	static Employee[] employees = new Employee[CAPACITY];
	static int count = 0;          
	static int currentIndex = -1;  
	static int nextId = 1;         

	public static void main(String[] args)
	{
		int choice;

		do
		{
			System.out.println("\n===== MAIN MENU =====");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display");
			System.out.println("3. Sort");
			System.out.println("4. Save to File");
			System.out.println("5. Load from File");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");
			choice = readInt();

			switch (choice)
			{
				case 1: 
					addEmployeeMenu(); 
				break;
				case 2: 
					displayMenu(); 
				break;
				case 3: 
					sortMenu();
				break;
				case 4: 
					saveToFile();
				break;
				case 5: 
					loadFromFile(); 
				break;
				case 6: 
					System.out.println("Exiting... Goodbye!");
					break;
				default: 
					System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 6);
	}
	// 1. ADD EMPLOYEE SUBMENU
	
	static void addEmployeeMenu()
	{
		int choice;

		do
		{
			System.out.println("\n--- Add an Employee ---");
			System.out.println("1. Manager");
			System.out.println("2. Engineer");
			System.out.println("3. Sales Person");
			System.out.println("4. Exit to Main Menu");
			System.out.print("Enter choice: ");
			choice = readInt();

			if (count >= CAPACITY && choice >= 1 && choice <= 3)
			{
				System.out.println("Employee list is full. Cannot add more.");
				continue;
			}

			switch (choice)
			{
				case 1: 
					addManager();
					break;
				case 2: 
					addEngineer();
					break;
				case 3: 
					addSalesPerson(); 
					break;
				case 4: 
					System.out.println("Returning to Main Menu."); 
					break;
				default: 
					System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 4);
	}

	static void addManager()
	{
		System.out.print("Enter name: ");
		String name = readLine();
		System.out.print("Enter address: ");
		String address = readLine();
		System.out.print("Enter phone number: ");
		String phone = readLine();
		System.out.print("Enter salary: ");
		double salary = readDouble();
		System.out.print("Enter department: ");
		String department = readLine();
		System.out.print("Enter team size: ");
		int teamSize = readInt();

		Manager m = new Manager(nextId++, name, address, phone, salary, department, teamSize);
		employees[count++] = m;
		System.out.println("Manager added successfully with ID " + m.getId());
	}

	static void addEngineer()
	{
		System.out.print("Enter name: ");
		String name = readLine();
		System.out.print("Enter address: ");
		String address = readLine();
		System.out.print("Enter phone number: ");
		String phone = readLine();
		System.out.print("Enter salary: ");
		double salary = readDouble();
		System.out.print("Enter specialization: ");
		String specialization = readLine();
		System.out.print("Enter years of experience: ");
		int experience = readInt();

		Engineer e = new Engineer(nextId++, name, address, phone, salary, specialization, experience);
		employees[count++] = e;
		System.out.println("Engineer added successfully with ID " + e.getId());
	}

	static void addSalesPerson()
	{
		System.out.print("Enter name: ");
		String name = readLine();
		System.out.print("Enter address: ");
		String address = readLine();
		System.out.print("Enter phone number: ");
		String phone = readLine();
		System.out.print("Enter salary: ");
		double salary = readDouble();
		System.out.print("Enter region: ");
		String region = readLine();
		System.out.print("Enter sales target: ");
		double target = readDouble();

		SalesPerson s = new SalesPerson(nextId++, name, address, phone, salary, region, target);
		employees[count++] = s;
		System.out.println("Sales Person added successfully with ID " + s.getId());
	}
	// 2. DISPLAY SUBMENU

	static void displayMenu()
	{
		int choice;

		do
		{
			System.out.println("\n--- Display ---");
			System.out.println("1. All Employees");
			System.out.println("2. First Employee");
			System.out.println("3. Next Employee");
			System.out.println("4. Previous Employee");
			System.out.println("5. Last Employee");
			System.out.println("6. Exit to Main Menu");
			System.out.print("Enter choice: ");
			choice = readInt();

			switch (choice)
			{
				case 1: 
					displayAll(); 
					break;
				case 2: 
					displayFirst();
					break;
				case 3: 
					displayNext(); 
					break;
				case 4: 
					displayPrevious(); 
					break;
				case 5: 
					displayLast(); 
					break;
				case 6: 
					System.out.println("Returning to Main Menu.");
					break;
				default: 
					System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 6);
	}

	static void displayAll()
	{
		if (count == 0)
		{
			System.out.println("No employees to display.");
			return;
		}
		for (int i = 0; i < count; i++)
		{
			System.out.println("\n[Record " + (i + 1) + "]");
			employees[i].displayDetails();
		}
	}

	static void displayFirst()
	{
		if (count == 0)
		{
			System.out.println("No employees available.");
			return;
		}
		currentIndex = 0;
		employees[currentIndex].displayDetails();
	}

	static void displayNext()
	{
		if (count == 0)
		{
			System.out.println("No employees available.");
			return;
		}
		if (currentIndex < count - 1)
		{
			currentIndex++;
			employees[currentIndex].displayDetails();
		}
		else
		{
			System.out.println("Already at the last employee. No next record.");
		}
	}

	static void displayPrevious()
	{
		if (count == 0)
		{
			System.out.println("No employees available.");
			return;
		}
		if (currentIndex > 0)
		{
			currentIndex--;
			employees[currentIndex].displayDetails();
		}
		else
		{
			System.out.println("Already at the first employee. No previous record.");
		}
	}

	static void displayLast()
	{
		if (count == 0)
		{
			System.out.println("No employees available.");
			return;
		}
		currentIndex = count - 1;
		employees[currentIndex].displayDetails();
	}

	// 3. SORT SUBMENU
	static void sortMenu()
	{
		int choice;

		do
		{
			System.out.println("\n--- Sort ---");
			System.out.println("1. All Managers");
			System.out.println("2. All Engineers");
			System.out.println("3. All Sales Person");
			System.out.println("4. All Employees Alphabetic (Ascending)");
			System.out.println("5. All Employees Alphabetic (Descending)");
			System.out.println("6. Exit to Main Menu");
			System.out.print("Enter choice: ");
			choice = readInt();

			switch (choice)
			{
				case 1: 
					showByType("Manager"); 
					break;
				case 2: 
					showByType("Engineer"); 
					break;
				case 3: 
					showByType("SalesPerson");
					break;
				case 4: 
					showSortedByName(true); 
					break;
				case 5: 
					showSortedByName(false);
					break;
				case 6: 
					System.out.println("Returning to Main Menu."); 
					break;
				default: 
					System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 6);
	}

	static void showByType(String type)
	{
		boolean found = false;
		for (int i = 0; i < count; i++)
		{
			if (employees[i].getType().equals(type))
			{
				System.out.println();
				employees[i].displayDetails();
				found = true;
			}
		}
		if (!found)
		{
			System.out.println("No " + type + " records found.");
		}
	}

	static void showSortedByName(boolean ascending)
	{
		if (count == 0)
		{
			System.out.println("No employees to sort.");
			return;
		}

		// Copy references into a temp array so the original order/currentIndex is untouched
		Employee[] temp = new Employee[count];
		for (int i = 0; i < count; i++)
		{
			temp[i] = employees[i];
		}

		// Manual bubble sort by name
		for (int i = 0; i < count - 1; i++)
		{
			for (int j = 0; j < count - 1 - i; j++)
			{
				int cmp = temp[j].getName().compareToIgnoreCase(temp[j + 1].getName());
				boolean shouldSwap = ascending ? (cmp > 0) : (cmp < 0);
				if (shouldSwap)
				{
					Employee swap = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = swap;
				}
			}
		}

		for (int i = 0; i < count; i++)
		{
			System.out.println();
			temp[i].displayDetails();
		}
	}
	// 4. SAVE TO FILE

	static void saveToFile()
	{
		if (count == 0)
		{
			System.out.println("No employees to save.");
			return;
		}

		try
		{
			PrintWriter writer = new PrintWriter("employees.txt");

			for (int i = 0; i < count; i++)
			{
				writer.println(employees[i].toFileString());
			}

			writer.close();
			System.out.println("Saved " + count + " employee record(s) to employees.txt");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error saving file: " + e.getMessage());
		}
	}
	// 5. LOAD FROM FILE
	static void loadFromFile()
	{
		try
		{
			File file = new File("employees.txt");
			Scanner fileScanner = new Scanner(file);

			int loaded = 0;
			count = 0;       // clear existing in-memory data before loading
			currentIndex = -1;
			int maxId = 0;

			while (fileScanner.hasNextLine())
			{
				String line = fileScanner.nextLine();

				if (line.trim().isEmpty()) continue;
				String[] parts = line.split("\\|");
				String type = parts[0];

				int id = Integer.parseInt(parts[1]);
				String name = parts[2];
				String address = parts[3];
				String phone = parts[4];
				double salary = Double.parseDouble(parts[5]);

				Employee emp = null;

				if (type.equals("MANAGER"))
				{
					String department = parts[6];
					int teamSize = Integer.parseInt(parts[7]);
					emp = new Manager(id, name, address, phone, salary, department, teamSize);
				}
				else if (type.equals("ENGINEER"))
				{
					String specialization = parts[6];
					int experience = Integer.parseInt(parts[7]);
					emp = new Engineer(id, name, address, phone, salary, specialization, experience);
				}
				else if (type.equals("SALESPERSON"))
				{
					String region = parts[6];
					double target = Double.parseDouble(parts[7]);
					emp = new SalesPerson(id, name, address, phone, salary, region, target);
				}

				if (emp != null && count < CAPACITY)
				{
					employees[count++] = emp;
					loaded++;
					if (id > maxId) maxId = id;
				}
			}

			fileScanner.close();
			nextId = maxId + 1;
			System.out.println("Loaded " + loaded + " employee record(s) from employees.txt");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("employees.txt not found. Save some employees first.");
		}
	}
	// Input Helpers (ConsoleInput-based)

	static int readInt()
	{
		while (true)
		{
			try
			{
				return Integer.parseInt(ConsoleInput.getString().trim());
			}
			catch (NumberFormatException e)
			{
				System.out.print("Invalid number, try again: ");
			}
		}
	}

	static double readDouble()
	{
		while (true)
		{
			try
			{
				return Double.parseDouble(ConsoleInput.getString().trim());
			}
			catch (NumberFormatException e)
			{
				System.out.print("Invalid number, try again: ");
			}
		}
	}

	static String readLine()
	{
		return ConsoleInput.getString().trim();
	}
}