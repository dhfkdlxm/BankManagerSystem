package kr.ac.kopo.vo;

public class AccountVO {

	private int bankCode;
	private String accountId;
	private String userId;
	private int accPw;
	private int accBalance;
	private String accByName;

	public AccountVO() {

	}
	
	

	/**
	 * @param bankCode
	 * @param accountId
	 * @param userId
	 * @param accPw
	 * @param accBalance
	 * @param accByName
	 */
	public AccountVO(int bankCode, String accountId, String userId, int accPw, int accBalance, String accByName) {
		super();
		this.bankCode = bankCode;
		this.accountId = accountId;
		this.userId = userId;
		this.accPw = accPw;
		this.accBalance = accBalance;
		this.accByName = accByName;
	}



	public int getBankCode() {
		return bankCode;
	}

	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAccPw() {
		return accPw;
	}

	public void setAccPw(int accPw) {
		this.accPw = accPw;
	}

	public int getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}

	public String getAccByName() {
		return accByName;
	}

	public void setAccByName(String accByName) {
		this.accByName = accByName;
	}



	@Override
	public String toString() {
		return "AccountVO [bankCode=" + bankCode + ", accountId=" + accountId + ", userId=" + userId + ", accPw="
				+ accPw + ", accBalance=" + accBalance + ", accByName=" + accByName + "]";
	}

}
