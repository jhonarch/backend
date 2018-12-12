package com.arch.notas.util;

import java.util.List;
import java.util.Objects;

public class QueryResult {
	
	private int totalRecords;
	private List<Objects> list;
	
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<Objects> getList() {
		return list;
	}
	public void setList(List<Objects> list) {
		this.list = list;
	}
	
	

}
