package com.online.web.spring.hibernate.entity;

import java.util.List;

/*
 * Column Name 		Column Type 								Description
 * 
 * 	id 				smallint unsigned not null auto increment 	Unique id for items in this table (primary key)
 *	name 			tinytext not null 							Location name
 *	note 			tinytext 									Free text for location
 *	parent 			smallint unsigned 							Location's parent. Used to generate tree-like hirarchy between locations. Also index and foreign key to id column in this table
 *	(need to check parent)										with ON DELETE CASCADE.
 */

public class Invlocation {
	int id;
	String name;
	String note;
	List<Invproduct> invproduct;

	public Invlocation() {
	}

	public Invlocation(int id, String name, String note, List<Invproduct> invproduct) {
		this.id = id;
		this.name = name;
		this.note = note;
		this.invproduct = invproduct;
	}
	public Invlocation(String name, String note, List<Invproduct> invproduct) {
		this.name = name;
		this.note = note;
		this.invproduct = invproduct;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<Invproduct> getInvproduct() {
		return invproduct;
	}

	public void setInvproduct(List<Invproduct> invproduct) {
		this.invproduct = invproduct;
	}
}
