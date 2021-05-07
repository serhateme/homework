package homework;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName()+" "+student.getStudentNumber()+"Öğrencisi Eklendi");
	}
	public void delte(Student student) {
		System.out.println(student.getFirstName()+" "+student.getStudentNumber()+"Öğrencisi Silindi");
	}
}
