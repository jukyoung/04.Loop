import java.util.Scanner;

public class Test_Kiosk {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int balance = 10000;
		char cont = ' ';

		one: while (true) {
			System.out.println("\n==== KH 카페 키오스크 ====");
			System.out.println("주문할 메뉴를 선택해 주세요.");
			System.out.println("1. 아메리카노(2,000)");
			System.out.println("2. 바닐라라떼(3,000)");
			System.out.println("3. 자몽에이드(3,500)");
			System.out.println("현재 잔액 : " + balance + "원");
			System.out.print("메뉴 선택 >> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				if (balance < 2000) {
					System.out.println("\n잔액이 부족합니다.");
					System.out.println("남은 잔액 : " + balance + "원");
					two: while (true) {
						System.out.println("\n계속 주문 하시려면 Y를 주문을 종료하려면 N을 입력하세요.");
						System.out.print(">> ");
						cont = sc.nextLine().charAt(0);
						if (cont == 'N') {
							System.out.println("KH 카페를 찾아주셔서 감사합니다. 다음에 또 오세요!");
							break one;
						} else if (cont == 'Y') {
							continue one;
						} else {
							System.out.println("Y/N 중 하나만 정확히 입력해 주세요.");
							continue two;
						}
					}
				}
				balance -= 2000;
				System.out.println("\n아메리카노를 선택했습니다.");
				System.out.println("남은 잔액 : " + balance + "원");
				thr: while (true) {
					System.out.println("\n계속 주문 하시려면 Y를 주문을 종료하려면 N을 입력하세요.");
					System.out.print(">> ");
					cont = sc.nextLine().charAt(0);
					if (cont == 'N') {
						System.out.println("KH 카페를 찾아주셔서 감사합니다. 다음에 또 오세요!");
						break one;
					} else if (cont == 'Y') {
						continue one;
					} else {
						System.out.println("Y/N 중 하나만 정확히 입력해 주세요.");
						continue thr;
					}
				}
			} else if (menu == 2) {
				if (balance < 3000) {
					System.out.println("\n잔액이 부족합니다.");
					System.out.println("남은 잔액 : " + balance + "원");
					four: while (true) {
						System.out.println("\n계속 주문 하시려면 Y를 주문을 종료하려면 N을 입력하세요.");
						System.out.print(">> ");
						cont = sc.nextLine().charAt(0);
						if (cont == 'N') {
							System.out.println("KH 카페를 찾아주셔서 감사합니다. 다음에 또 오세요!");
							break one;
						} else if (cont == 'Y') {
							continue one;
						} else {
							System.out.println("Y/N 중 하나만 정확히 입력해 주세요.");
							continue four;
						}
					}
				}
				balance -= 3000;
				System.out.println("\n바닐라라떼를 선택했습니다.");
				System.out.println("남은 잔액 : " + balance + "원");
				five: while (true) {
					System.out.println("\n계속 주문 하시려면 Y를 주문을 종료하려면 N을 입력하세요.");
					System.out.print(">> ");
					cont = sc.nextLine().charAt(0);
					if (cont == 'N') {
						System.out.println("KH 카페를 찾아주셔서 감사합니다. 다음에 또 오세요!");
						break one;
					} else if (cont == 'Y') {
						continue one;
					} else {
						System.out.println("Y/N 중 하나만 정확히 입력해 주세요.");
						continue five;
					}
				}
			} else if (menu == 3) {
				if (balance < 3500) {
					System.out.println("\n잔액이 부족합니다.");
					System.out.println("남은 잔액 : " + balance + "원");
					six: while (true) {
						System.out.println("\n계속 주문 하시려면 Y를 주문을 종료하려면 N을 입력하세요.");
						System.out.print(">> ");
						cont = sc.nextLine().charAt(0);
						if (cont == 'N') {
							System.out.println("KH 카페를 찾아주셔서 감사합니다. 다음에 또 오세요!");
							break one;
						} else if (cont == 'Y') {
							continue one;
						} else {
							System.out.println("Y/N 중 하나만 정확히 입력해 주세요.");
							continue six;
						}
					}
				}
				balance -= 3500;
				System.out.println("\n자몽에이드를 선택했습니다.");
				System.out.println("남은 잔액 : " + balance + "원");
				seven: while (true) {
					System.out.println("\n계속 주문 하시려면 Y를 주문을 종료하려면 N을 입력하세요.");
					System.out.print(">> ");
					cont = sc.nextLine().charAt(0);
					if (cont == 'N') {
						System.out.println("KH 카페를 찾아주셔서 감사합니다. 다음에 또 오세요!");
						break one;
					} else if (cont == 'Y') {
						continue one;
					} else {
						System.out.println("Y/N 중 하나만 정확히 입력해 주세요.");
						continue seven;
					}
				}
			} else {
				System.out.println("없는 메뉴를 선택했습니다. 다시 선택해주세요.");
				continue one;
			}

		}

	}
}
