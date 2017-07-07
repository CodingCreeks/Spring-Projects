package com.online.hibernate.entity;

import java.util.List;

public class Event {
	int eid;
	String etitle;
	String elocation;
	List<Singers> singers;

	public Event() {
	}

	public Event(int eid, String etitle, String elocation, List<Singers> singers) {
		this.eid = eid;
		this.etitle = etitle;
		this.elocation = elocation;
		this.singers = singers;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEtitle() {
		return etitle;
	}

	public void setEtitle(String etitle) {
		this.etitle = etitle;
	}

	public String getElocation() {
		return elocation;
	}

	public void setElocation(String elocation) {
		this.elocation = elocation;
	}

	public List<Singers> getSingers() {
		return singers;
	}

	public void setSingers(List<Singers> singers) {
		this.singers = singers;
	}
}
