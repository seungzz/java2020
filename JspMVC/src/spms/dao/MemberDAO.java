package spms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import spms.util.ConnectionPool;
import spms.vo.MemberVO;

public class MemberDAO {
	Connection connection;
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public List<MemberVO> selectList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberVO> members = new ArrayList<MemberVO>();

		try {
			connection = ConnectionPool.getConnection();
			String sql = "select * from members order by mno asc";
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				members.add(new MemberVO()
						.setNo(rs.getInt("mno"))
						.setEmail(rs.getString("email"))
						.setCreateDate(rs.getDate("cre_date"))
						.setName(rs.getString("mname")));
			}

			return members;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				ConnectionPool.close(connection);
			}
		}
		return members;
	}
	
	//회원 등록
	public int insert(MemberVO member) {
		PreparedStatement pstmt = null;
		try {
			connection = ConnectionPool.getConnection();
			String sql = " insert into members(mno, email, pwd, mname) ";
			sql += "values(seq_members_mno.nextval, ?, ?, ?) ";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.executeUpdate();
			return 200;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				ConnectionPool.close(connection);
			}
		}
		return 0;
	}
	
	//회원 삭제
	public int delete(int no) {
		PreparedStatement pstmt = null;
		try {
			connection = ConnectionPool.getConnection();
			String sql = "delete from members where mno = " + no;
			pstmt = connection.prepareStatement(sql);
			pstmt.executeUpdate();
			return 200;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				ConnectionPool.close(connection);
			}
		}
		return 0;
	}

	//회원상세정보
	public MemberVO selectOne(int no) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			connection = ConnectionPool.getConnection();
			String sql = "select * from members where mno = " + no;
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			MemberVO member = new MemberVO();
			member.setNo(rs.getInt("mno"));
			member.setName(rs.getString("mname"));
			member.setEmail(rs.getString("email"));
			member.setCreateDate(rs.getDate("cre_date"));
			
			return member;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				ConnectionPool.close(connection);
			}
		}
		return null;
	}

	//회원 업데이트
	public int update(MemberVO member) {
		PreparedStatement pstmt = null;
		try {
			connection = ConnectionPool.getConnection();
			String sql = " update members set email = ?, mname = ?, mod_date = sysdate where mno = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getName());
			pstmt.setInt(3, member.getNo());
			pstmt.executeUpdate();
			return 200;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				ConnectionPool.close(connection);
			}
		}
		return 0;
	}
	
	//로그인
	public MemberVO exist(String email, String password) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			connection = ConnectionPool.getConnection();
			String sql = " select * from members where email = ? and pwd = ? ";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				MemberVO member = new MemberVO()
						.setEmail(rs.getString("email"))
						.setName(rs.getString("mname"));
				return member;
			} else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (connection != null) {
				ConnectionPool.close(connection);
			}
		}
		return null;
	}
}
