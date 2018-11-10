package com.bdi.aws.vo;

import org.apache.ibatis.type.Alias;

@Alias("Aws")
public class Aws {
	
	public int atnum;
	public String atname;
	public String atdesc;
	public int getAtnum() {
		return atnum;
	}
	public void setAtnum(int atnum) {
		this.atnum = atnum;
	}
	public String getAtname() {
		return atname;
	}
	public void setAtname(String atname) {
		this.atname = atname;
	}
	public String getAtdesc() {
		return atdesc;
	}
	public void setAtdesc(String atdesc) {
		this.atdesc = atdesc;
	}
	@Override
	public String toString() {
		return "Aws [atnum=" + atnum + ", atname=" + atname + ", atdesc=" + atdesc + "]";
	}
	

}
