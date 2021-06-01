package kr.ac.kopo.vo;

public class MemberVO {

	private String userName;
	private String userId;
	private String userPw;
	private String accDate;
	private int userResistNo;
	private String adminId;
	
	
	public MemberVO() {
		
	}

	/**
	 * @param userName
	 * @param userId
	 * @param userPw
	 * @param accDate
	 * @param userResistNo
	 * @param adminId
	 */
	public MemberVO(String userName, String userId, String userPw, String accDate, int userResistNo, String adminId) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userPw = userPw;
		this.accDate = accDate;
		this.userResistNo = userResistNo;
		this.adminId = adminId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPw() {
		return userPw;
	}


	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	public String getAccDate() {
		return accDate;
	}


	public void setAccDate(String accDate) {
		this.accDate = accDate;
	}


	public int getUserResistNo() {
		return userResistNo;
	}


	public void setUserResistNo(int userResistNo) {
		this.userResistNo = userResistNo;
	}


	public String getAdminId() {
		return adminId;
	}


	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}


	@Override
	public String toString() {
		return "MemberVO [userName=" + userName + ", userId=" + userId + ", userPw=" + userPw + ", accDate=" + accDate
				+ ", userResistNo=" + userResistNo + ", adminId=" + adminId + "]";
	}
	


	
	
	
}
