
public class Faculty extends Employee {

	private String department;
	
	public Faculty(){
		super();
		this.department="";
	}
	
	public void setDepartment(String department){
		this.department = department;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public String toString() {
		return super.toString() + " Department: " + department;
	}
}
