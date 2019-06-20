
public class Employee extends Person {
	//instance variables
	private int employeeId;
	
	//default constructor
	public Employee() {
		super(); //call to the constructor of the parent class (Person)
		employeeId = 0;
	}
	
	//non-static methods
	public void setEmployeeId(int newEmployeeId) {
		if(newEmployeeId > 0) {
			employeeId = newEmployeeId;
		}
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	//override the toString method in the Person class
		public String toString() {
			//return "Name: " + this.getName() + " Employee Id: " + employeeId;
			return super.toString() + " Employee Id: " + employeeId;
		}
		
		//override the equals method from the Person class
		public boolean equals(Object otherObject) {
			boolean isEqual = false;
			if(otherObject != null && otherObject instanceof Employee) {
				Employee otherEmployee = (Employee)otherObject;
				//super.equals(otherEmployee)
				if(this.getName().equals(otherEmployee.getName()) &&
						this.employeeId == otherEmployee.employeeId) {
					isEqual = true;
				}
			}
			return isEqual;
		}
	
	
}
