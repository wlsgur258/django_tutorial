package com.a.b.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.a.b.dao.Dao;
import com.a.b.dto.Book;

public class BBookContentService implements CommonService {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bookid = request.getParameter("bookid");
	
		Dao dao = new Dao();
		Book books = dao.bookContent(bookid);
		
		model.addAttribute("book_content", books);
	}

}
