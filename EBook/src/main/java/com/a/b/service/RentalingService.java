package com.a.b.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.ui.Model;

import com.a.b.dao.Dao;
import com.a.b.dto.RentalList;

public class RentalingService implements CommonService {

private static final int MESSAGE_COUNT_PER_PAGE = 10;
	
	@Override
	public void execute(Model model) {
		
		Dao dao = new Dao();
		ArrayList<RentalList> ordering = dao.ordering();
		
		model.addAttribute("ordering", ordering);
	}

	public List<RentalList> selectList(int a,int z) throws SQLException{
		Dao dao = new Dao();
		ArrayList<RentalList> ordering =  dao.ordering();
		return ordering.subList(a-1,z);
	}
	public MessageListView getMessageListView(int pageNumber) throws SQLException{
		int currentPageNumber = pageNumber;
		Dao dao = new Dao();
		int messageTotalCount = dao.ordering().size();
		List<RentalList> messageList4 = null;
		int firstRow =0;
		int endRow =0;
		if(messageTotalCount>0){
			firstRow = (pageNumber-1)*MESSAGE_COUNT_PER_PAGE+1;
			endRow = firstRow+MESSAGE_COUNT_PER_PAGE-1;
			if(endRow>messageTotalCount)endRow=messageTotalCount;
			messageList4 =selectList(firstRow,endRow);
		}else{
			currentPageNumber =0;
			messageList4 = Collections.emptyList();
		}
		return new MessageListView(null, null, null, null,  messageList4, messageTotalCount,currentPageNumber,MESSAGE_COUNT_PER_PAGE,firstRow,endRow);
	}

}
