package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	/*2. MemberMenu Ŭ���� �ۼ� : ȸ�� ������ ���α׷� �޴�
	- field ����
		- sc : Scanner     	//Ű����� ���� �Է� �޴� ��
		- mm : MemberManager 	//ȸ������ ��������� Ŭ���� ��ü ����
		

	- ����Ʈ ������ �ۼ�

	- �޼ҵ� �ۼ�*/
	private Scanner sc = new Scanner(System.in);
	MemberManager mm = new MemberManager();
		public void mainMenu(){
			
			do {
				System.out.println("========== ȸ�� ���� �޴� ==========");
				System.out.println("1. �ű� ȸ�� ���");
				System.out.println("2. ȸ�� ���� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ���� ����");
				System.out.println("5. ȸ�� ���� ���");
				System.out.println("9. ����");
				System.out.println("====================================");
				System.out.println("�޴� ��ȣ�� �Է��ϼ��� :");
				int forSwitch = sc.nextInt();
				switch(forSwitch) {
				case 1 :mm.insertMember(); break;
				case 2 :searchMemberMenu(); break;
				case 3 :updateMemberMenu(); break;
				case 4 :deleteMemberMenu(); break;
				case 5 :mm.printAllMember(); break;
				case 9 :System.out.println("���α׷��� �����մϴ�."); return;
				}
			}while(true);
			/*//�޴��� �ݺ� ��µǰ� ��dd
			<����ȭ��>
			========== ȸ�� ���� �޴� ==========
			1. �ű� ȸ�� ���
			2. ȸ�� ���� �˻�
			3. ȸ�� ���� ����
			4. ȸ�� ���� ����
			5. ȸ�� ���� ���
			9. ����
			====================================
			�޴� ��ȣ�� �Է��ϼ��� : 

			- �Էµ� ��ȣ�� ���� MemberManager Ŭ������ �޼ҵ尡 ����ǰ� ��
			- �˻�, ����, ���� �޴��� ���� �θ޴��� ���� �޼ҵ带 �����ϰ� ��
			  1�� ���ý� >> MemberManager Ŭ������ insertMember() ����
			  2�� ���ý� >> searchMemberMenu();
			  3�� ���ý� >> updateMemberMenu();
			  4�� ���ý� >> deleteMemberMenu();
			  5�� ���ý� >> MemberManager Ŭ������ printAllMember() ����
			  9�� ���ý� >> System.out.println("���α׷��� �����մϴ�."); return; //������
		}

		
		
		}
		
*/
		}
		public void searchMemberMenu(){
			//�޴��� �ݺ� ��µǰ� ��
			/*<����ȭ��>
			========== ȸ�� ���� �˻� ==========
			1. ���̵�� �˻��ϱ�
			2. �̸����� �˻��ϱ�
			3. �̸��Ϸ� �˻��ϱ�
			9. ���θ޴���
			====================================
			�޴� ��ȣ�� �Է��ϼ��� : 

			- �Էµ� ��ȣ�� ���� MemberManager Ŭ������ �޼ҵ尡 ����ǰ� ��
			  1�� ���ý� >> MemberManager�� searchId() ����
			  2�� ���ý� >> MemberManager�� searchName()����
			  3�� ���ý� >> MemberManager�� searchEmail()����
			  9�� ���ý� >> System.out.println("���θ޴��� �̵��մϴ�."); return; //���θ޴��� ���ư�*/
			  }
		public void updateMemberMenu(){
			//�޴��� �ݺ� ��µǰ� ��
			/*<����ȭ��>
			========== ȸ�� ���� ���� ==========
			1. ��й�ȣ �����ϱ�
			2. �̸� �����ϱ�
			3. �̸��� �����ϱ�
			9. ���θ޴���
			====================================
			�޴� ��ȣ�� �Է��ϼ��� :

			- �Էµ� ��ȣ�� ���� MemberManager Ŭ������ �޼ҵ尡 ����ǰ� ��
			  1�� �Է½� >> MemberManager�� updatePwd() ����
			  2�� �Է½� >> MemberManager�� updateName() ����
			  3�� �Է½� >> MemberManager�� updateEmail() ����
			  9�� �Է½� >> System.out.println("���θ޴��� �̵��մϴ�."); return;  //���θ޴��� ���ư�
*/		
			}
		public void deleteMemberMenu(){
			//�޴��� �ݺ� ��µǰ� ��
			/*<����ȭ��>
			=========== ȸ�� ���� ���� ===========
			1. ȸ�� ����
			2. ��ü ȸ�� ����
			9. ���θ޴���
			======================================
			�޴� ��ȣ�� �Է��ϼ��� : 

			- �Էµ� ��ȣ�� ���� MemberManager Ŭ������ �޼ҵ尡 ����ǰ� ��
			  1�� �Է½� >> MemberManager�� deleteOne() ����
			  2�� �Է½� >> MemberManager�� deleteAll() ����
			  9�� �Է½� >> System.out.println("���θ޴��� �̵��մϴ�."); return;  //���θ޴��� ���ư�
*/			
		}

}
