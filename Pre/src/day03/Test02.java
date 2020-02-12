package day03;

public class Test02 {
	public static void main(String[] args) {
		/*
			증감연산자 ( ++, -- )
				: 연산기호를 기준으로 기호 다음 처음 나오는 변수에 1을 더해주거나 빼준다.
		 */
		
		int no = 10;
		int num = 10;
//		no++;
		System.out.println("no : " + no++);
		System.out.println("no : " + no);
		System.out.println("no : " + no);
		System.out.println("num : " + ++num);
		
	}
}
