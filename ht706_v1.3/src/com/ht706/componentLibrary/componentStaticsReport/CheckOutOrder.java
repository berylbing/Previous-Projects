package com.ht706.componentLibrary.componentStaticsReport;

public class CheckOutOrder {

	private String uniqueId;
	private String name;
	private Integer num;
	
	public CheckOutOrder(){		
	}	
	public CheckOutOrder(String uniqueId, String name, Integer num) {
		super();
		this.uniqueId = uniqueId;
		this.name = name;
		this.num = num;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
}
