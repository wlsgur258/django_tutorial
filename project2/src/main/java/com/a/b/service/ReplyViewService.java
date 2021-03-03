package com.a.b.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.a.b.dao.Dao;
import com.a.b.dto.Board;

public class ReplyViewService implements CommonService {
	
	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bid = request.getParameter("bid");
		
		Dao dao = new Dao();
		Board board = dao.reply_view(bid);
		
		model.addAttribute("reply_view", board);
	}
}
