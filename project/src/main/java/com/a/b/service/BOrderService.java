package com.a.b.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.ui.Model;

import com.a.b.dao.Dao;
import com.a.b.dto.Orders;

public class BOrderService implements CommonService {

	private static final int MESSAGE_COUNT_PER_PAGE = 10;
	
	@Override
	public void execute(Model model) {
		
		Dao dao = new Dao();
		ArrayList<Orders> orders = dao.orders();
		
		model.addAttribute("orders", orders);
	}

	public List<Orders> selectList(int a,int z) throws SQLException{
		Dao dao = new Dao();
		ArrayList<Orders> orders =  dao.orders();
		return orders.subList(a-1,z);
	}
	public MessageListView getMessageListView(int pageNumber) throws SQLException{
		int currentPageNumber = pageNumber;
		Dao dao = new Dao();
		int messageTotalCount = dao.orders().size();
		List<Orders> messageList = null;
		int firstRow =0;
		int endRow =0;
		if(messageTotalCount>0){
			firstRow = (pageNumber-1)*MESSAGE_COUNT_PER_PAGE+1;
			endRow = firstRow+MESSAGE_COUNT_PER_PAGE-1;
			if(endRow>messageTotalCount)endRow=messageTotalCount;
			messageList =selectList(firstRow,endRow);
		}else{
			currentPageNumber =0;
			messageList = Collections.emptyList();
		}
		return new MessageListView(messageList, null, null, messageTotalCount,currentPageNumber,MESSAGE_COUNT_PER_PAGE,firstRow,endRow);
	}

}
