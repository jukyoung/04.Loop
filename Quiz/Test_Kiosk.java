import java.util.Scanner;

public class Test_Kiosk {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int balance = 10000;
		char cont = ' ';

		one: while (true) {
			System.out.println("\n==== KH ī�� Ű����ũ ====");
			System.out.println("�ֹ��� �޴��� ������ �ּ���.");
			System.out.println("1. �Ƹ޸�ī��(2,000)");
			System.out.println("2. �ٴҶ��(3,000)");
			System.out.println("3. �ڸ����̵�(3,500)");
			System.out.println("���� �ܾ� : " + balance + "��");
			System.out.print("�޴� ���� >> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				if (balance < 2000) {
					System.out.println("\n�ܾ��� �����մϴ�.");
					System.out.println("���� �ܾ� : " + balance + "��");
					two: while (true) {
						System.out.println("\n��� �ֹ� �Ͻ÷��� Y�� �ֹ��� �����Ϸ��� N�� �Է��ϼ���.");
						System.out.print(">> ");
						cont = sc.nextLine().charAt(0);
						if (cont == 'N') {
							System.out.println("KH ī�並 ã���ּż� �����մϴ�. ������ �� ������!");
							break one;
						} else if (cont == 'Y') {
							continue one;
						} else {
							System.out.println("Y/N �� �ϳ��� ��Ȯ�� �Է��� �ּ���.");
							continue two;
						}
					}
				}
				balance -= 2000;
				System.out.println("\n�Ƹ޸�ī�븦 �����߽��ϴ�.");
				System.out.println("���� �ܾ� : " + balance + "��");
				thr: while (true) {
					System.out.println("\n��� �ֹ� �Ͻ÷��� Y�� �ֹ��� �����Ϸ��� N�� �Է��ϼ���.");
					System.out.print(">> ");
					cont = sc.nextLine().charAt(0);
					if (cont == 'N') {
						System.out.println("KH ī�並 ã���ּż� �����մϴ�. ������ �� ������!");
						break one;
					} else if (cont == 'Y') {
						continue one;
					} else {
						System.out.println("Y/N �� �ϳ��� ��Ȯ�� �Է��� �ּ���.");
						continue thr;
					}
				}
			} else if (menu == 2) {
				if (balance < 3000) {
					System.out.println("\n�ܾ��� �����մϴ�.");
					System.out.println("���� �ܾ� : " + balance + "��");
					four: while (true) {
						System.out.println("\n��� �ֹ� �Ͻ÷��� Y�� �ֹ��� �����Ϸ��� N�� �Է��ϼ���.");
						System.out.print(">> ");
						cont = sc.nextLine().charAt(0);
						if (cont == 'N') {
							System.out.println("KH ī�並 ã���ּż� �����մϴ�. ������ �� ������!");
							break one;
						} else if (cont == 'Y') {
							continue one;
						} else {
							System.out.println("Y/N �� �ϳ��� ��Ȯ�� �Է��� �ּ���.");
							continue four;
						}
					}
				}
				balance -= 3000;
				System.out.println("\n�ٴҶ�󶼸� �����߽��ϴ�.");
				System.out.println("���� �ܾ� : " + balance + "��");
				five: while (true) {
					System.out.println("\n��� �ֹ� �Ͻ÷��� Y�� �ֹ��� �����Ϸ��� N�� �Է��ϼ���.");
					System.out.print(">> ");
					cont = sc.nextLine().charAt(0);
					if (cont == 'N') {
						System.out.println("KH ī�並 ã���ּż� �����մϴ�. ������ �� ������!");
						break one;
					} else if (cont == 'Y') {
						continue one;
					} else {
						System.out.println("Y/N �� �ϳ��� ��Ȯ�� �Է��� �ּ���.");
						continue five;
					}
				}
			} else if (menu == 3) {
				if (balance < 3500) {
					System.out.println("\n�ܾ��� �����մϴ�.");
					System.out.println("���� �ܾ� : " + balance + "��");
					six: while (true) {
						System.out.println("\n��� �ֹ� �Ͻ÷��� Y�� �ֹ��� �����Ϸ��� N�� �Է��ϼ���.");
						System.out.print(">> ");
						cont = sc.nextLine().charAt(0);
						if (cont == 'N') {
							System.out.println("KH ī�並 ã���ּż� �����մϴ�. ������ �� ������!");
							break one;
						} else if (cont == 'Y') {
							continue one;
						} else {
							System.out.println("Y/N �� �ϳ��� ��Ȯ�� �Է��� �ּ���.");
							continue six;
						}
					}
				}
				balance -= 3500;
				System.out.println("\n�ڸ����̵带 �����߽��ϴ�.");
				System.out.println("���� �ܾ� : " + balance + "��");
				seven: while (true) {
					System.out.println("\n��� �ֹ� �Ͻ÷��� Y�� �ֹ��� �����Ϸ��� N�� �Է��ϼ���.");
					System.out.print(">> ");
					cont = sc.nextLine().charAt(0);
					if (cont == 'N') {
						System.out.println("KH ī�並 ã���ּż� �����մϴ�. ������ �� ������!");
						break one;
					} else if (cont == 'Y') {
						continue one;
					} else {
						System.out.println("Y/N �� �ϳ��� ��Ȯ�� �Է��� �ּ���.");
						continue seven;
					}
				}
			} else {
				System.out.println("���� �޴��� �����߽��ϴ�. �ٽ� �������ּ���.");
				continue one;
			}

		}

	}
}
