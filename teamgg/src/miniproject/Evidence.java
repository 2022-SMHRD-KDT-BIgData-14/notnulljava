package miniproject;

import java.util.Scanner;

public class Evidence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr_place = {"â�� �� ���� ����ϴ�,,,(â������ ħ���� ��)", "ħ�뿡��,,,,,,,,,,, ��,,,,,,,,,��,,,, ����ϴ�(����)", "�׷��� �ٴڿ��� ���ڱ��� ����(������ ���� �� ������ �ʴ�)" };
		String[] arr_office = {"�����մϴ�!! ������Ű�� ȹ���ϼ̽��ϴ�.>_<", "��� �� ���� ���!!"};
		String[] arr_kitchen = {"�ֹ��� ���� ���� �ƴϴ�,,", "���� ������ Į�� �ִµ�,, ���ܵ����ΰ�?", "���! ����� �ٺ�ť �׸��� �ֳ�,,"};
		String[] arr_warehouse = {"������ ���δ�,,(���� ���� �ٺ�ť!!)", "������ �� ��������??", "��,,, ������ ������,,(�� �� ����,,,?)"};
		
		while(true) {
		System.out.println();
		System.out.println("���ż���: ���Ÿ��� ����� �̴ϰ��� ����, ���� �� ���ż���!! ���� �� ���� ȹ�� ����");
		System.out.print("���� ����=> [1]������ [2]������ [3]�����ֹ� [4]â�� [5]�κ� ������");

		int choice = sc.nextInt();
		System.out.println();
		System.out.println("==================================================================");
		

		if(choice == 1) {
			//�̴ϰ���
			for(int i=0; i<arr_place.length; i++) {
				System.out.println(arr_place[i]);
			}
			System.out.println("==================================================================");
			System.out.println();
			while(true) {
				System.out.println("[1]�ٽ� ���� �����ϱ� [2]�κ� ������");
				choice = sc.nextInt();
				if(choice == 1) {
					break;
				}else if(choice == 2){
					// �κ�ȣ���ϱ�---------------------------------------------------------------------------------------
				}else{System.out.println("�ٽ� �Է����ּ���!!");
				}
			}


		}else if(choice == 2){
			//�̴ϰ���
			
			for(int i=0; i<arr_office.length; i++) {
				System.out.println(arr_place[i]);
			}
			System.out.println("==================================================================");
			System.out.println();
			while(true) {
				System.out.println("[1]�ٽ� ���� �����ϱ� [2]�κ� ������");
				choice = sc.nextInt();
				if(choice == 1) {
					break;
				}else if(choice == 2){
					// �κ�ȣ���ϱ�---------------------------------------------------------------------------------------
				}else{System.out.println("�ٽ� �Է����ּ���!!");
				}
			}
			
		}else if(choice == 3) {
			//�̴ϰ���
			for(int i=0; i<arr_kitchen.length; i++) {
				System.out.println(arr_place[i]);
			}
			System.out.println("==================================================================");
			System.out.println();
			while(true) {
				System.out.println("[1]�ٽ� ���� �����ϱ� [2]�κ� ������");
				choice = sc.nextInt();
				if(choice == 1) {
					break;
				}else if(choice == 2){
					// �κ�ȣ���ϱ�---------------------------------------------------------------------------------------
				}else{System.out.println("�ٽ� �Է����ּ���!!");
				}
			}
			
		}else if(choice == 4) {
			//�̴ϰ���
			for(int i=0; i<arr_warehouse.length; i++) {
				System.out.println(arr_place[i]);
			}
			System.out.println("==================================================================");
			System.out.println();
			while(true) {
				System.out.println("[1]�ٽ� ���� �����ϱ� [2]�κ� ������");
				choice = sc.nextInt();
				if(choice == 1) {
					break;
				}else if(choice == 2){
					// �κ�ȣ���ϱ�---------------------------------------------------------------------------------------
				}else{System.out.println("�ٽ� �Է����ּ���!!");
				}
			}
			
		}else if(choice == 6) {
			System.out.println("==================================================================");
			System.out.println();
			System.out.println("�κ� �����ڽ��ϴ�.");
			//�κ�ȣ���ϱ�----------------------------------------------------------------------------------------
			break;
		}
		
		}
	}
		

}
