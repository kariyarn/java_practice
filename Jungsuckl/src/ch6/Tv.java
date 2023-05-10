package ch6;

public class Tv {
		// Tv의 속성(멤버변수)
		String color;
		boolean power;
		int channel;
		
		//Tv의 기능(메서드)
		void power() { power = !power;}//Tv를 켜거나 끄는 기능을 하는 메서드
		void channelUp() {++channel;}//Tv의 채널을 높이는 기능을 하는 메서드
		void channelDown() {--channel;}//Tv의 채널을 낮추는 기능을 하는 메서드	
}
