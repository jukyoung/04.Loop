import java.util.Scanner;

public class Quiz03_VendingMachine {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int money = 3000; // ������
		int coke = 0; // �ݶ� ������ ����
		int soda = 0; // ���̴� ������ ����
		int plum = 0; // �Ž��� ������ ����
		
		//int coke_price = 1000; //�ݶ� ���� �� ������ ��Ƽ� �ֱ� �̷��� �� �� �� �ִ�.
		//int soda_price = 800;  // ���̴� ����
		//int plum_price = 1500; // �Ž� ����

		while (true) {

			System.out.println("\n=== ���Ǳ� �ùķ����� ===");
			System.out.println("������� �����ϼ���.");
			System.out.println("1. �ݶ�(1000) 2. ���̴�(800) 3. �Ž���(1500) [0. ����ǰ Ȯ��] 10. ���Ǳ� ����");
			System.out.print(">> ");
			int n = Integer.parseInt(sc.nextLine());

			if (n == 1) {

				if (money < 1000) {
					System.out.println("�ܾ��� �����մϴ�.");
					continue;
				}
				System.out.println("�ݶ� �����߽��ϴ�.");
				System.out.println("�ݶ� + 1");
				System.out.println("������ -1000");
				coke += 1;
				money -= 1000;

			} else if (n == 2) {

				if (money < 800) {
					System.out.println("�ܾ��� �����մϴ�.");
					continue;
				}
				System.out.println("���̴ٸ� �����߽��ϴ�.");
				System.out.println("���̴� + 1");
				System.out.println("������ -800");
				soda += 1;
				money -= 800;
			} else if (n == 3) {

				if (money < 1500) {
					System.out.println("�ܾ��� �����մϴ�.");
					continue;
				}
				System.out.println("�Ž����� �����߽��ϴ�.");
				System.out.println("�Ž��� + 1");
				System.out.println("������ -1500");
				plum += 1;
				money -= 1500;
			} else if (n == 0) {
				System.out.println("===== ����ǰ ��� =====");
				System.out.println("������ : " + money);
				System.out.println("�ݶ� : " + coke + "��");
				System.out.println("���̴� : " + soda + "��");
				System.out.println("�Ž��� : " + plum + "��");
				System.out.println("====================");
			} else if (n == 10) {
				System.out.println("���Ǳ� ����");
				break;
			} else {
				System.out.println("�Է��� ���ڸ� �ٽ� Ȯ�����ּ���.");
			}
			
		}
		
		/*if�� ��� switch������ �Ұ��
		  vending: while(true){
		switch(n) {
		case 1:// �ݶ�
			if(money < 1000) {//�ܾ��� �����ϸ�
				System.out.println("�ܾ��� �����մϴ�.");
				continue; ���� break; �ᵵ �Ȱ���
			}
			System.out.println("�ݶ� �����߽��ϴ�.");
			System.out.println("�ݶ� +1");
			System.out.println("������ -1000");
			money -= 1000;
			coke++;
			break;
		case 2: // ���̴�
			if(money < 800) {//�ܾ��� �����ϸ�
				System.out.println("�ܾ��� �����մϴ�.");
				break;
			}
			System.out.println("���̴ٸ� �����߽��ϴ�.");
			System.out.println("���̴� +1");
			System.out.println("������ -800");
			money -= 800;
			soda++;
			break;
		case 3:// �Ž���
			if(money < 1000) {//�ܾ��� �����ϸ�
				System.out.println("�ܾ��� �����մϴ�.");
				break;
			}
			System.out.println("�Ž����� �����߽��ϴ�.");
			System.out.println("�Ž��� +1");
			System.out.println("������ -1500");
			money -= 1500;
			plum++;
			break;
		case 0:// ����ǰ Ȯ��
			System.out.println("===== ����ǰ ��� =====");
			System.out.println("������ : " + money + "��");
			System.out.println("�ݶ� : " + coke + "��");
			System.out.println("���̴� : " + soda + "��");
			System.out.println("�Ž��� : " + plum + "��");
			System.out.println("====================");
			break;
		case 10:// ���Ǳ� ����
			System.out.println("���Ǳ� ����");
			break; <- switch�� ���� break�� �ݺ����� ���������°��� �ƴ�(���� ����� switch���� ��������)
			          ���� �ٽ� �ݺ� �Ǳ⶧���� ���α׷� ���ᰡ �Ǵ°��� �ƴ�
			          �ݺ����� ���������� ������ ��(�̸�) ���̱� vending �̶�� �̸� ����
			          ���� break vending; �̷��� �ϸ� �ݺ����� ������ �� �̶�°�!
		default: //�޴� �ٽ� ����
			 System.out.println("�޴��� �߸� �Է��߽��ϴ�.")
			 }
			 break; continue; ���� ����� �ݺ����̳� switch���� ���������°�
			*/
		
		}

	}

