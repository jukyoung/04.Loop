import java.util.Scanner;

public class Quiz02_ATM {
	public static void main(String[] args) {
		/* 1. 프로그램이 실행되면 전체 메뉴를 띄워준다.
		 * 2. 메뉴 선택에 대한 입력값을 받는다.
		 * 3. 잔액조회를 선택하면 현재 보유 잔액을 출력해준다.
		 * 4. 전체 메뉴가 다시 출력된다. (반복문)...
		 * 5. 사용자에게 메뉴 선택을 입력 받는다.
		 * 6. 입금하기를 선택하면 얼마 입금할지 물어본다. (출력)
		 * 7. 사용자의 입력을 받는다. (금액)
		 * 8. 사용자가 입력한 값을 이용해 문자열과 연결해 출력.
		 * 9. 얼마 출금할지 물어보는 출력문
		 * 10. 사용자의 입력을 받는다. (금액)
		 * 11. 사용자가 입력한 값을 이용해 문자열과 연결해 출력.
		 * 12. 종료하기를 선택하면 거래가 종료되었습니다 라는 구문이 출력.
		 * 13. 반복문을 종료.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		

		int money = 3000; //while 문 안쪽으로 가면 계속 3000 이라는 것이 선언되기때문에 while문 실행되기전 위에 선언하기
		
		while (true) {
			System.out.println("\n=== ATM 시뮬레이터 ===");
			System.out.println("1. 잔액조회");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 종료하기 ");
			System.out.print(">> ");
			int n = Integer.parseInt(sc.nextLine());

			if (n == 1) {
				System.out.println("현재 보유 잔액은 " + money + "입니다.");
			} else if (n == 2) {
				System.out.println("얼마를 입금하시겠습니까?");
				System.out.print(">> ");
				int plus = Integer.parseInt(sc.nextLine());
				System.out.println(plus + "원이 입금되었습니다.");
				money += plus;
			} else if (n == 3) {
				System.out.println("얼마를 출금하시겠습니까?");
				System.out.print(">> ");
				int minus = Integer.parseInt(sc.nextLine());
				money -= minus;
				System.out.println(minus + "원이 출금되었습니다.");
			} else {
				System.out.println("거래가 종료되었습니다.");
				break;
			}
		}
	}
}
