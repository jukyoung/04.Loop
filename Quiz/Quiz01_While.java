import java.util.Scanner;

public class Quiz01_While {
    public static void main(String[] args) {
	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print("\nù��° ���ڸ� �Է��ϼ���. >> ");
        	int a = Integer.parseInt(sc.nextLine());
        	System.out.print("�ι�° ���ڸ� �Է��ϼ���. >> ");
        	int b = Integer.parseInt(sc.nextLine());
        	
        	if(a > 0 && b > 0) {
        		System.out.println("\n" + (a + b));
        	}else {
        		System.out.println("\n���ڸ� �߸� �Է��ϼ̽��ϴ�.");
        		break;
        	}
    	}
    	
    	
    	
}
}
