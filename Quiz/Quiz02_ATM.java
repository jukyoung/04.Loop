import java.util.Scanner;

public class Quiz02_ATM {
	public static void main(String[] args) {
		/* 1. ���α׷��� ����Ǹ� ��ü �޴��� ����ش�.
		 * 2. �޴� ���ÿ� ���� �Է°��� �޴´�.
		 * 3. �ܾ���ȸ�� �����ϸ� ���� ���� �ܾ��� ������ش�.
		 * 4. ��ü �޴��� �ٽ� ��µȴ�. (�ݺ���)...
		 * 5. ����ڿ��� �޴� ������ �Է� �޴´�.
		 * 6. �Ա��ϱ⸦ �����ϸ� �� �Ա����� �����. (���)
		 * 7. ������� �Է��� �޴´�. (�ݾ�)
		 * 8. ����ڰ� �Է��� ���� �̿��� ���ڿ��� ������ ���.
		 * 9. �� ������� ����� ��¹�
		 * 10. ������� �Է��� �޴´�. (�ݾ�)
		 * 11. ����ڰ� �Է��� ���� �̿��� ���ڿ��� ������ ���.
		 * 12. �����ϱ⸦ �����ϸ� �ŷ��� ����Ǿ����ϴ� ��� ������ ���.
		 * 13. �ݺ����� ����.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		

		int money = 3000; //while �� �������� ���� ��� 3000 �̶�� ���� ����Ǳ⶧���� while�� ����Ǳ��� ���� �����ϱ�
		
		while (true) {
			System.out.println("\n=== ATM �ùķ����� ===");
			System.out.println("1. �ܾ���ȸ");
			System.out.println("2. �Ա��ϱ�");
			System.out.println("3. ����ϱ�");
			System.out.println("4. �����ϱ� ");
			System.out.print(">> ");
			int n = Integer.parseInt(sc.nextLine());

			if (n == 1) {
				System.out.println("���� ���� �ܾ��� " + money + "�Դϴ�.");
			} else if (n == 2) {
				System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
				System.out.print(">> ");
				int plus = Integer.parseInt(sc.nextLine());
				System.out.println(plus + "���� �ԱݵǾ����ϴ�.");
				money += plus;
			} else if (n == 3) {
				System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
				System.out.print(">> ");
				int minus = Integer.parseInt(sc.nextLine());
				money -= minus;
				System.out.println(minus + "���� ��ݵǾ����ϴ�.");
			} else {
				System.out.println("�ŷ��� ����Ǿ����ϴ�.");
				break;
			}
		}
	}
}
