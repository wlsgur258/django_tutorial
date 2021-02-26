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

import com.a.b.dto.Book;
import com.a.b.dto.Customer;
import com.a.b.dto.Orders;
import com.a.b.service.Constant;

public class Dao {

DataSource dataSource;
	
	JdbcTemplate template = null;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void write(final String name, final String title, final String content) {
		
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) 
					throws SQLException {
				String query = "insert into board (id, name, title, content, date, hit, group, step, indent) values (board_seq.nextval, ?, ?, ?, sysdate, 0, board_seq.currval, 0, 0)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, name);
				pstmt.setString(2, title);
				pstmt.setString(3, content);
				
				return pstmt;
			}
		});
	}
		
	public void bookjoin(final String bookid, final String bookname, final String writer, final String publisher, final String price) {
		
		
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) 
					throws SQLException {
			String query = "insert into book (bookid, bookname, writer, publisher, price) values (homebook_seq.nextval, ?, ?, ?, ?)";
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
	
	
	public ArrayList<Orders> orders() {	
		String query = "select * from orders";
		return (ArrayList<Orders>) template.query(query, new BeanPropertyRowMapper<Orders>(Orders.class));
	}
	
	public ArrayList<Book>booklist() {
		String query = "select * from book";
		return (ArrayList<Book>) template.query(query, new BeanPropertyRowMapper<Book>(Book.class));
	}
	
	public ArrayList<Customer> formList() {
		String query = "select * from mymember";
		return (ArrayList<Customer>) template.query(query, new BeanPropertyRowMapper<Customer>(Customer.class));
	}
	
	
	public Book bookContent(String strBookid) {
		
			String query = "select * from book where bookid = " + strBookid;
			return template.queryForObject(query, new BeanPropertyRowMapper<Book>(Book.class));			
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

			
	public void bookdelete(String bookid) {
	
			String query = "delete from book where bookid = ?";
			
			template.update(query, new PreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(1, bookid);
			
				}
			});	
		}
	}
