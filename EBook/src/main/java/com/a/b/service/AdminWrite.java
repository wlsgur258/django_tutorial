package com.a.b.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.a.b.dao.BDao;
import com.a.b.service.Constant;

public class AdminWrite implements IBoarderService {
	private SqlSession sqlSession=Constant.sqlSession;
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bBookname =request.getParameter("bBookname");
				
		String bContent =request.getParameter("bContent");
		
		long bPrice =Long.parseLong(request.getParameter("bPrice"));
		
		String bWriter =request.getParameter("bWriter");
		
		String bPublisher =request.getParameter("bPublisher");
		
		String bCategory =request.getParameter("bCategory");
		
		BDao dao = sqlSession.getMapper(BDao.class);
		dao.write(bBookname, bContent, bPrice, bWriter, bPublisher, bCategory);
		
	}

}
