package com.knowledgeblackbelt.sandwichdelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Worker {
	private String name;
	private double money;
	private List<Sandwich> sandwiches = new ArrayList<Sandwich>();
	
	public Worker(String name, double money) {
		this.name = name;
		this.money = money;
	}
	
	public double getMoney() {
		return money;
	}
	
	public void setMoney(double money) {
		this.money = money;
	}
	
	public List<Sandwich> getSandwiches() {
		return sandwiches;
	}
	
	public void purchase(Sandwich sandwich) {
		
		if (sandwich.getOwner() != null) {
			System.out.println("Cannot buy such sandwich. It has already an owner");
		}
		
		if (sandwich.getPrice() > this.getMoney()) {
			System.out.println("Cannot buy such sandwich. Worker hasn't got enough money: " + this);
		
		} else {
			this.setMoney(this.getMoney() - sandwich.getPrice());
			this.getSandwiches().add(sandwich);
			sandwich.setOwner(this);
		}
		
	}
	
	public String toString() {
		return name + " (" + money + ")";
	}
}
