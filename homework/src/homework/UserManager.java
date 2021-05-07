package homework;

public class UserManager  {
	public void login(User user) {
		System.out.println(user.getFirstName()+"  Giriþ Yaptý");
	}
	public void exit(User user) {
		System.out.println(user.getFirstName()+"  Çýkýþ yaptý");	
	}
}
