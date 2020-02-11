package day02;

public class Test01 {
	public static void main(String[] a) {
		String msg = "오늘은 ";
		String month = "2월 ";
		String day = "11일 ";
		String str = "입니다.";
		System.out.print("결과 : " + msg + month + day + str); // 1번
		System.out.print("결과 : " + msg + month + day + str); // 2번
		System.out.println();
		System.out.println("결과 : " + msg + month + day + str); // 3번
		System.out.println("결과 : " + msg + month + day + str); // 4번
		
		// 변수 변경하기
		msg = "내일은 ";
		day = "12일 ";
		
		System.out.println();
		System.out.println("결과 : " + msg + month + day + str); // 3번
		System.out.println("결과 : " + msg + month + day + str); // 4번
	}
}
