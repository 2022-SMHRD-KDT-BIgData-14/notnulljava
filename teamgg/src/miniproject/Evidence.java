package miniproject;

import java.util.Scanner;

public class Evidence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arr_place = { "창문 밑 물이 흥건하다,,,(창문으로 침입한 듯)", "침대에도,,,,,,,,,,, 피,,,,,,,,,가,,,, 흥건하다(으아)",
				"그런데 바닥에는 발자국이 없다(문으로 들어온 것 같지는 않다)" };
		String[] arr_office = { "축하합니다!! 마스터키를 획득하셨습니다.>_<", "펜션 방 배정 출력!!" };
		String[] arr_kitchen = { "주방이 오픈 식이 아니다,,", "여러 종류의 칼이 있는데,, 범햄도구인가?", "어랏! 여기는 바베큐 그릴도 있네,," };
		String[] arr_warehouse = { "참숯이 보인다,,(역시 숯불 바베큐!!)", "밧줄이 왜 젖어있지??", "왜,,, 빨간색 우의지,,(색 왜 저래,,,?)" };

		MinigameMain minigame = new MinigameMain();
		Minigame game = new Minigame();
		Lobby lobby = new Lobby();

		while (true) {
			System.out.println();
			System.out.println("미니게임 성공 시 증거 획득!! 실패 시 증거 획득 실패");
			System.out.print("증거획득할 장소 골라주세요=> [1]사건장소 [2]관리실 [3]공용주방 [4]창고 [5]로비에 나가기");

			int choice = sc.nextInt();
			System.out.println("==================================================================");

			boolean result;
			int level_choice;

			// 1.
			// 사건장소-------------------------------------------------------------------------------------------------------
			if (choice == 1) {
				// 미니게임
				System.out.print("☆☆☆증거 획득을 위한 미니게임을 시작합니다!  ");
				System.out.println("미니게임의 난이도를 선택하세요!☆☆☆");
				System.out.println("-------------------------------------------------------------");
				System.out
						.print("[1]level 1 \n" + "[2]level 2 \n" + "[3]level 3 \n" + "[4]level 4 \n" + "[5]level 5 \n");
				System.out.print("[★0★]SpecialGame(0선택) \n");
				System.out.print("level 선택 >> ");
				level_choice = sc.nextInt();

				if (level_choice == 1) {

					result = game.level1();
					if (result == true) {
						for (int i = 0; i < arr_place.length; i++) {
							System.out.println(arr_place[i]);
						}
					}

				} else if (level_choice == 2) {
					result = game.level2();
					if (result == true) {
						for (int i = 0; i < arr_place.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 3) {

					result = game.level3();
					if (result == true) {
						for (int i = 0; i < arr_place.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 4) {
					result = game.level4();
					if (result == true) {
						for (int i = 0; i < arr_place.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 5) {
					result = game.level5();
					if (result == true) {
						for (int i = 0; i < arr_place.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else {
					System.out.print("번호를 다시 입력하세요! >> ");
				}
				System.out.println("==================================================================");
				System.out.println();
				while (true) {
					System.out.println("[1]다시 증거 수집하기 [2]로비에 나가기");
					choice = sc.nextInt();
					if (choice == 1) {
						break;
					} else if (choice == 2) {
						lobby.main(args);
						// 로비호출하기
					} else {
						System.out.println("다시 입력해주세요!!");
					}

				}
				// 2.
				// 관리실---------------------------------------------------------------------------------------------------------------
			} else if (choice == 2) {
				// 미니게임
				System.out.print("☆☆☆증거 획득을 위한 미니게임을 시작합니다!  ");
				System.out.println("미니게임의 난이도를 선택하세요!☆☆☆");
				System.out.println("-------------------------------------------------------------");
				System.out.print("[1]level 1 \n" + "[2]level 2 \n" + "[3]level 3 \n" + "[4]level 4 \n" + "[5]level 5 \n");
				System.out.print("[★0★]SpecialGame(0선택) \n");
				System.out.print("level 선택 >> ");
				level_choice = sc.nextInt();

				if (level_choice == 1) {

					result = game.level1();
					if (result == true) {
						for (int i = 0; i < arr_office.length; i++) {
							System.out.println(arr_place[i]);
						}
					}

				} else if (level_choice == 2) {
					result = game.level2();
					if (result == true) {
						for (int i = 0; i < arr_office.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 3) {

					result = game.level3();
					if (result == true) {
						for (int i = 0; i < arr_office.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 4) {
					result = game.level4();
					if (result == true) {
						for (int i = 0; i < arr_office.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 5) {
					result = game.level5();
					if (result == true) {
						for (int i = 0; i < arr_office.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 0) {
					result = game.rspGame();
					if (result == true) {
						for (int i = 0; i < arr_office.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} 
//				else {
//					System.out.print("번호를 다시 입력하세요! >> ");
//				}
				
				System.out.println("==================================================================");
				System.out.println();
				while (true) {
					System.out.println("[1]다시 증거 수집하기 [2]로비에 나가기");
					choice = sc.nextInt();
					if (choice == 1) {
						break;
					} else if (choice == 2) {
						// 로비호출하기
						lobby.main(args);
					} else {
						System.out.println("다시 입력해주세요!!");
					}

				}

				// 3.
				// 공용주방----------------------------------------------------------------------------------------
			} else if (choice == 3) {
				// 미니게임

				// 미니게임
				System.out.print("☆☆☆증거 획득을 위한 미니게임을 시작합니다!  ");
				System.out.println("미니게임의 난이도를 선택하세요!☆☆☆");
				System.out.println("-------------------------------------------------------------");
				System.out
						.print("[1]level 1 \n" + "[2]level 2 \n" + "[3]level 3 \n" + "[4]level 4 \n" + "[5]level 5 \n");
				System.out.print("[★0★]SpecialGame(0선택) \n");
				System.out.print("level 선택 >> ");
				level_choice = sc.nextInt();

				if (level_choice == 1) {

					result = game.level1();
					if (result == true) {
						for (int i = 0; i < arr_kitchen.length; i++) {
							System.out.println(arr_place[i]);
						}
					}

				} else if (level_choice == 2) {
					result = game.level2();
					if (result == true) {
						for (int i = 0; i < arr_kitchen.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 3) {

					result = game.level3();
					if (result == true) {
						for (int i = 0; i < arr_kitchen.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 4) {
					result = game.level4();
					if (result == true) {
						for (int i = 0; i < arr_kitchen.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 5) {
					result = game.level5();
					if (result == true) {
						for (int i = 0; i < arr_kitchen.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else {
					System.out.print("번호를 다시 입력하세요! >> ");
				}
				System.out.println("==================================================================");
				System.out.println();
				while (true) {
					System.out.println("[1]다시 증거 수집하기 [2]로비에 나가기");
					choice = sc.nextInt();
					if (choice == 1) {
						break;
					} else if (choice == 2) {
						// 로비호출하기
						lobby.main(args);
					} else {
						System.out.println("다시 입력해주세요!!");
					}

				}
				// 4.
				// 창고--------------------------------------------------------------------------------------------------------------
			} else if (choice == 4) {
				// 미니게임

				// 미니게임
				System.out.print("☆☆☆증거 획득을 위한 미니게임을 시작합니다!  ");
				System.out.println("미니게임의 난이도를 선택하세요!☆☆☆");
				System.out.println("-------------------------------------------------------------");
				System.out
						.print("[1]level 1 \n" + "[2]level 2 \n" + "[3]level 3 \n" + "[4]level 4 \n" + "[5]level 5 \n");
				System.out.print("[★0★]SpecialGame(0선택) \n");
				System.out.print("level 선택 >> ");
				level_choice = sc.nextInt();

				if (level_choice == 1) {

					result = game.level1();
					if (result == true) {
						for (int i = 0; i < arr_warehouse.length; i++) {
							System.out.println(arr_place[i]);
						}
					}

				} else if (level_choice == 2) {
					result = game.level2();
					if (result == true) {
						for (int i = 0; i < arr_warehouse.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 3) {

					result = game.level3();
					if (result == true) {
						for (int i = 0; i < arr_warehouse.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 4) {
					result = game.level4();
					if (result == true) {
						for (int i = 0; i < arr_warehouse.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else if (level_choice == 5) {
					result = game.level5();
					if (result == true) {
						for (int i = 0; i < arr_warehouse.length; i++) {
							System.out.println(arr_place[i]);
						}
					}
				} else {
					System.out.print("번호를 다시 입력하세요! >> ");
				}
				System.out.println("==================================================================");
				System.out.println();
				while (true) {
					System.out.println("[1]다시 증거 수집하기 [2]로비에 나가기");
					choice = sc.nextInt();
					if (choice == 1) {
						break;
					} else if (choice == 2) {
						// 로비호출하기
						lobby.main(args);
					} else {
						System.out.println("다시 입력해주세요!!");
					}

				}

			} else if (choice == 5) {
				System.out.println("==================================================================");
				System.out.println();
				System.out.println("로비 나가겠습니다.");
				lobby.main(args);
				// 로비호출하기----------------------------------------------------------------------------------------
				break;
			}

		}
	}
}
