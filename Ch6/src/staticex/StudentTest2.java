package staticex;

public class StudentTest2 {
	public static void main(String[] args) {
		//학생 객체 생성
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		//serial num은 1증가하지만 studentLee의 고유값이 아니므로 사용 X
		System.out.println(Student1.serialNum);
		System.out.println("이름 : " + studentLee.studentName + " 학 번  : " + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNum);
		System.out.println("이름 : " + studentSon.studentName + " 학 번  : " + studentSon.studentID);
	}
}
