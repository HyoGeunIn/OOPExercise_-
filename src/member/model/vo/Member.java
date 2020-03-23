package member.model.vo;

public class Member {
	/*1. Member 클래스 작성 : 회원 정보 클래스

	- filed 구성
	        - userId : String     	//아이디
	        - userPwd : String	//패스워드
	        - userName : String	//이름
	        - age : int		//나이
	        - gender : char		//성별
	        - email : String	//이메일

	- 디폴트 생성자와 매개변수 있는 생성자 2개 작성함
	- 각 필드에 대한 setter, getter 메소드 작성함*/
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
