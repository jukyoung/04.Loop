import java.util.Scanner;

public class Practice_0303 {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  int money = 3500;
	  int saewookkang = 0;
	  int sumichip = 0;
	  int choco = 0;
	  
	  while(true) {
	  System.out.println("\n==== ���� ���� �ùķ����� ====");
	  System.out.println("���ڸ� �����ϼ���");
	  System.out.println("�����(900��) 2.����Ĩ(1800��) 3.���ڼ���(550��) 4.�� ����ǰ Ȯ�� 9.����");
	  System.out.print(">> ");
	  int input = Integer.parseInt(sc.nextLine());
	  
	  if(input == 1) {
		  if(money < 900) {
			  System.out.println("�ܾ��� �����մϴ�.");
			  continue;
		  }
		  System.out.println("������� �����߽��ϴ�.");
		  System.out.println("����� +1");
		  System.out.println("������ -900��");
		  money -= 900;
		  saewookkang += 1;
	  }else if(input == 2) {
		  if(money < 1800) {
			  System.out.println("�ܾ��� �����մϴ�.");
			  continue;
		  }
		  System.out.println("����Ĩ�� �����߽��ϴ�.");
		  System.out.println("����Ĩ +1");
		  System.out.println("������ -1800��");
		  money -= 1800;
		  sumichip += 1;
	  }else if(input == 3) {
		  if(money < 550) {
		  System.out.println("�ܾ��� �����մϴ�.");
		  continue;
	  }
		  System.out.println("���ڼ��̸� �����߽��ϴ�.");
		  System.out.println("���ڼ��� +1");
		  System.out.println("������ -550��");
		  money -= 550;
		  choco += 1;
	  }else if(input == 4) {
		  System.out.println("==== �� ����ǰ Ȯ�� ====");
		  System.out.println("�� ������ : " + money + "��");
		  System.out.println("����� : " + saewookkang + "��");
		  System.out.println("����Ĩ : " + sumichip + "��");
		  System.out.println("���ڼ��� : " + choco + "��");
		  System.out.println("=====================");
	  }else {
		  System.out.println("�ùķ����͸� �����մϴ�.");
		  break;
	  }
	  }
	  
}
}
