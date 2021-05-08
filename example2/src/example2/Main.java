package example2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,2,"Rana","Karatoprak");
		Instructor instructor1 = new Instructor(1,1,"Engin", "Demiroğ");
		
		User[] users = {student1, instructor1};
		
		UserManager userManager = new UserManager();
		userManager.addMultipleUser(users);
		userManager.deleteUser(student1);
		
		
		

	}

}
