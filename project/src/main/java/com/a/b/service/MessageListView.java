package com.a.b.service;

import java.util.List;

import com.a.b.dto.Book;
import com.a.b.dto.Orders;
import com.a.b.dto.Customer;


// 게시글의 리스트를 페이징 처리하기 위한 클래스 입니다.
public class MessageListView {
	private int messageTotalCount;
	private int currentPageNumber;
	private List<Orders> messageList;
	private List<Book> messageList1;
	private List<Customer> messageList2;
	private int pageTotalCount;
	private int messageCountPerPage;
	private int firstRow;
	private int endRow;

	public MessageListView(List<Orders> messageList, List<Book> messageList1, List<Customer> messageList2, int messageTotalCount, int currentPageNumber,
			int messageCountPerPage, int firstRow, int endRow) {

		this.messageList = messageList;
		this.messageList1 = messageList1;
		this.messageList2 = messageList2;
		this.messageTotalCount = messageTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.messageCountPerPage = messageCountPerPage;
		this.firstRow = firstRow;
		this.endRow = endRow;
		calculatePageTotalCount();
	}

	private void calculatePageTotalCount() {
		if(messageTotalCount == 0 ){
			pageTotalCount =0;
		}else{
			pageTotalCount = messageTotalCount / messageCountPerPage;
			if(messageTotalCount % messageCountPerPage>0){
				pageTotalCount++;
			}
		}
	}

	public int getMessageTotalCount() {
		return messageTotalCount;
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public List<Orders> getMessageList() {
		return messageList;
	}
	
	public List<Book> getMessageList1() {
		return messageList1;
	}

	public List<Customer> getMessageList2() {
		return messageList2;
	}
	
	public int getPageTotalCount() {
		return pageTotalCount;
	}

	public int getMessageCountPerPage() {
		return messageCountPerPage;
	}

	public int getFirstRow() {
		return firstRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public boolean isEmpty(){
		return messageTotalCount==0;
	}
}
