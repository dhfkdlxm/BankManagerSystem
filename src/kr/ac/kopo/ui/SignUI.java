package kr.ac.kopo.ui;

public class SignUI extends BaseUI {

	@Override
	public void excute() throws Exception {

		while(true) {
			try {
				IBankUI ui = null;
				int type = menu();
				switch(type) {
				case 1:
					ui = new SignInUI();
				break;
				case 2:
					ui = new SignUpUI();
					break;
				case 3:
					ui = new AdminSignInUI();
					break;
				case 4:
					ui = new ExitUI();
					break;
				}
				if(ui !=null) {
					ui.excute();
				}else {
					System.out.println("잘못 선택하셨습니다. 다시 입력하세요!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	
	}

	private int menu() {
		System.out.println("=========================================================");
		System.out.println("\t통\t합\t계\t좌\t관\t리\t시\t스\t템");
		System.out.println("=========================================================");
		System.out.println("\t1. 로그인 하기");
		System.out.println("\t2. 회원 가입하기");
		System.out.println("\t3. 관리자로 로그인 하기");
		System.out.println("\t0. 종료");
		System.out.println("=========================================================");
		int type = scanInt("원하 시는 항목을 선택하세요 : ");
		return type;
	}

}
