package miniproject;

import java.util.Scanner;

public class Lobby{
	

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	SelectDAO dao = new SelectDAO();
	String name = null ;
	long afterTime;
	System.out.println();
	System.out.println("����� �κ� �����߽��ϴ�");
	int cnt = 0;
	gameEnding ending = new gameEnding();
	
	while(true) {
		
		System.out.print("[1]���Ǿ� ���� [2]�˸����� Ȯ�� [3]����ȹ�� [4]����  ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			++cnt;
			dao.SelectName();
			System.out.println();
			
			if(cnt == 2) {
				System.out.println("���Ǿ� ���� 2�� ��ȸ�� ���� ����ϼ̽��ϴ�. ");
				System.out.println("���� ����˴ϴ�.");			
				ending.lose();
				break;
			}
		}else if(choice == 2) {
			System.out.println();
			System.out.println("����� �����ϴ� ���ǾƸ� ����ּ���");
			System.out.println("[�迵ö] [�̱���] [��ö��] [ȫ����] [�����] [�̺�ȣ]");
			name = sc.next();
			dao.Alibi(name);
		}else if(choice == 3) {
			Evidence evidence = new Evidence();
			evidence.main(args);

		}else if(choice == 4) {
			afterTime = System.currentTimeMillis();
			System.out.println("���� ���⸦ �����̽��ϴ�.");
			System.out.println("����~!!");
			break;
		}
		

		
	}
	
	}

}


