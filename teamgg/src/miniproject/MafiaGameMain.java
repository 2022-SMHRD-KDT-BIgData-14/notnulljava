package miniproject;

import java.util.Scanner;

public class MafiaGameMain {
	static String id = null;
	static long beforeTime = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//회원가입--------------------------------------------------------	
		joinMemberMain joinmembermain = new joinMemberMain();
		id = joinmembermain.main(args);
		
//		joinmembermain.join();
		
		//게임시작--------------------------------------------------------
		GameStart gamestart = new GameStart();
		beforeTime = gamestart.GameStart();
		
		
		//1번째 사건정보 나타내기-------------------------------------------
		Day1 day1 = new Day1();
		day1.acinfo();
		
		//로비입장---------------------------------------------------------
		Lobby lobby = new Lobby();
		long afterTime = lobby.main(args);
		

		
		
	}

}
