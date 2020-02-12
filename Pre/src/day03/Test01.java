package day03;

public class Test01 {
	public static void main(String[] args) {
		int no = 10; // = : 대입 연산자
		System.out.println("1. no : " + no);
		no = no + 1;
		System.out.println("2. no : " + no);
		no += 1; // ==> no = no + 1;
		System.out.println("3. no : " + no);
		
		/*
			-=  : 
			*=
			/=
			%=
		 */
		
		int num = 3;
		num *= 2; // ==> num = num * 2;
		num *= 2;
		System.out.println("num : " + num);
	}
}
