package com.a.b.service;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import com.a.b.dao.Dao;

public class DeleteService implements CommonService {
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bid = request.getParameter("bid");
		Dao dao = new Dao();
		dao.delete(bid);
	}
}
