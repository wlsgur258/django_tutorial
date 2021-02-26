package com.a.b.dto;

import java.sql.Timestamp;

public class Board {

	private String id;
	private String name;
	private String title;
	private String content;
	private Timestamp date;
	private String hit;
	private String group;
	private String step;
	private String indent;
	
	public Board() {}

	public Board(String id, String name, String title, String content, Timestamp date, 
			String hit, String group, String step, String indent) {
	
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
		this.date = date;
		this.hit = hit;
		this.group = group;
		this.step = step;
		this.indent = indent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getHit() {
		return hit;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public String getIndent() {
		return indent;
	}

	public void setIndent(String indent) {
		this.indent = indent;
	}

	
	
}