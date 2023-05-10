package staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentname("이지원");
		System.out.println(studentLee.serialNum); //serialNum의 초기값 출력
		studentLee.serialNum++; //serialNum의 숫자 증가, static이므로 전부 적용.
		
		Student studentSon = new Student();
		studentSon.setStudentname("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum); //증가된 serialNum을 입력하지 않아서 이지원의 serialNum도 손수경과 동일하게 출력됨.
				
	}
}
