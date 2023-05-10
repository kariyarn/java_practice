package staticex;

public class Student1 {
	//필드 -> 설계에 필요한 기본 구성요소 설정
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	//메소드 구현
	public Student1() {
		serialNum++; // 학생이 생성될 때마다 증가
		studentID = serialNum; // 증가된 값을 학번 인스턴스 변수에 부여.
		/*
		 * static변수를 바로 학번으로 사용하면 안 됨(모든 객체가 공유하므로)
		 * 그래서 그 변수를 바로 학번으로 대입시켜준다.
		 */
	}
	
	//사실 get의 역할을 잘 모르겠네...
	public String getStudentName() {
		return studentName;
	}
	
	//매개변수를 통해 객체에 새로운 학생의 이름을 입력.
	//매개변수에 따라 객체의 이름이 매개변수에 입력한 내용으로 바뀐다.
	public void setStudentName(String name) {
		studentName = name;
	}
}
