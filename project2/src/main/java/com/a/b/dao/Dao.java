package com.a.b.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.a.b.dto.Board;
import com.a.b.dto.Ebook;
import com.a.b.dto.Member;
import com.a.b.dto.RentalList;
import com.a.b.dto.RentalingList;
import com.a.b.service.Constant;

public class Dao {

DataSource dataSource;
	
	JdbcTemplate template = null;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void write(final String id, final String title, final String content) {
		
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) 
					throws SQLException {
				String query = "insert into board (bid, id, title, content, date, hit, group, step, indent) values (board_seq.nextval, ?, ?, ?, sysdate, 0, board_seq.currval, 0, 0)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, title);
				pstmt.setString(3, content);
				
				return pstmt;
			}
		});
	}
		
	public void bookjoin(final String bookname, final String writer, final String publisher, final String price) {
		
		
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) 
					throws SQLException {
			String query = "insert into book (bookid, bookname, writer, publisher, price, hit) values (homebook_seq.nextval, ?, ?, ?, ?, 0)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, bookname);
			pstmt.setString(2, writer);
			pstmt.setString(3, publisher);
			pstmt.setString(4, price);
					
					return pstmt;
				}
			});
		}	
	
	public Dao() {
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		template = Constant.template;
		
	}
	
	public ArrayList<Board> list() {	
		String query = "select bid, id, title, content, date, hit, group, step, indent from board order by group desc, step asc";
		return (ArrayList<Board>) template.query(query, new BeanPropertyRowMapper<Board>(Board.class));
	}
	
	public ArrayList<RentalingList> orders() {	
		String query = "select * from orders";
		return (ArrayList<RentalingList>) template.query(query, new BeanPropertyRowMapper<RentalingList>(RentalingList.class));
	}
	
	public ArrayList<Ebook> booklist() {
		String query = "select * from book";
		return (ArrayList<Ebook>) template.query(query, new BeanPropertyRowMapper<Ebook>(Ebook.class));
	}
	
	public ArrayList<Member> formList() {
		String query = "select * from customer";
		return (ArrayList<Member>) template.query(query, new BeanPropertyRowMapper<Member>(Member.class));
	}
	
	public ArrayList<RentalList> ordering() {
		String query = "select * from ordering";
		return (ArrayList<RentalList>) template.query(query, new BeanPropertyRowMapper<RentalList>(RentalList.class));
	}
	
	public Board contentView(String strBID) {
		
		upHit(strBID);
		String query = "select * from board where bid = " + strBID;
		return template.queryForObject(query, new BeanPropertyRowMapper<Board>(Board.class));	
	}
	
	public Ebook bookContent(String strBookid) {
			
			upHit1(strBookid);
			String query = "select * from book where bookid = " + strBookid;
			return template.queryForObject(query, new BeanPropertyRowMapper<Ebook>(Ebook.class));			
	}
	
	public void upHit(final String bid) {
		String query = "update board set hit = hit + 1 where bid = ?";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bid);
			}
		});
	}
	
	public void upHit1(final String bookid) {
		String query = "update book set hit = hit + where bookid = ?";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bookid);
			}
		});
	} 
	
	public void modify(final String bid, final String title, final String content) {
		
		String query = "update board set title = ?, content = ? where bid = ?";
		
		template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, title);
				ps.setString(2, content);
				ps.setString(3, bid);
				
			}
		});
}
	
	public void bookmodify(final String bookid, final String bookname, final String writer, final String publisher, final String price) {
		
			String query = "update book set bookname = ?, writer = ?, publisher = ?, price = ? where bookid = ?";
			
			template.update(query, new PreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(1, bookname);
					ps.setString(2, writer);
					ps.setString(3, publisher);
					ps.setString(4, price);
					ps.setString(5, bookid);
					
				}
			});
		}

	public void formModify(final String id, final String password, final String name, final String birthday, final String address, final String phone) {
		
		String query = "update book set password = ?, name = ?, birthday = ?, address = ?, phone = ? where id = ?";
		
		template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, password);
				ps.setString(2, name);
				ps.setString(3, birthday);
				ps.setString(4, address);
				ps.setString(5, phone);
				ps.setString(6, id);
				
			}
		});
	}
	
	public void delete(final String strBID) {
		
		String query = "delete from board where bid = ?";
		
		template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, strBID);
		
			}
		});
		
}		
	
	public void bookdelete(final String strBOOKID) {
	
			String query = "delete from book where bookid = ?";
			
			template.update(query, new PreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(1, strBOOKID);
			
				}
			});	
		}
	
	public void formdelete(final String strID) {
		
		String query = "delete from customer where id = ?";
		
		template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, strID);
		
			}
		});	
	}
	
	public Board reply_view(String strBID) {
		String query = "select * from mboard where bid = " + strBID;
		return template.queryForObject(query, new BeanPropertyRowMapper<Board>(Board.class));
}


	public void reply(final String bid, final String id, final String title, final String content, final String date, final String hit, final String group, final String step, final String indent) {

		String query = "insert into board bid, id, title, content, date, hit, group, step, indent) values (board_seq.nextval, ?, ?, ?, sysdate, 0, ?, ?, ?)";
	
		template.update(query, new PreparedStatementSetter() {
		
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
				ps.setString(2, title);
				ps.setString(3, content);
				ps.setInt(4, Integer.parseInt(group));
				ps.setInt(5, Integer.parseInt(step) + 1);
				ps.setInt(6, Integer.parseInt(indent) + 1);
			
			}
		});
	}
	
}
	
