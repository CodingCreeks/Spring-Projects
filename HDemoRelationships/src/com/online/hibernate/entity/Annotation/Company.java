package com.online.hibernate.entity.Annotation;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CompanyId")
	String cId;
	
	@Column(name="CompanyName", nullable=false, length=45)
	String cname;
	
	@ManyToOne(targetEntity=Address.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="CompanyAddress")
	Address address;
	
	
	public Company() {
	}

	public Company(String cId, String cname, Address address) {
		this.cId = cId;
		this.cname = cname;
		this.address = address;
	}
	public Company(String cname, Address address) {
		this.cname = cname;
		this.address = address;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
