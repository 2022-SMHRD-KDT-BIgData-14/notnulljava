package miniproject;

import java.util.Scanner;

public class MafiaGameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		//ȸ������--------------------------------------------------------	
		joinMemberMain joinmembermain = new joinMemberMain();
		joinmembermain.main(args);
//		joinmembermain.join();;	
		
		//���ӽ���--------------------------------------------------------
		GameStart gamestart = new GameStart();
		gamestart.GameStart();
		
		
		//1��° ������� ��Ÿ����-------------------------------------------
		Day1 day1 = new Day1();
		day1.acinfo();
		
		//�κ�����---------------------------------------------------------
		Lobby lobby = new Lobby();
		lobby.main(args);
		
		
		
		
		
	}

}
