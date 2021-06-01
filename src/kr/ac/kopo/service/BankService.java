package kr.ac.kopo.service;

import kr.ac.kopo.dao.AccountDAO;
import kr.ac.kopo.dao.MemberDAO;
import kr.ac.kopo.dao.TranscationDAO;
import kr.ac.kopo.vo.MemberVO;

public class BankService {

	private MemberDAO mdao;
	private AccountDAO adao;
	private TranscationDAO tdao;
	
	public BankService() {
		mdao = new MemberDAO();
		adao = new AccountDAO();
		tdao = new TranscationDAO();
		
	}
	public MemberVO SignInService(String key, String value) throws Exception {

		
		return mdao.LogInfo(key,value);
		
	}

}
