package member.model.vo;

public class Member {
	/*1. Member Ŭ���� �ۼ� : ȸ�� ���� Ŭ����

	- filed ����
	        - userId : String     	//���̵�
	        - userPwd : String	//�н�����
	        - userName : String	//�̸�
	        - age : int		//����
	        - gender : char		//����
	        - email : String	//�̸���

	- ����Ʈ �����ڿ� �Ű����� �ִ� ������ 2�� �ۼ���
	- �� �ʵ忡 ���� setter, getter �޼ҵ� �ۼ���*/
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	private String email;
	public Member() {}
	public Member(String userId , String userPwd) {
		
	}
	public Member(int age , char gender) {
		
	}
	

}
