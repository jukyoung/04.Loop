import java.util.Scanner;

public class Practice_0303 {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  int money = 3500;
	  int saewookkang = 0;
	  int sumichip = 0;
	  int choco = 0;
	  
	  while(true) {
	  System.out.println("\n==== 과자 가게 시뮬레이터 ====");
	  System.out.println("과자를 선택하세요");
	  System.out.println("새우깡(900원) 2.수미칩(1800원) 3.초코송이(550원) 4.내 소지품 확인 9.종료");
	  System.out.print(">> ");
	  int input = Integer.parseInt(sc.nextLine());
	  
	  if(input == 1) {
		  if(money < 900) {
			  System.out.println("잔액이 부족합니다.");
			  continue;
		  }
		  System.out.println("새우깡을 구매했습니다.");
		  System.out.println("새우깡 +1");
		  System.out.println("소지금 -900원");
		  money -= 900;
		  saewookkang += 1;
	  }else if(input == 2) {
		  if(money < 1800) {
			  System.out.println("잔액이 부족합니다.");
			  continue;
		  }
		  System.out.println("수미칩을 구매했습니다.");
		  System.out.println("수미칩 +1");
		  System.out.println("소지금 -1800원");
		  money -= 1800;
		  sumichip += 1;
	  }else if(input == 3) {
		  if(money < 550) {
		  System.out.println("잔액이 부족합니다.");
		  continue;
	  }
		  System.out.println("초코송이를 구매했습니다.");
		  System.out.println("초코송이 +1");
		  System.out.println("소지금 -550원");
		  money -= 550;
		  choco += 1;
	  }else if(input == 4) {
		  System.out.println("==== 내 소지품 확인 ====");
		  System.out.println("내 소지금 : " + money + "개");
		  System.out.println("새우깡 : " + saewookkang + "개");
		  System.out.println("수미칩 : " + sumichip + "개");
		  System.out.println("초코송이 : " + choco + "개");
		  System.out.println("=====================");
	  }else {
		  System.out.println("시뮬레이터를 종료합니다.");
		  break;
	  }
	  }
	  
}
}
