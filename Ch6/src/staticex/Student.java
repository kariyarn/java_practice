package staticex;

public class Student {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	//studentName이라는 반환값을 가지고 있기 때문에 String을 쓴다.
	public String getStudentName() {
		return studentName;
	}
	
	//name을 객체의 studentName에 대입한 것이라 반환값이 없다 void
	public void setStudentname(String name) {
		studentName = name;
	}
}
