package com.online.hibernate.entity;

public class Products {
	int pId;
	String pname;
	String pmfg;
	String pyomf;
	
	public Products() {
	}

	public Products(int pId, String pname, String pmfg, String pyomf) {
		this.pId = pId;
		this.pname = pname;
		this.pmfg = pmfg;
		this.pyomf = pyomf;
	}
	public Products(String pname, String pmfg, String pyomf) {
		this.pname = pname;
		this.pmfg = pmfg;
		this.pyomf = pyomf;
	}



	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPmfg() {
		return pmfg;
	}

	public void setPmfg(String pmfg) {
		this.pmfg = pmfg;
	}

	public String getPyomf() {
		return pyomf;
	}

	public void setPyomf(String pyomf) {
		this.pyomf = pyomf;
	}
}
