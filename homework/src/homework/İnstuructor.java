package homework;

public class Ýnstuructor extends User{
	
	private String course;
	
	public Ýnstuructor(int id,String firstName,String lastName,String email,String password,String course) {
		super(id,firstName,lastName,email,password);
		this.course=course;
		
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	}
	

	

