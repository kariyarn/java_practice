package test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		
		//lotto의 6개 번호를 저장하는 것...Array? int? lotto의 data type이 int니까 int?
		
		ArrayList<Integer> lottos = new ArrayList<>();
		System.out.println("로또를 몇장 사십니까 : ");
		Scanner scan2 = new Scanner(System.in);
		int num = scan2.nextInt();
		
		for(int i = 0; i<num;i++) {
		int[] lotto = new int[6];
		Random ran = new Random();

		for(int j = 0; j<6; j++) {
			int ranNum =  ran.nextInt(1, 46);
			lotto[j] = ranNum;
				for(int k = 0; j<k; k++) {
					if(lotto[j] == lotto[k]) {
						i--;
						break;
					}
				}
		}
		lottos.add(lotto[num]);
		}
		
		System.out.print("로또 번호는 : ");
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter ");
		String str = scan.nextLine();
		//for(int i = 0; i<6; i++) {
		//	System.out.print(lotto[i] + " | ");
		}
	}
//}
