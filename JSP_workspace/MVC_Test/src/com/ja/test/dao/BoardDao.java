package com.ja.test.dao;

import java.util.ArrayList;

import com.ja.test.vo.BoardVO;
import java.sql.*;

public class BoardDao {

	public ArrayList<BoardVO> getBoardList() {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();

		try {
			String sql = "SELECT * FROM FB_Board ORDER BY b_no DESC";

			// DB 연동....(SELECT)
			System.out.println("실행될 쿼리 : " + sql);

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbUser = "SCOTT";
			String dbPW = "TIGER";

			Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPW);
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			// 로직 처리 시작....
			while (rs.next()) {
				BoardVO vo = new BoardVO(
						rs.getString("BOARD_NO"),
						rs.getString("MEMBER_NO"),
						rs.getString("BOARD_TITLE"),
						rs.getString("BOARD_CONTENT"),
						rs.getString("BOARD_WRITEDATE")
						);
				
				list.add(vo);
			}

			// 로직 처리 끝....

			rs.close();
			stm.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
