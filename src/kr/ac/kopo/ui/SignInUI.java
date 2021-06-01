package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class SignInUI extends BaseUI {

	@Override
	public void excute() throws Exception {
		String id = scanStr("아이디를 입력하세요 : ");
		String pw = scanStr("비밀번호를 입력하세요 : ");
		MemberVO checkMember = new MemberVO();
		checkMember = service.SignInService("id",id);
		System.out.println(checkMember.getUserId());
		if( checkMember.getUserId() != null && checkMember.getUserPw().equals(pw)) {
			sessionMVO = checkMember;
			System.out.println(checkMember.getUserName()+"님 환영합니다!");
			BankUI bu = new BankUI();
			bu.excute();
		}else{
			System.out.println("아이디와 비밀번호를 확인해주세요~!");
		};
	
		
		
	}

}
