package miniproject;

import java.util.Scanner;

public class GameStart {

	public void GameStart() {
	Scanner sc = new Scanner(System.in);
	String gamestart = "[1]게임시작하기";
	String back ="[2]이전 단계 가기";
	
	System.out.println(gamestart + "\t"+back);
	
	int choice = sc.nextInt();
	if(choice == 1) {
		//여기에 시간 재는거 넣어주면 됩니당
		//bgm
		System.out.println("20XX년 어느 여름\n폭풍이 몰아치는 스인재섬 펜션의 한밤중에..");
		System.out.println("끄아아아아아악!");//bgm
		System.out.println("다음날 ...\n202호에서 이호일이 죽은 채 발견되었다.");
		System.out.println("입,출항이 예약만으로 투어가 가능한 무인도..\n육지와는 통신이 되지 않는 곳...");
		System.out.println("누구인지 모를 마피아와 함께 보내야 하는 상황..");
		System.out.println("『범인을 잡겠어!! 명탐정이셨던 할아버지의 이름을 걸고!』");
	} //else 회원가입으로 넘어가기 
	
	}

	

}
