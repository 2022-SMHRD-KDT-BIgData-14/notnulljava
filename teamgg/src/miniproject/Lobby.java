package miniproject;

import java.util.Scanner;

public class Lobby{
	

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	SelectDAO dao = new SelectDAO();
	String name = null ;
	long afterTime;
	System.out.println();
	System.out.println("당신은 로비에 도착했습니다");
	int cnt = 0;
	gameEnding ending = new gameEnding();
	
	while(true) {
		
		System.out.print("[1]마피아 지목 [2]알리바이 확인 [3]증거획득 [4]포기  ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			++cnt;
			dao.SelectName();
			System.out.println();
			
			if(cnt == 2) {
				System.out.println("마피아 지목 2번 기회를 전부 사용하셨습니다. ");
				System.out.println("게임 종료됩니다.");			
				ending.lose();
				break;
			}
		}else if(choice == 2) {
			System.out.println();
			System.out.println("당신이 생각하는 마피아를 골라주세요");
			System.out.println("[김영철] [이광식] [박철수] [홍아희] [김희미] [이병호]");
			name = sc.next();
			dao.Alibi(name);
		}else if(choice == 3) {
			Evidence evidence = new Evidence();
			evidence.main(args);

		}else if(choice == 4) {
			afterTime = System.currentTimeMillis();
			System.out.println("게임 포기를 누르셨습니다.");
			System.out.println("빠이~!!");
			break;
		}
		

		
	}
	
	}

}


