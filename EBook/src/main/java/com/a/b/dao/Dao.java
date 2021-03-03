package com.a.b.dao;

import java.util.ArrayList;

import com.a.b.dto.Board;
import com.a.b.dto.Ebook;
import com.a.b.dto.Member;
import com.a.b.dto.RentalList;
import com.a.b.dto.RentalingList;

public interface Dao {

	public void write(final String id, final String title, final String content);

	public void bookjoin(final String bookname, final String writer, final String publisher, final String price);

	public ArrayList<Board> list();

	public ArrayList<RentalingList> orders();

	public ArrayList<Ebook> booklist();

	public ArrayList<Member> formList();

	public ArrayList<RentalList> ordering();

	public Board contentView(String strBID);

	public Ebook bookContent(String strBookid);

	public void upHit(final String bid);

	public void upHit1(final String bookid);

	public void modify(final String bid, final String title, final String content);

	public void bookmodify(final String bookid, final String bookname, final String writer, final String publisher,
			final String price);

	public void formModify(final String id, final String password, final String name, final String birthday,
			final String address, final String phone);

	public void delete(final String strBID);

	public void bookdelete(final String strBOOKID);

	public void formdelete(final String strID);

	public Board reply_view(String strBID);

	public void reply(final String bid, final String id, final String title, final String content, final String date,
			final String hit, final String group, final String step, final String indent);

}
