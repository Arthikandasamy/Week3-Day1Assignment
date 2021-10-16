package assignment4;

public class Students {
	public void getStudentsInfo() {
		System.out.println("Display the student information");
	}
public void getStudentInfo(int id) {
	System.out.println("The ID is:"+id);

}
public void getStudentInfo(int id, String name) {
	System.out.println("The ID and name is:"+id+ " & name is:"+name);

}
public void getStudentInfo(String email, long Number) {
	System.out.println("The email and phone number is:"+email+ " & phone number is:"+Number);

}
	public static void main(String[] args) {
	Students std=new Students();
	std.getStudentInfo(101);
	std.getStudentInfo(101, "arthi");
	std.getStudentInfo("arthi2friends@gmail.com", 9087654321);

	}

}
