package miniproject;

import java.util.Scanner;

public class joinMemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		joinMemberDAO dao = new joinMemberDAO();

		while (true) {
			System.out.println("=================================================================");
			System.out.println("�� ������ �����ϱ� �� ȸ�������� �Ϸ����ּ���. ȸ�������� �Ϸ��ߴٸ� �α����� ���ּ���! ��");
			System.out.print("[1]ȸ������ [2]�α��� [3]ȸ��Ż�� [4]������ >> ");
			int menu = sc.nextInt();
			System.out.println("=================================================================");

			if (menu == 1) {
				join();

			} else if (menu == 2) {
				System.out.print("�α����� ���� ID�� �Է��ϼ���. >> ");
				String input_id = sc.next();
				System.out.print("�α����� ���� PW�� �Է��ϼ���. >> ");
				String input_pw = sc.next();
				joinMemberDTO dto = new joinMemberDTO(input_id, input_pw);

				dao.login(dto);
				System.out.println("=================================================================");
				break;
			} else if (menu == 3) {
				dao.delete();
				System.out.println("=================================================================");
			} else if (menu == 4) {
				System.out.println("���� �Ǿ����ϴ�.");
				System.out.println("=================================================================");
				break;
			} else
				System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�. ");

		}

	}

	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println("                              ȸ������                              ");
		System.out.println("=================================================================");

		while (true) {
			System.out.print("ID�� �Է��ϼ��� >> ");
			String user_id = sc.next();
			System.out.print("PW�� �Է��ϼ��� >> ");
			String user_pw = sc.next();
			System.out.print("�̸��� �Է��ϼ��� >> ");
			String user_name = sc.next();

			joinMemberDTO dto = new joinMemberDTO(user_id, user_pw, user_name);
			joinMemberDAO dao = new joinMemberDAO();
			int cnt = dao.insert(dto);

			if (cnt > 0) {
				System.out.println(user_name + "�� ȸ�������� �Ϸ�Ǿ����ϴ�!");
				break;
			} else
				System.out.println("ID�� �ߺ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
	}

}
