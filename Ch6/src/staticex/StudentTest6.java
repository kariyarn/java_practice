package staticex;

public class StudentTest6 {
	public static void main(String[] args) {
		Student3 studentkim = new Student3();
		studentkim.setStudentName("김형규");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentkim.studentID);
		System.out.println(studentkim.studentCard);
		
		Student3 studentKang= new Student3();
		studentKang.setStudentName("강서우");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentKang.studentID);
		System.out.println(studentKang.studentCard);
		
	}
}
