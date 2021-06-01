package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;
import kr.ac.kopo.vo.MemberVO;

public class MemberDAO {

	private List<MemberVO> list;

	public MemberDAO() {
		list = new ArrayList<>();
	}

	public MemberVO LogInfo(String key, String value) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		MemberVO checkMember = new MemberVO();
		try {
			conn = new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select user_id, user_name, user_pw ,user_resistno, user_pw,acc_date, admin_id from user_info ");

			switch (key) {
			case "id":
				System.out.println("입력성공");
				sql.append(" where user_id = ? ");

				pstmt = conn.prepareStatement(sql.toString());
				pstmt.setString(1, value);
				break;
			case "resistNo":
				System.out.println("rest");
				sql.append(" where user_resistno = ?");
				break;
			}


			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("user_id"));
				checkMember.setUserId(rs.getString("user_id"));
				checkMember.setUserName(rs.getString("user_name"));
				checkMember.setUserPw(rs.getString("user_pw"));
				checkMember.setUserResistNo(rs.getInt("user_resistno"));
				checkMember.setAccDate(rs.getString("acc_date"));
				checkMember.setAdminId(rs.getString("admin_id"));
			}
		} catch (Exception e) {

		} finally {
			JDBCClose.close(conn, pstmt);
		}
		return checkMember;
	}

	public MemberVO SignIn(String id, String pw) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		MemberVO checkMember = new MemberVO();

		try {
			conn = new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select user_name, user_resistno, acc_date,admin_id from user_info ");
			sql.append(" where user_id = ? and user_pw = ? ");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, id);
			pstmt.setString(1, pw);
			if (pstmt.execute()) {
				ResultSet rs = pstmt.executeQuery();
				checkMember.setUserName(rs.getString("user_name"));
				checkMember.setUserResistNo(rs.getInt("user_resistno"));
				checkMember.setAccDate(rs.getString("acc_date"));
				checkMember.setAdminId(rs.getString("admin_id"));
				checkMember.setUserId(id);
				checkMember.setUserPw(pw);

			} else {
				checkMember = null;
			}

		} catch (Exception e) {

		} finally {
			JDBCClose.close(conn, pstmt);
		}

		return checkMember;

	}

}
