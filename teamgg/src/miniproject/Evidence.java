package miniproject;

import java.util.Scanner;

public class Evidence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arr_place = { "â�� �� ���� ����ϴ�,,,(â������ ħ���� ��)", "ħ�뿡��,,,,,,,,,,, ��,,,,,,,,,��,,,, ����ϴ�(����)",
				"�׷��� �ٴڿ��� ���ڱ��� ����(������ ���� �� ������ �ʴ�)" };
		String[] arr_office = { "�����մϴ�!! ������Ű�� ȹ���ϼ̽��ϴ�.>_<", "��� �� ���� ���!!" };
		String[] arr_kitchen = { "�ֹ��� ���� ���� �ƴϴ�,,", "���� ������ Į�� �ִµ�,, ���ܵ����ΰ�?", "���! ����� �ٺ�ť �׸��� �ֳ�,," };
		String[] arr_warehouse = { "������ ���δ�,,(���� ���� �ٺ�ť!!)", "������ �� ��������??", "��,,, ������ ������,,(�� �� ����,,,?)" };

		MinigameMain minigame = new MinigameMain();
		Minigame game = new Minigame();
		Lobby lobby = new Lobby();

		while (true) {
			System.out.println();
			System.out.println("�̴ϰ��� ���� �� ���� ȹ��!! ���� �� ���� ȹ�� ����");
			System.out.print("����ȹ���� ��� ����ּ���=> [1]������ [2]������ [3]�����ֹ� [4]â�� [5]�κ� ������");

			int choice = sc.nextInt();
			System.out.println("==================================================================");

			boolean result;
			int level_choice;

			// 1.
			// ������-------------------------------------------------------------------------------------------------------
			if (choice == 1) {
				// �̴ϰ���
				System.out.print("�١١����� ȹ���� ���� �̴ϰ����� �����մϴ�!  ");
				System.out.println("�̴ϰ����� ���̵��� �����ϼ���!�١١�");
				System.out.println("-------------------------------------------------------------");
				System.out
						.print("[1]level 1 \n" + "[2]level 2 \n" + "[3]level 3 \n" + "[4]level 4 \n" + "[5]level 5 \n");
				System.out.print("[��0��]SpecialGame(0����) \n");
				System.out.print("level ���� >> ");
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
					System.out.print("��ȣ�� �ٽ� �Է��ϼ���! >> ");
				}
				System.out.println("==================================================================");
				System.out.println();
				while (true) {
					System.out.println("[1]�ٽ� ���� �����ϱ� [2]�κ� ������");
					choice = sc.nextInt();
					if (choice == 1) {
						break;
					} else if (choice == 2) {
						lobby.main(args);
						// �κ�ȣ���ϱ�
					} else {
						System.out.println("�ٽ� �Է����ּ���!!");
					}

				}
				// 2.
				// ������---------------------------------------------------------------------------------------------------------------
			} else if (choice == 2) {
				// �̴ϰ���
				System.out.print("�١١����� ȹ���� ���� �̴ϰ����� �����մϴ�!  ");
				System.out.println("�̴ϰ����� ���̵��� �����ϼ���!�١١�");
				System.out.println("-------------------------------------------------------------");
				System.out.print("[1]level 1 \n" + "[2]level 2 \n" + "[3]level 3 \n" + "[4]level 4 \n" + "[5]level 5 \n");
				System.out.print("[��0��]SpecialGame(0����) \n");
				System.out.print("level ���� >> ");
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
//					System.out.print("��ȣ�� �ٽ� �Է��ϼ���! >> ");
//				}
				
				System.out.println("==================================================================");
				System.out.println();
				while (true) {
					System.out.println("[1]�ٽ� ���� �����ϱ� [2]�κ� ������");
					choice = sc.nextInt();
					if (choice == 1) {
						break;
					} else if (choice == 2) {
						// �κ�ȣ���ϱ�
						lobby.main(args);
					} else {
						System.out.println("�ٽ� �Է����ּ���!!");
					}

				}

				// 3.
				// �����ֹ�----------------------------------------------------------------------------------------
			} else if (choice == 3) {
				// �̴ϰ���

				// �̴ϰ���
				System.out.print("�١١����� ȹ���� ���� �̴ϰ����� �����մϴ�!  ");
				System.out.println("�̴ϰ����� ���̵��� �����ϼ���!�١١�");
				System.out.println("-------------------------------------------------------------");
				System.out
						.print("[1]level 1 \n" + "[2]level 2 \n" + "[3]level 3 \n" + "[4]level 4 \n" + "[5]level 5 \n");
				System.out.print("[��0��]SpecialGame(0����) \n");
				System.out.print("level ���� >> ");
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
					System.out.print("��ȣ�� �ٽ� �Է��ϼ���! >> ");
				}
				System.out.println("==================================================================");
				System.out.println();
				while (true) {
					System.out.println("[1]�ٽ� ���� �����ϱ� [2]�κ� ������");
					choice = sc.nextInt();
					if (choice == 1) {
						break;
					} else if (choice == 2) {
						// �κ�ȣ���ϱ�
						lobby.main(args);
					} else {
						System.out.println("�ٽ� �Է����ּ���!!");
					}

				}
				// 4.
				// â��--------------------------------------------------------------------------------------------------------------
			} else if (choice == 4) {
				// �̴ϰ���

				// �̴ϰ���
				System.out.print("�١١����� ȹ���� ���� �̴ϰ����� �����մϴ�!  ");
				System.out.println("�̴ϰ����� ���̵��� �����ϼ���!�١١�");
				System.out.println("-------------------------------------------------------------");
				System.out
						.print("[1]level 1 \n" + "[2]level 2 \n" + "[3]level 3 \n" + "[4]level 4 \n" + "[5]level 5 \n");
				System.out.print("[��0��]SpecialGame(0����) \n");
				System.out.print("level ���� >> ");
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
					System.out.print("��ȣ�� �ٽ� �Է��ϼ���! >> ");
				}
				System.out.println("==================================================================");
				System.out.println();
				while (true) {
					System.out.println("[1]�ٽ� ���� �����ϱ� [2]�κ� ������");
					choice = sc.nextInt();
					if (choice == 1) {
						break;
					} else if (choice == 2) {
						// �κ�ȣ���ϱ�
						lobby.main(args);
					} else {
						System.out.println("�ٽ� �Է����ּ���!!");
					}

				}

			} else if (choice == 5) {
				System.out.println("==================================================================");
				System.out.println();
				System.out.println("�κ� �����ڽ��ϴ�.");
				lobby.main(args);
				// �κ�ȣ���ϱ�----------------------------------------------------------------------------------------
				break;
			}

		}
	}
}
