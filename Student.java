package college;

public class Student extends Department
{
	public void studentName() {
		System.out.println("Enter the student name");

	}
	public void studentDept() {
		
		System.out.println("Enter the student Department");
	}
public void studentId() {
	System.out.println("Enter the student ID");

}
	public static void main(String[] args) {
		Student std=new Student();
		std.collegeName();
		std.collegecode();
		std.collegeRank();
		std.studentName();
		std.studentDept();
		std.studentId();
		std.deptName();
	}

}
