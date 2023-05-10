package ch5_array;

public class ArrayEx6 {
	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];//배열의 첫 번째 값으로 최대값을 초기화한다.
		int min = score[0];//배열의 첫 번째 값으로 최소값을 초기화한다.
		
		for (int i = 0; i < score.length; i++) {
			//반복문 돌면서 가장 높은 값 찾기
			if (score[i]>max) {
				max = score[i];
			//반복문 돌면서 가장 낮은 값 찾기
			}else if(score[i]<min) {
				min=score[i];
			}
		} // end of for;
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}//end of main
}//end of class
