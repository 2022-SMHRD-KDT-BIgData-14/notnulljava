package miniproject;

import java.util.Scanner;

public class GameStart {

	public void GameStart() {
	Scanner sc = new Scanner(System.in);
	String login = "[1]�α����ϱ�";
	String gamestart ="[2]���ӽ����ϱ�";
	
	System.out.println(login + "\t"+gamestart);
	int choice = sc.nextInt();
	long BeforeTime = 0;
	long AfterTime = 0;

	joinMemberMain joinmembermain = new joinMemberMain();
	
	if(choice == 2) {
		//���⿡ �ð� ��°� �־��ָ� �˴ϴ�
		BeforeTime = System.currentTimeMillis();
		
		//bgm
		System.out.println("20XX�� ��� ����\n��ǳ�� ����ġ�� �����缶 ����� �ѹ��߿�..");
		System.out.println("���ƾƾƾƾƾ�!");//bgm
		System.out.println("������ ...\n202ȣ���� ��ȣ���� ���� ä �߰ߵǾ���.");
		System.out.println("��,������ ���ุ���� ��� ������ ���ε�..\n�����ʹ� ����� ���� �ʴ� ��...");
		System.out.println("�������� �� ���Ǿƿ� �Բ� ������ �ϴ� ��Ȳ..");
		System.out.println("�������� ��ھ�!! ��Ž���̴̼� �Ҿƹ����� �̸��� �ɰ�!��");
		
		System.out.println(BeforeTime);
		System.out.println();
	} //else �α������� �Ѿ�� 
	else if(choice == 1) {
		joinMemberDAO dao = new joinMemberDAO();
		
		System.out.print("�α����� ���� ID�� �Է��ϼ���. >> ");
		String input_id = sc.next();
		System.out.print("�α����� ���� PW�� �Է��ϼ���. >> ");
		String input_pw = sc.next();
		
		joinMemberDTO dto = new joinMemberDTO(input_id, input_pw);

//		dao.login(dto);
//		joinmembermain.join();;	
		

//		String[] args = null;
//		joinmembermain.main(args);
		
	}
	
	
	}



	

}
