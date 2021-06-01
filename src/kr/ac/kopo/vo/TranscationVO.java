package kr.ac.kopo.vo;

public class TranscationVO {

	private int transcationNo;
	private String accountId;
	private int bankCode;
	private String transcationInfo;
	private String inOutInfo;
	private int amount;
	private String transcationDate;
	
	public TranscationVO() {
	}
	
	
	
	/**
	 * @param transcationNo
	 * @param accountId
	 * @param bankCode
	 * @param transcationInfo
	 * @param inOutInfo
	 * @param amount
	 * @param transcationDate
	 */
	public TranscationVO(int transcationNo, String accountId, int bankCode, String transcationInfo, String inOutInfo,
			int amount, String transcationDate) {
		this.transcationNo = transcationNo;
		this.accountId = accountId;
		this.bankCode = bankCode;
		this.transcationInfo = transcationInfo;
		this.inOutInfo = inOutInfo;
		this.amount = amount;
		this.transcationDate = transcationDate;
	}



	public int getTranscationNo() {
		return transcationNo;
	}
	public void setTranscationNo(int transcationNo) {
		this.transcationNo = transcationNo;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public String getTranscationInfo() {
		return transcationInfo;
	}
	public void setTranscationInfo(String transcationInfo) {
		this.transcationInfo = transcationInfo;
	}
	public String getInOutInfo() {
		return inOutInfo;
	}
	public void setInOutInfo(String inOutInfo) {
		this.inOutInfo = inOutInfo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTranscationDate() {
		return transcationDate;
	}
	public void setTranscationDate(String transcationDate) {
		this.transcationDate = transcationDate;
	}
	@Override
	public String toString() {
		return "TranscationVO [transcationNo=" + transcationNo + ", accountId=" + accountId + ", bankCode=" + bankCode
				+ ", transcationInfo=" + transcationInfo + ", inOutInfo=" + inOutInfo + ", amount=" + amount
				+ ", transcationDate=" + transcationDate + "]";
	}
	
	
	
	
	
}
