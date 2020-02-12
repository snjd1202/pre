package day03;

public class Test05 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 11;
		System.out.println((no1 > no2) && (no1++ < no2));
		// no1 > no2 는 거짓이고 이 전체 결과는 뒤를 실행안해도 거짓이니 뒷부분 연산은 실행하지 않는다.
		System.out.println("no1 : " + no1);
		System.out.println((no1 < no2) || (no1++ < no2));
		System.out.println("no1 : " + no1);
	}
}
