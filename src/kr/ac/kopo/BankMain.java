package kr.ac.kopo;

import kr.ac.kopo.ui.SignUI;

public class BankMain {

	public static void main(String[] args) {

		SignUI su = new SignUI();
		try {
			su.excute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
