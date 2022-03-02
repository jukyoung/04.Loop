import java.util.Scanner;

public class Exam02_For {
	public static void main(String[] args) {

		// 언제까지 반복문을 돌려야할지 모르는 경우
		// 1부터 사용자가 입력한 값까지 출력하는 코드를 작성

    	Scanner sc = new Scanner(System.in);
//    	
//    	System.out.print("정수를 입력하세요. >> ");
//    	int num = Integer.parseInt(sc.nextLine());

//    	for(int i = 1; i <= num; i++) {
//    		System.out.print(i + " ");
//    	}

		// 1부터 사용자가 입력한 값까지 출력을 할건데 홀수만 출력
		// 1.출력문 안쪽에서 조건식을 통해 홀수만 걸러 출력 -> 나머지 연산에 따라 홀짝 판별
//    	for(int i = 1; i <= num; i++) {
//    		if((i % 2) == 1) {
//    			System.out.print(i + " ");
//    		}
//    	} 	
		// 2. 증감식을 이용해 i에 2씩 증가시켜서 홀수로 만들기
//    	for(int i = 1; i <= num; i+=2) {
//    		System.out.print(i + " ");
//    	}

		// 1~5 까지 숫자를 차례대로 출력하는데 3만 빼고 출력하세요
		
//		for (int i = 1; i <= 5; i++) {
//			if (i != 3) {
//				System.out.print(i + " ");
//			}
//		}
		//1~3 까지 숫자를 차례대로 출력하는데 2만 빼고 출력하세요
		//continue -> 현재 진행되고 있는 반복 흐름이 종료
		// -> 현재 돌고있는 바퀴의 끝지점으로 건너뛰게 됨.
//		for (int i = 1; i <= 3; i++) {
//			if(i == 2) {
//				continue;
//			} // continue; = 스위치문의 break; 와 비슷
//			 System.out.print(i + " ");
//		}
		
		// 사용자에게 입력값을 받을 것
		// 1부터 입력값까지의 전체 합을 출력
		// 입력값: 5
		// 1 + 2 + 3 + 4 + 5 -> 더한 값을 기억하는 변수 라는 공간이 필요함
    	System.out.print("입력 >> ");
		int num = Integer.parseInt(sc.nextLine());
		
		//지역변수 : 반복문/조건문 혹은 매서드(기능)의 {} 안 범위에서만 사용할 수 있는 변수
		// 같은 지역에서 선언된 변수는 얼마든지 같은 영역에서 가져다 사용하는 것 가능
		// 작은 지역에서 선언된 변수는 더 큰 지역에서 사용 x
		// 반면 더 큰 지역에서 선언된 변수는 더 작은 지역에서 사용 o
		
		int sum = 0;// 공간이 계속 유지 덮어 씌워지는 것 이 없어서
		for(int i =1; i <= num; i++) {
			//System.out.println(i); 
			//int sum = 0; 계속 돌아도 0이라는 값이 새로 덮어 씌어짐 
			//sum 이라는 변수-> 지역변수, for문의 바깥에서는 변수로 사용할수없음
			sum += i ;
		}System.out.println("합계 : " + sum);
	}
	}

