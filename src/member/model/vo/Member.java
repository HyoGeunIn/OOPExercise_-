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
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
