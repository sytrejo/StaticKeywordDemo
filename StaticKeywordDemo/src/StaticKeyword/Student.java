package StaticKeyword;

public class Student {
	
	private String nameOfStudent;
	public final static String nameOfSchool = "Hogwarts";
	
	//getters and setters
	public String getNameOfStudent() {
		return nameOfStudent;
	}
	public void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}
	public static String getNameOfSchool() {
		return nameOfSchool;
	}
	// because it is public final and static it doesn't need a setter.
//	public static void setNameOfSchool(String nameOfSchool) {
//		Student.nameOfSchool = nameOfSchool;
//	}
	
	
	

	

}
