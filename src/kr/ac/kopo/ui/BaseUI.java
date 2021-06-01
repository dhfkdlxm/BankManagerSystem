package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.BankService;
import kr.ac.kopo.vo.MemberVO;

public abstract class BaseUI implements IBankUI {

	public static MemberVO sessionMVO;
	private Scanner sc;
	private String inputStr;
	private int inputInt;
	protected BankService service;
	public BaseUI() {
		sc = new Scanner(System.in);
		service = new BankService();
	}
	public String scanStr(String msg) {
		System.out.println(msg);
		inputStr = sc.nextLine();
		return inputStr;
	}
	public int scanInt(String msg) {
		System.out.println(msg);
		inputInt = sc.nextInt();
		sc.nextLine();
		return inputInt;

	}
	

}
