package com.knowledgeblackbelt.sandwichdelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Worker {
	private String name;
	private long money;
	private List<Sandwich> sandwiches = new ArrayList<Sandwich>();
	
	public Worker(String name, long money) {
		this.name = name;
		this.money = money;
	}
	
	public long getMoney() {
		return money;
	}
	
	public void setMoney(long money) {
		this.money = money;
	}
	
	public List<Sandwich> getSandwiches() {
		return sandwiches;
	}
	
	public String toString() {
		return name + " (" + money + ")";
	}
}
