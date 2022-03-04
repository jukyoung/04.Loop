import java.util.Scanner;

public class Quiz01_While {
    public static void main(String[] args) {
	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print("\n첫번째 숫자를 입력하세요. >> ");
        	int a = Integer.parseInt(sc.nextLine());
        	System.out.print("두번째 숫자를 입력하세요. >> ");
        	int b = Integer.parseInt(sc.nextLine());
        	
        	if(a > 0 && b > 0) {
        		System.out.println("\n" + (a + b));
        	}else {
        		System.out.println("\n숫자를 잘못 입력하셨습니다.");
        		break;
        	}
    	}
    	
    	
    	
}
}
