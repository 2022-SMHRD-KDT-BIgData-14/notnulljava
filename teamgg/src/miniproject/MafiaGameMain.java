package miniproject;

import java.util.Scanner;

public class MafiaGameMain {
	static String id = null;
	static long beforeTime = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//ȸ������--------------------------------------------------------	
		joinMemberMain joinmembermain = new joinMemberMain();
		id = joinmembermain.main(args);
		
//		joinmembermain.join();
		
		//���ӽ���--------------------------------------------------------
		GameStart gamestart = new GameStart();
		beforeTime = gamestart.GameStart();
		
		
		//1��° ������� ��Ÿ����-------------------------------------------
		Day1 day1 = new Day1();
		day1.acinfo();
		
		//�κ�����---------------------------------------------------------
		Lobby lobby = new Lobby();
		long afterTime = lobby.main(args);
		

		
		
	}

}
