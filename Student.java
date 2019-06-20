
public class Student extends Person{
	
	private int studentId;
	
	public Student(){
		super();
		studentId = 0;
	}
	
	public int getStudentId(){
		return studentId;
	}
	
	public void setStudentId(int studentId){
		if(studentId >= 0){
			this.studentId = studentId;
		}
	}
	
	public String toString(){
		return super.toString() + " Student Id: " + studentId;
	}

	
	
}
