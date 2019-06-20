
public class Person {
	
	private String name;

	public Person() {
		
		this.name = "";
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	//override the toString method which means to replace
		//the definition from your parent class with another
		//definition of the toString method
		public String toString() {
			return "Name: " + name;
		}
		
		//override the equals method from the Object class
		//so that two people with the same name will be
		//considered equal or the same
		public boolean equals(Object otherObject) {
			boolean isEqual = false;
			if(otherObject != null && otherObject instanceof Person) {
				Person otherPerson = (Person)otherObject;
				if(this.name.equals(otherPerson.name)) {
					isEqual = true;
				}
			}
			return isEqual;
		}
	
	

}
