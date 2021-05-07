package homework;

public class Main {

	public static void main(String[] args) {
		User user=new User(1,"Serhat","Taraman","Serhat_212048@hotmail.com","1234");
		UserManager userManager=new UserManager();
		userManager.login(user);
		userManager.exit(user);

		
		
		İnstuructor instuructor =new İnstuructor(2,"Engin","Demiroğ","demir@hotmail.com","5678","C#");
		İnstructorManager instuructorManager= new İnstructorManager();
		instuructorManager.courseregistration(instuructor);
		instuructorManager.deletelesson(instuructor);
		
		
		
		
		Student student=new Student(2,"Ahmet",	"Arif","arif@hotmail.com","9123","1901");
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.delte(student);
		

		
		
		
		
	}

}
