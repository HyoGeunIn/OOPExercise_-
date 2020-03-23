package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	/*2. MemberMenu 클래스 작성 : 회원 관리용 프로그램 메뉴
	- field 구성
		- sc : Scanner     	//키보드로 정보 입력 받는 용
		- mm : MemberManager 	//회원관리 기능제공용 클래스 객체 생성
		

	- 디폴트 생성자 작성

	- 메소드 작성*/
	private Scanner sc = new Scanner(System.in);
	MemberManager mm = new MemberManager();
		public void mainMenu(){
			
			do {
				System.out.println("========== 회원 관리 메뉴 ==========");
				System.out.println("1. 신규 회원 등록");
				System.out.println("2. 회원 정보 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 정보 삭제");
				System.out.println("5. 회원 정보 출력");
				System.out.println("9. 종료");
				System.out.println("====================================");
				System.out.println("메뉴 번호를 입력하세요 :");
				int forSwitch = sc.nextInt();
				switch(forSwitch) {
				case 1 :mm.insertMember(); break;
				case 2 :searchMemberMenu(); break;
				case 3 :updateMemberMenu(); break;
				case 4 :deleteMemberMenu(); break;
				case 5 :mm.printAllMember(); break;
				case 9 :System.out.println("프로그램을 종료합니다."); return;
				}
			}while(true);
			/*//메뉴는 반복 출력되게 함dd
			<실행화면>
			========== 회원 관리 메뉴 ==========
			1. 신규 회원 등록
			2. 회원 정보 검색
			3. 회원 정보 수정
			4. 회원 정보 삭제
			5. 회원 정보 출력
			9. 종료
			====================================
			메뉴 번호를 입력하세요 : 

			- 입력된 번호에 따라 MemberManager 클래스의 메소드가 실행되게 함
			- 검색, 수정, 삭제 메뉴는 각각 부메뉴에 대한 메소드를 실행하게 함
			  1번 선택시 >> MemberManager 클래스의 insertMember() 실행
			  2번 선택시 >> searchMemberMenu();
			  3번 선택시 >> updateMemberMenu();
			  4번 선택시 >> deleteMemberMenu();
			  5번 선택시 >> MemberManager 클래스의 printAllMember() 실행
			  9번 선택시 >> System.out.println("프로그램을 종료합니다."); return; //종료함
		}

		
		
		}
		
*/
		}
		public void searchMemberMenu(){
			//메뉴는 반복 출력되게 함
			/*<실행화면>
			========== 회원 정보 검색 ==========
			1. 아이디로 검색하기
			2. 이름으로 검색하기
			3. 이메일로 검색하기
			9. 메인메뉴로
			====================================
			메뉴 번호를 입력하세요 : 

			- 입력된 번호에 따라 MemberManager 클래스의 메소드가 실행되게 함
			  1번 선택시 >> MemberManager의 searchId() 실행
			  2번 선택시 >> MemberManager의 searchName()실행
			  3번 선택시 >> MemberManager의 searchEmail()실행
			  9번 선택시 >> System.out.println("메인메뉴로 이동합니다."); return; //메인메뉴로 돌아감*/
			  }
		public void updateMemberMenu(){
			//메뉴는 반복 출력되게 함
			/*<실행화면>
			========== 회원 정보 수정 ==========
			1. 비밀번호 수정하기
			2. 이름 수정하기
			3. 이메일 수정하기
			9. 메인메뉴로
			====================================
			메뉴 번호를 입력하세요 :

			- 입력된 번호에 따라 MemberManager 클래스의 메소드가 실행되게 함
			  1번 입력시 >> MemberManager의 updatePwd() 실행
			  2번 입력시 >> MemberManager의 updateName() 실행
			  3번 입력시 >> MemberManager의 updateEmail() 실행
			  9번 입력시 >> System.out.println("메인메뉴로 이동합니다."); return;  //메인메뉴로 돌아감
*/		
			}
		public void deleteMemberMenu(){
			//메뉴는 반복 출력되게 함
			/*<실행화면>
			=========== 회원 정보 삭제 ===========
			1. 회원 삭제
			2. 전체 회원 삭제
			9. 메인메뉴로
			======================================
			메뉴 번호를 입력하세요 : 

			- 입력된 번호에 따라 MemberManager 클래스의 메소드가 실행되게 함
			  1번 입력시 >> MemberManager의 deleteOne() 실행
			  2번 입력시 >> MemberManager의 deleteAll() 실행
			  9번 입력시 >> System.out.println("메인메뉴로 이동합니다."); return;  //메인메뉴로 돌아감
*/			
		}

}
