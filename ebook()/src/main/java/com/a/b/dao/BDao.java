package com.a.b.dao;

import java.util.ArrayList;

import com.a.b.dto.Ebook;


public interface BDao {

	public ArrayList<Ebook> list();
	public void modify(final long bBookno, final String bBookname,  final String bContent);
	
	public void delete(final long bBookno);
	
	public void upHit(final long bBookno);
	
	
	
	
	
}

