import java.util.Scanner;

public class Pratice01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1~100 사이의 숫자를 입력하세요 >> ");
		int num = Integer.parseInt(sc.nextLine());

		String star = "*";

		for (int i = 1; i <= num; i++) {
			if (num >= 1 & num <= 100) {
				System.out.println(star);
				star += "*";
			}

		}

	}
}
