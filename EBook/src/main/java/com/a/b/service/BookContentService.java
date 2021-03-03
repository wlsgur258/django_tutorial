package com.a.b.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.a.b.dao.Dao;
import com.a.b.dto.Ebook;

public class BookContentService implements CommonService {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bookid = request.getParameter("bookid");
	
		Dao dao = new Dao();
		Ebook books = dao.bookContent(bookid);
		
		model.addAttribute("book_content", books);
	}

}
