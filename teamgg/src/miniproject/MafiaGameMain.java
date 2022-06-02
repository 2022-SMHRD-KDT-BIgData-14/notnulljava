package miniproject;

import java.util.Scanner;

public class MafiaGameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		//회원가입--------------------------------------------------------	
		joinMemberMain joinmembermain = new joinMemberMain();
		joinmembermain.main(args);
//		joinmembermain.join();;	
		
		//게임시작--------------------------------------------------------
		GameStart gamestart = new GameStart();
		gamestart.GameStart();
		
		
		//1번째 사건정보 나타내기-------------------------------------------
		Day1 day1 = new Day1();
		day1.acinfo();
		
		//로비입장---------------------------------------------------------
		Lobby lobby = new Lobby();
		lobby.main(args);
		
		
		
		
		
	}

}
