package com.a.b.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.ui.Model;

import com.a.b.dao.Dao;
import com.a.b.dto.Ebook;

public class BooklistService implements CommonService {

	private static final int MESSAGE_COUNT_PER_PAGE = 10;
	
	@Override
	public void execute(Model model) {
		Dao dao = new Dao();
		ArrayList<Ebook> books = dao.booklist();

		model.addAttribute("booklist", books);
		
	}

	public List<Ebook> selectList(int a, int z) throws SQLException{
		Dao dao = new Dao();
		ArrayList<Ebook> books = dao.booklist();
		return books.subList(a-1, z);
	}
	public MessageListView getMessageListView(int pageNumber) throws SQLException{
		int currentPageNumber = pageNumber;
		Dao dao = new Dao();
		int messageTotalCount = dao.booklist().size();
		List<Ebook> messageList1 = null;
		int firstRow =0;
		int endRow =0;
		if(messageTotalCount>0){
			firstRow = (pageNumber-1)*MESSAGE_COUNT_PER_PAGE+1;
			endRow = firstRow+MESSAGE_COUNT_PER_PAGE-1;
			if(endRow>messageTotalCount)endRow=messageTotalCount;
			messageList1 =selectList(firstRow,endRow);
		}else{
			currentPageNumber =0;
			messageList1 = Collections.emptyList();
		}
		return new MessageListView(null, messageList1, null, null, null, messageTotalCount,currentPageNumber,MESSAGE_COUNT_PER_PAGE,firstRow,endRow);
	}

}

