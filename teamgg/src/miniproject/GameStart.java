package miniproject;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class GameStart {

	public long GameStart() {
	Scanner sc = new Scanner(System.in);
	String login = "[1]로그인하기";
	String gamestart ="[2]게임시작하기";
	
	System.out.println(login + "\t"+gamestart);
	int choice = sc.nextInt();
	long BeforeTime = 0;
	long AfterTime = 0;
	MP3Player mp3 = new MP3Player();

	joinMemberMain joinmembermain = new joinMemberMain();
	
	if(choice == 2) {
		//여기에 시간 재는거 넣어주면 됩니당
		BeforeTime = System.currentTimeMillis();
		
		//bgm
		
		if(mp3.isPlaying()) {
			mp3.stop();}
		mp3.play(".\\music\\playStart.mp3");
		
		System.out.println("20XX년 어느 여름\n폭풍이 몰아치는 스인재섬 펜션의 한밤중에..");
		System.out.println("끄아아아아아악!");//bgm
		System.out.println("다음날 ...\n202호에서 이호일이 죽은 채 발견되었다.");
		System.out.println("입,출항이 예약만으로 투어가 가능한 무인도..\n육지와는 통신이 되지 않는 곳...");
		System.out.println("누구인지 모를 마피아와 함께 보내야 하는 상황..");
		System.out.println("『범인을 잡겠어!! 명탐정이셨던 할아버지의 이름을 걸고!』");
		
		System.out.println(BeforeTime);
		System.out.println();
	} //else 로그인으로 넘어가기 
	else if(choice == 1) {
		joinMemberDAO dao = new joinMemberDAO();
		
		System.out.print("로그인을 위한 ID를 입력하세요. >> ");
		String input_id = sc.next();
		System.out.print("로그인을 위한 PW를 입력하세요. >> ");
		String input_pw = sc.next();
		
		joinMemberDTO dto = new joinMemberDTO(input_id, input_pw);

//		dao.login(dto);
//		joinmembermain.join();;	
		

//		String[] args = null;
//		joinmembermain.main(args);
		
	}
	
	return BeforeTime;
	
	}



	

}
