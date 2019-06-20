import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		Person currentPerson = null;
		Employee currentEmployee = null;
		Faculty currentFaculty = null;
		int option;
		
		do {
			System.out.println("Press 1 to enter a person's information");
			System.out.println("Press 2 to enter an employee's information");
			System.out.println("Press 3 to enter a faculty's information");
			System.out.println("Press 4 to view all information");
			System.out.println("Press 5 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				System.out.println("Enter the person's name");
				String name = keyboard.nextLine();
				
				currentPerson = new Person();
				currentPerson.setName(name);
			}
			else if(option == 2) {
				currentEmployee = new Employee();
				
				System.out.println("Enter the Employee's name");
				currentEmployee.setName(keyboard.nextLine());
				System.out.println("Enter the Employee's Id");
				currentEmployee.setEmployeeId(keyboard.nextInt());
				
			}
			else if(option == 3) {
				currentFaculty = new Faculty();
				
				System.out.println("Enter the faculty's name");
				currentFaculty.setName(keyboard.nextLine());
				System.out.println("Enter the faculty's Employee's Id");
				currentFaculty.setEmployeeId(keyboard.nextInt());
				keyboard.nextLine();
				System.out.println("Enter the faculty's department name");
				currentFaculty.setDepartment(keyboard.nextLine());
				
				
			}
			else if(option == 4) {
				
				System.out.println("The current person name is: " + currentPerson.getName());
				
				System.out.println("The current Employee name is: " + currentEmployee.getName() + "\n"
						+ "The current Employee Id is: " + currentEmployee.getEmployeeId());
				
				System.out.println("The current Faculty's name is: " + currentFaculty.getName() + "\n"
						+ "The current Faculty's Employee Id is: " + currentFaculty.getEmployeeId() + "\n"
						+ "The current Faculty's Department is: " + currentFaculty.getDepartment());
				}
			else if(option == 5) {
				System.out.println("GoodBye!");
			}
			else {
				System.out.println("Error! Please chosse correct option");
			}
			
		}while(option != 5);
	}

}