package kr.ac.kopo.ui;

public class ExitUI implements IBankUI {

	@Override
	public void excute() throws Exception {
		System.out.println("==========================================");
		System.out.println("\t통합 계좌 관리 시스템을 종료 합니다. 이용해 주셔서 감사합니다.\n");
		System.out.println("==========================================");
		System.exit(0);

	}

}
