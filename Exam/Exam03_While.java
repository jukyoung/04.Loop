import java.util.Scanner;

public class Exam03_While {
	public static void main(String[] args) {

		/* while(���ǽ�){
		 *      ������ �ڵ�
		 * }
		 * -> for���� ���� ����(�ݺ�) -> �ʱ�� x ������ x
		 * -> ���� �������� �ڵ带 �ݺ��ؾ����� �� ��
		 * -> Ư���� ���� �Ͼ�� ������ �ڵ带 ����ؼ� �ݺ��ؾ� �� ��
		 * */
		
		// ����ڰ� q ��� �Է��Ҷ����� ��� 1 �� ����ϼ���
		Scanner sc = new Scanner(System.in);
		//���ǽĿ��� true �Ӹ� �ƴ϶� ��Ұ��赵 ���� ������ �ȵǴ°� : false
		int i = 0;
		
		while(i < 2) { // true ������ ������ ��� ���� -> i�� 0�̴ϱ� ���ѷ����� ����
			System.out.println("a");
			i++; // -> �߰���, �������� �̿��ؼ� ���� ���ϸ鼭 �ٲ� �׷��鼭 i=2�� �Ǹ� ���ǽ��� false �ϱ� �ݺ��� ��������
		}
		
		// while�� ����Ҷ� Ư�� ������ �����Ǹ� ��Ʈ�� ������ϴ� �б⹮
//		while(true) { //���ѷ��� (�Ϻη� ������� -> ������ �ݺ��� �ǵ���)
//			System.out.print("�Է� >> ");
//			String input = sc.nextLine();
//			if(input.equals("q")) {
//				break;
//			}
//			System.out.println(1);
//		}
		
//		for(int i = 0; i >=0; i++) {
//			System.out.print("�Է��ϼ��� >> ");
//			String eng = sc.nextLine();
//			if(eng.equals("q")) {
//				break;
//			}
//			System.out.println(1);
//		}
		// q �� ������ ������ ������� ����.
		String input = "";
		while(!input.equals("q")) { //���ڿ� �� �Ҷ� ���� ������ ! �� ����
			System.out.print("�Է� >> ");
			input = sc.nextLine();
			System.out.println("���� �ʽ��ϴ�.");
		}
		
		
		
		
	}
}
