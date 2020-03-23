package member.controller;

import java.util.Scanner;

import member.model.vo.Member;
import member.view.MemberMenu;

public class MemberManager {
	/*- m : Member[]     //static으로 선언, 배열 크기는 10으로 지정
			- ctn : int	   //static으로 선언, 초기값은 0으로 지정함  //회원 수 체크용 변수
			- sc : Scanner 	   //키보드로 정보 입력 받는 용
*/
	private static Member[] m = new Member[10];
	private static int ctn = 0 ;
	private Scanner sc = new Scanner(System.in);
	public void insertMember(){
		//키보드로 아이디, 패스워드, 이름, 나이, 성별, 이메일 입력
				//입력 받은 정보를 Member클래스의 매개변수 있는 생성자를 사용해 객체 생성 후 배열에 저장
				//인덱스와 회원수 증가시킴
				//"입력이 완료되었습니다. 메인 메뉴로 돌아갑니다." 출력 후 메인메뉴로 돌아감
		
	}
	public void searchId(){
		//"검색할 아이디를 입력하세요 : " 출력 후 키보드로 아이디 입력 받음
				//회원 정보 저장용 배열의 0번부터 idx값까지 입력받은 아이디와 객체 배열의 아이디를 비교를 반복
				//일치하는 인덱스값 찾아서 해당하는 배열의 인덱스 객체 정보 출력
				//일치하는 회원이 없는 경우 "검색한 회원 정보가 존재하지 않습니다." 출력 후 메인으로 돌아감.
				//단,printOne()사용하여 출력
		
	}
	public void searchName(){
		//아이디 찾기와 동일
		//이름을 입력하여 이름을 비교하여 검색된 회원 정보 출력
		//없는 회원인 경우 "검색한 회원 정보가 존재하지 않습니다." 출력 후 메인으로 돌아감.
	
	}
	public void searchEmail(){
		//이메일로 검색하여 위의 메소드와 동일한 방식으로 작성		

	}
	public void updatePwd(){
		//"수정할 회원의 아이디를 입력하세요 : " 출력 후 키보드로 아이디 입력 받음
		//search방식과 동일하게 검색하여 해당 인덱스 찾은 후 
		//변경할 비밀번호를 입력 받음
		//해당 배열 인덱스 객체의 setter를 이용하여 비밀번호 변경
		//"패스워드 수정이 완료되었습니다 출력 후 메인메뉴로 돌아감.
		//수정하려는 회원이 없는 경우 "수정할 회원이 존재하지 않습니다." 출력 후 메인 메뉴로 돌아감.
	
	}
	public void updateName(){
		//비밀번호 변경과 동일함 (수정할 정보는 변경할 이름을 입력받아 setter로 변경한다.)

	}
	public void updateEmail(){
		//비밀번호 변경과 동일함 (수정할 정보는 변경할 이메일 주소를 입력받아 setter로 변경한다.)

	}
	public void deleteOne(){
		//"탈퇴할 회원의 아이디를 입력하세요 : " 출력 후 아이디 입력 받음
		//아이디로 탈퇴할 회원의 인덱스를 찾은 후 
		//다음 인덱스 객체(인덱스+1)의 정보를 한칸씩 앞으로 이동시킴
		//탈퇴할 회원이 없는 경우 "삭제할 회원 정보가 존재하지 않습니다." 출력
		//삭제가 성공적으로 된 경우 ctn을 1 감소시킴

	}
	public void deleteAll(){
		//0~ctn까지의 모든 인덱스의 모든 setter를 이용하여 초기값으로 변경하고
		//ctn 값을 다시 0으로 변경시킴

	}
	public void printAllMember(){
		//반복문을 이용하여 ctn까지의 모든 인덱스의 객체 정보를 getter를 통해 출력시키는 메소드

	}
	public void printOne(Member m){
		//출력시킬 Member객체를 전달받아, 해당 객체의 getter를 이용하여 전달받은 객체 정보를 출력함
	}
	public static void main(String[] args){
		MemberMenu mMenu = new MemberMenu();		
		mMenu.mainMenu();
	}
	
	
	
}
