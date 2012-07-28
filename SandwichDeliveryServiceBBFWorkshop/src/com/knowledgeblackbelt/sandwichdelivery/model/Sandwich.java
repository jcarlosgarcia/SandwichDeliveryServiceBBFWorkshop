package com.knowledgeblackbelt.sandwichdelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	
	private String name;
	private double price;
	
	private Worker owner;
	private List<Supplement> supplements = new ArrayList<Supplement>();
	
	public Sandwich(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Worker getOwner() {
		return owner;
	}
	
	public void setOwner(Worker owner) {
		this.owner = owner;
	}
	
	public List<Supplement> getSupplements() {
		return supplements;
	}
	
	public String toString() {
		return name + " (" + price + ")";
	}

}