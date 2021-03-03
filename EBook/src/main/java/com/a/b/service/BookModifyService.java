package com.a.b.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.a.b.dao.Dao;

public class BookModifyService implements CommonService {

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String bookid = request.getParameter("bookid");
		String bookname = request.getParameter("bookname");
		String writer = request.getParameter("writer");
		String publisher = request.getParameter("publisher");
		String price = request.getParameter("price");
		
		Dao dao = new Dao();
		dao.bookmodify(bookid, bookname, writer, publisher, price);
		
	}

}
