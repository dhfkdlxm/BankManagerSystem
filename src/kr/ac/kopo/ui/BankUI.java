package kr.ac.kopo.ui;

public class BankUI extends BaseUI {

	@Override
	public void excute() throws Exception {

		IBankUI ui = null;
		int type = menu();

		
		
		
	}

	private int menu() {
		System.out.println("=========================================================");
		System.out.println("\t통\t합\t계\t좌\t관\t리\t시\t스\t템");
		System.out.println("=========================================================");
		System.out.println(sessionMVO.getUserName()+"님 통합 계좌 관리 시스템에 오신것을 환영합니다.!!!!!!!!!");
		System.out.println("=========================================================");
		System.out.println("원하시는 메뉴를 선택하세요 !");
		System.out.println("\t1. 계좌 생성하기");
		System.out.println("\t2. 계좌 삭제하기");
		System.out.println("\t3. 잔액 조회하기");
		System.out.println("\t4. 내 계좌 전체 조회하기");
		System.out.println("\t5. 계좌 이체 하기");
		System.out.println("\t6. 출금 하기");
		System.out.println("\t7. 입금 하기");
		System.out.println("\t8. 거래내역 조회 하기");
		System.out.println("\t0. 종료");
		
		return 0;
	}
	

}
