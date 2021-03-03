package com.a.b.service;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import com.a.b.dao.Dao;
public class ReplyService implements CommonService {

	@Override
	public void execute(Model model) {
		
		Map<String , Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bid = request.getParameter("bid");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String content= request.getParameter("content");
		String date = request.getParameter("date");
		String hit = request.getParameter("hit");
		String group = request.getParameter("group");
		String step = request.getParameter("step");
		String indent = request.getParameter("indent");
		
		Dao dao = new Dao();
		dao.reply(bid, name, title, content, date, hit, group, step, indent);
		
	}

}
