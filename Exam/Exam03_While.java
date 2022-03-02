import java.util.Scanner;

public class Exam03_While {
	public static void main(String[] args) {

		/* while(조건식){
		 *      실행할 코드
		 * }
		 * -> for문과 같은 역할(반복) -> 초기식 x 증감식 x
		 * -> 보통 언제까지 코드를 반복해야할지 모를 때
		 * -> 특별한 일이 일어나기 전까지 코드를 계속해서 반복해야 할 때
		 * */
		
		// 사용자가 q 라고 입력할때까지 계속 1 을 출력하세요
		Scanner sc = new Scanner(System.in);
		//조건식에는 true 뿐만 아니라 대소관계도 가능 하지만 안되는것 : false
		int i = 0;
		
		while(i < 2) { // true 조건이 맞으면 계속 실행 -> i가 0이니까 무한루프에 빠짐
			System.out.println("a");
			i++; // -> 추가함, 증감식을 이용해서 값을 더하면서 바뀜 그러면서 i=2가 되면 조건식이 false 니까 반복문 빠져나감
		}
		
		// while을 사용할때 특정 조건이 충족되면 세트로 써줘야하는 분기문
//		while(true) { //무한루프 (일부로 만들어줌 -> 무조건 반복이 되도록)
//			System.out.print("입력 >> ");
//			String input = sc.nextLine();
//			if(input.equals("q")) {
//				break;
//			}
//			System.out.println(1);
//		}
		
//		for(int i = 0; i >=0; i++) {
//			System.out.print("입력하세요 >> ");
//			String eng = sc.nextLine();
//			if(eng.equals("q")) {
//				break;
//			}
//			System.out.println(1);
//		}
		// q 를 누르기 전까지 종료되지 않음.
		String input = "";
		while(!input.equals("q")) { //문자열 비교 할때 같지 않음은 ! 를 붙임
			System.out.print("입력 >> ");
			input = sc.nextLine();
			System.out.println("같지 않습니다.");
		}
		
		
		
		
	}
}
