package StaticKeyword;

public class Client {

	public static void main(String[] args) {
		

		Student bob = new Student();
		//workaround but try to use getters and setters
		//bob.nameOfStudent = "Bob";
		bob.setNameOfStudent("Bob");
		
		//before using setters/getters
//		System.out.println(bob.nameOfStudent);
//		System.out.println(bob.nameOfStudent);
		
		System.out.println(bob.getNameOfStudent());
		System.out.println(bob.getNameOfSchool());
		

	}

}
