package com.a.b.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.ui.Model;

import com.a.b.dao.Dao;
import com.a.b.dto.Board;

public class ListService implements CommonService {
	
	private static final int MESSAGE_COUNT_PER_PAGE = 10;
	
	@Override
	public void execute(Model model) {
		
		Dao dao = new Dao();
		ArrayList<Board> board = dao.list();
		
		model.addAttribute("list", board);
		
	}
	
	public List<Board> selectList(int a,int z) throws SQLException{
		Dao dao = new Dao();
		ArrayList<Board> board =  dao.list();
		return board.subList(a-1,z);
	}
	public MessageListView getMessageListView(int pageNumber) throws SQLException{
		int currentPageNumber = pageNumber;
		Dao dao = new Dao();
		int messageTotalCount = dao.list().size();
		List<Board> messageList3 = null;
		int firstRow =0;
		int endRow =0;
		if(messageTotalCount>0){
			firstRow = (pageNumber-1)*MESSAGE_COUNT_PER_PAGE+1;
			endRow = firstRow+MESSAGE_COUNT_PER_PAGE-1;
			if(endRow>messageTotalCount)endRow=messageTotalCount;
			messageList3 =selectList(firstRow,endRow);
		}else{
			currentPageNumber =0;
			messageList3 = Collections.emptyList();
		}
		return new MessageListView(null , null, null, messageList3, null, messageTotalCount,currentPageNumber,MESSAGE_COUNT_PER_PAGE,firstRow,endRow);
	}

}
