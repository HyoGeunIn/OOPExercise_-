package member.controller;

import java.util.Scanner;

import member.model.vo.Member;
import member.view.MemberMenu;

public class MemberManager {
	/*- m : Member[]     //static���� ����, �迭 ũ��� 10���� ����
			- ctn : int	   //static���� ����, �ʱⰪ�� 0���� ������  //ȸ�� �� üũ�� ����
			- sc : Scanner 	   //Ű����� ���� �Է� �޴� ��
	*/
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	public int num = 0;

	public void insertMember() {
		// Ű����� ���̵�, �н�����, �̸�, ����, ����, �̸��� �Է�
		// �Է� ���� ������ MemberŬ������ �Ű����� �ִ� �����ڸ� ����� ��ü ���� �� �迭�� ����
		// �ε����� ȸ���� ������Ŵ
		// "�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�." ��� �� ���θ޴��� ���ư�

		System.out.println("���̵� �Է� : ");
		String userId = sc.nextLine();
		System.out.println("�н����� �Է� : ");
		String userPwd = sc.nextLine();
		System.out.println("�̸� �Է� : ");
		String userName = sc.nextLine();
		System.out.println("���� �Է� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("���� �Է� : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("�̸��� �Է� : ");
		String email = sc.nextLine();

		m[num] = new Member(userId, userPwd, userName, age, gender, email);

		ctn++;
		num++;
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���θ޴��� ���ư��ϴ�.");
		return;
	}

	public void searchId() {
		// "�˻��� ���̵� �Է��ϼ��� : " ��� �� Ű����� ���̵� �Է� ����
		// ȸ�� ���� ����� �迭�� 0������ idx������ �Է¹��� ���̵�� ��ü �迭�� ���̵� �񱳸� �ݺ�
		// ��ġ�ϴ� �ε����� ã�Ƽ� �ش��ϴ� �迭�� �ε��� ��ü ���� ���
		// ��ġ�ϴ� ȸ���� ���� ��� "�˻��� ȸ�� ������ �������� �ʽ��ϴ�." ��� �� �������� ���ư�.
		// ��,printOne()����Ͽ� ���
		System.out.println("�˻��� ���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		for (int i = 0; i < m.length; i++) {
			if (userId.equals(m[i].getUserId())) {
				System.out.println("���� ��������");
			}

		}
	}

	public void searchName() {
		// ���̵� ã��� ����
		// �̸��� �Է��Ͽ� �̸��� ���Ͽ� �˻��� ȸ�� ���� ���
		// ���� ȸ���� ��� "�˻��� ȸ�� ������ �������� �ʽ��ϴ�." ��� �� �������� ���ư�.
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String userName = sc.nextLine();
		for (int i = 0; i < m.length; i++) {
			if (userName.equals(m[i].getUserName())) {
				System.out.println("���� ��������");
			}

		}
	}

	public void searchEmail() {
		// �̸��Ϸ� �˻��Ͽ� ���� �޼ҵ�� ������ ������� �ۼ�
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String userEmail = sc.nextLine();
		for (int i = 0; i < m.length; i++) {
			if (userEmail.equals(m[i].getEmail())) {
				System.out.println("���� ��������");
			}

		}

	}

	public void updatePwd() {
		// "������ ȸ���� ���̵� �Է��ϼ��� : " ��� �� Ű����� ���̵� �Է� ����
		// search��İ� �����ϰ� �˻��Ͽ� �ش� �ε��� ã�� ��
		// ������ ��й�ȣ�� �Է� ����
		// �ش� �迭 �ε��� ��ü�� setter�� �̿��Ͽ� ��й�ȣ ����
		// "�н����� ������ �Ϸ�Ǿ����ϴ� ��� �� ���θ޴��� ���ư�.
		// �����Ϸ��� ȸ���� ���� ��� "������ ȸ���� �������� �ʽ��ϴ�." ��� �� ���� �޴��� ���ư�.
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		int num = -1;
		for (int i = 0; i < m.length; i++) {
			if (userId.equals(m[i].getUserId())) {
				num++;

			}

		}
		if (num >= 0) {
			System.out.println("������ ��й�ȣ �Է�");
			String changePwd = sc.nextLine();
			m[num].setUserPwd(changePwd);
			System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
			return;
		} else {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			return;
		}

	}

	public void updateName() {
		// ��й�ȣ ����� ������ (������ ������ ������ �̸��� �Է¹޾� setter�� �����Ѵ�.)
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		int num = -1;
		for (int i = 0; i < m.length; i++) {
			if (userId.equals(m[i].getUserId())) {
				num++;

			}

		}
		if (num >= 0) {
			System.out.println("������ �̸� �Է�");
			String changeName = sc.nextLine();
			m[num].setUserName(changeName);
			System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
			return;
		} else {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			return;
		}

	}

	public void updateEmail() {
		// ��й�ȣ ����� ������ (������ ������ ������ �̸��� �ּҸ� �Է¹޾� setter�� �����Ѵ�.)
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		int num = -1;
		for (int i = 0; i < m.length; i++) {
			if (userId.equals(m[i].getUserId())) {
				num++;

			}

		}
		if (num >= 0) {
			System.out.println("������ �̸��� �Է�");
			String changeEmail = sc.nextLine();
			m[num].setEmail(changeEmail);
			System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
			return;
		} else {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			return;
		}

	}

	public void deleteOne() {
		// "Ż���� ȸ���� ���̵� �Է��ϼ��� : " ��� �� ���̵� �Է� ����
		// ���̵�� Ż���� ȸ���� �ε����� ã�� ��
		// ���� �ε��� ��ü(�ε���+1)�� ������ ��ĭ�� ������ �̵���Ŵ
		// Ż���� ȸ���� ���� ��� "������ ȸ�� ������ �������� �ʽ��ϴ�." ���
		// ������ ���������� �� ��� ctn�� 1 ���ҽ�Ŵ

	}

	public void deleteAll() {
		// 0~ctn������ ��� �ε����� ��� setter�� �̿��Ͽ� �ʱⰪ���� �����ϰ�
		// ctn ���� �ٽ� 0���� �����Ŵ
		for (int i = 0; i < ctn; i++) {
			m[i].setAge(0);
			m[i].setEmail(null);
			m[i].setGender(' ');
			m[i].setUserId(null);
			m[i].setUserName(null);
			m[i].setUserPwd(null);
		}
		ctn *= 0;

	}

	public void printAllMember() {
		// �ݺ����� �̿��Ͽ� ctn������ ��� �ε����� ��ü ������ getter�� ���� ��½�Ű�� �޼ҵ�
		for (int i = 0; i < ctn; i++) {
			System.out.println("���̵� : "+m[i].getUserId());
			System.out.println("��й�ȣ : "+m[i].getUserPwd());
			System.out.println("�̸� : "+m[i].getUserName());
			System.out.println("���� : "+m[i].getAge());
			System.out.println("���� : "+m[i].getGender());
			System.out.println("�̸��� : "+m[i].getEmail());
		}

	}

	public void printOne(Member m) {
		// ��½�ų Member��ü�� ���޹޾�, �ش� ��ü�� getter�� �̿��Ͽ� ���޹��� ��ü ������ �����
		//��������
	}

	public static void main(String[] args) {
		MemberMenu mMenu = new MemberMenu();
		mMenu.mainMenu();
	}

}
