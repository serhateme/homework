package homework;

public class Main {

	public static void main(String[] args) {
		User user=new User(1,"Serhat","Taraman","Serhat_212048@hotmail.com","1234");
		UserManager userManager=new UserManager();
		userManager.login(user);
		userManager.exit(user);

		
		
		�nstuructor instuructor =new �nstuructor(2,"Engin","Demiro�","demir@hotmail.com","5678","C#");
		�nstructorManager instuructorManager= new �nstructorManager();
		instuructorManager.courseregistration(instuructor);
		instuructorManager.deletelesson(instuructor);
		
		
		
		
		Student student=new Student(2,"Ahmet",	"Arif","arif@hotmail.com","9123","1901");
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.delte(student);
		

		
		
		
		
	}

}
