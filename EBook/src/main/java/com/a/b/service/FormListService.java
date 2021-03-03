package com.a.b.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.ui.Model;

import com.a.b.dao.Dao;

import com.a.b.dto.Member;

public class FormListService implements CommonService {

	private static final int MESSAGE_COUNT_PER_PAGE = 10;
	
	@Override
	public void execute(Model model) {
		Dao dao = new Dao();
		ArrayList<Member> members = dao.formList();
		
		model.addAttribute("formList", members);
	}

	public List<Member> selectList(int a, int z) throws SQLException{
		Dao dao = new Dao();
		ArrayList<Member> members = dao.formList();
		return members.subList(a-1, z);
	}
	public MessageListView getMessageListView(int pageNumber) throws SQLException{
		int currentPageNumber = pageNumber;
		Dao dao = new Dao();
		int messageTotalCount = dao.formList().size();
		List<Member> messageList2 = null;
		int firstRow =0;
		int endRow =0;
		if(messageTotalCount>0){
			firstRow = (pageNumber-1)*MESSAGE_COUNT_PER_PAGE+1;
			endRow = firstRow+MESSAGE_COUNT_PER_PAGE-1;
			if(endRow>messageTotalCount)endRow=messageTotalCount;
			messageList2 =selectList(firstRow,endRow);
		}else{
			currentPageNumber =0;
			messageList2 = Collections.emptyList();
		}
		return new MessageListView(null, null, messageList2, null, null, messageTotalCount,currentPageNumber,MESSAGE_COUNT_PER_PAGE,firstRow,endRow);
	}

}
