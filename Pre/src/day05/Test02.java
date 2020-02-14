package day05;

import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		// 두자리 숫자(10 ~ 59)를 입력받아서 그수가 십의단위중 몇보다 큰수인지 알아내세요.
		// 할일
		// 1. 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력하고
		System.out.print("10 ~ 59 중 숫자를 입력하세요! : ");
		// 3. 입력받아서 변수에 담고
		int no = sc.nextInt();
		// 4. 십의자리 계산하고
		// 		조건에 따라 담을 데이터 변수 만들고
		
		int num = 0;
		// 5. 조건처리하고
		if(no >= 10 && no < 60) {
			if(no >= 50) {
				num = 50;
			} else if(no >= 40) {
				num = 40;
			} else if(no >= 30) {
				num = 30;
			} else if(no >= 20) {
				num = 20;
			} else if(no >= 10) {
				num = 10;
			}
		} else {
			num = 0;
		}
		
		// 6. 출력하고
		System.out.println("입력한 숫자 [ " + no + " ] 의 십의 자리는 " + num + " 입니다.");
	}
}
