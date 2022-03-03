import java.util.Scanner;

public class Quiz03_VendingMachine {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int money = 3000; // 소지금
		int coke = 0; // 콜라 소지한 개수
		int soda = 0; // 사이다 소지한 개수
		int plum = 0; // 매실차 소지한 개수
		
		//int coke_price = 1000; //콜라 가격 을 변수로 잡아서 넣기 이렇게 할 수 도 있다.
		//int soda_price = 800;  // 사이다 가격
		//int plum_price = 1500; // 매실 가격

		while (true) {

			System.out.println("\n=== 자판기 시뮬레이터 ===");
			System.out.println("음료수를 선택하세요.");
			System.out.println("1. 콜라(1000) 2. 사이다(800) 3. 매실차(1500) [0. 소지품 확인] 10. 자판기 종료");
			System.out.print(">> ");
			int n = Integer.parseInt(sc.nextLine());

			if (n == 1) {

				if (money < 1000) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				System.out.println("콜라를 구매했습니다.");
				System.out.println("콜라 + 1");
				System.out.println("소지금 -1000");
				coke += 1;
				money -= 1000;

			} else if (n == 2) {

				if (money < 800) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				System.out.println("사이다를 구매했습니다.");
				System.out.println("사이다 + 1");
				System.out.println("소지금 -800");
				soda += 1;
				money -= 800;
			} else if (n == 3) {

				if (money < 1500) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				System.out.println("매실차를 구매했습니다.");
				System.out.println("매실차 + 1");
				System.out.println("소지금 -1500");
				plum += 1;
				money -= 1500;
			} else if (n == 0) {
				System.out.println("===== 소지품 목록 =====");
				System.out.println("소지금 : " + money);
				System.out.println("콜라 : " + coke + "개");
				System.out.println("사이다 : " + soda + "개");
				System.out.println("매실차 : " + plum + "개");
				System.out.println("====================");
			} else if (n == 10) {
				System.out.println("자판기 종료");
				break;
			} else {
				System.out.println("입력한 숫자를 다시 확인해주세요.");
			}
			
		}
		
		/*if문 대신 switch문으로 할경우
		  vending: while(true){
		switch(n) {
		case 1:// 콜라
			if(money < 1000) {//잔액이 부족하면
				System.out.println("잔액이 부족합니다.");
				continue; 쓰나 break; 써도 똑같음
			}
			System.out.println("콜라를 구매했습니다.");
			System.out.println("콜라 +1");
			System.out.println("소지금 -1000");
			money -= 1000;
			coke++;
			break;
		case 2: // 사이다
			if(money < 800) {//잔액이 부족하면
				System.out.println("잔액이 부족합니다.");
				break;
			}
			System.out.println("사이다를 구매했습니다.");
			System.out.println("사이다 +1");
			System.out.println("소지금 -800");
			money -= 800;
			soda++;
			break;
		case 3:// 매실차
			if(money < 1000) {//잔액이 부족하면
				System.out.println("잔액이 부족합니다.");
				break;
			}
			System.out.println("매실차를 구매했습니다.");
			System.out.println("매실차 +1");
			System.out.println("소지금 -1500");
			money -= 1500;
			plum++;
			break;
		case 0:// 소지품 확인
			System.out.println("===== 소지품 목록 =====");
			System.out.println("소지금 : " + money + "개");
			System.out.println("콜라 : " + coke + "개");
			System.out.println("사이다 : " + soda + "개");
			System.out.println("매실차 : " + plum + "개");
			System.out.println("====================");
			break;
		case 10:// 자판기 종료
			System.out.println("자판기 종료");
			break; <- switch문 안의 break라 반복문을 빠져나가는것이 아님(가장 가까운 switch문을 빠져나감)
			          따라서 다시 반복 되기때문에 프로그램 종료가 되는것이 아님
			          반복문을 빠져나가고 싶을때 라벨(이름) 붙이기 vending 이라고 이름 붙임
			          따라서 break vending; 이렇게 하면 반복문을 종료할 것 이라는것!
		default: //메뉴 다시 선택
			 System.out.println("메뉴를 잘못 입력했습니다.")
			 }
			 break; continue; 가장 가까운 반복문이나 switch문을 빠져나가는것
			*/
		
		}

	}

