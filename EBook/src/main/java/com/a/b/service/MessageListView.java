package com.a.b.service;

import java.util.List;

import com.a.b.dto.RentalingList;
import com.a.b.dto.Ebook;
import com.a.b.dto.Member;
import com.a.b.dto.RentalList;
import com.a.b.dto.Board;


// 게시글의 리스트를 페이징 처리하기 위한 클래스 입니다.
public class MessageListView {
	private int messageTotalCount;
	private int currentPageNumber;
	private List<RentalingList> messageList;
	private List<Ebook> messageList1;
	private List<Member> messageList2;
	private List<Board> messageList3;
	private List<RentalList> messageList4;
	private int pageTotalCount;
	private int messageCountPerPage;
	private int firstRow;
	private int endRow;

	public MessageListView(List<RentalingList> messageList, List<Ebook> messageList1, List<Member> messageList2, 
			List<Board> messageList3, List<RentalList> messageList4,
			int messageTotalCount, int currentPageNumber,
			int messageCountPerPage, int firstRow, int endRow) {

		this.messageList = messageList;
		this.messageList1 = messageList1;
		this.messageList2 = messageList2;
		this.messageList3 = messageList3;
		this.messageList4 = messageList4;
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

	public List<RentalingList> getMessageList() {
		return messageList;
	}
	
	public List<Ebook> getMessageList1() {
		return messageList1;
	}

	public List<Member> getMessageList2() {
		return messageList2;
	}
	
	public List<Board> getMessageList3() {
		return messageList3;
	}
	
	public List<RentalList> getMessageList4() {
		return messageList4;
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
