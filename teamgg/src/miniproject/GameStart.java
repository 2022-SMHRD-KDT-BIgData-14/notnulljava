package miniproject;

import java.util.Scanner;

public class GameStart {

	public void GameStart() {
	Scanner sc = new Scanner(System.in);
	String gamestart = "[1]���ӽ����ϱ�";
	String back ="[2]���� �ܰ� ����";
	
	System.out.println(gamestart + "\t"+back);
	
	int choice = sc.nextInt();
	if(choice == 1) {
		//���⿡ �ð� ��°� �־��ָ� �˴ϴ�
		//bgm
		System.out.println("20XX�� ��� ����\n��ǳ�� ����ġ�� �����缶 ����� �ѹ��߿�..");
		System.out.println("���ƾƾƾƾƾ�!");//bgm
		System.out.println("������ ...\n202ȣ���� ��ȣ���� ���� ä �߰ߵǾ���.");
		System.out.println("��,������ ���ุ���� ��� ������ ���ε�..\n�����ʹ� ����� ���� �ʴ� ��...");
		System.out.println("�������� �� ���Ǿƿ� �Բ� ������ �ϴ� ��Ȳ..");
		System.out.println("�������� ��ھ�!! ��Ž���̴̼� �Ҿƹ����� �̸��� �ɰ�!��");
	} //else ȸ���������� �Ѿ�� 
	
	}

	

}
