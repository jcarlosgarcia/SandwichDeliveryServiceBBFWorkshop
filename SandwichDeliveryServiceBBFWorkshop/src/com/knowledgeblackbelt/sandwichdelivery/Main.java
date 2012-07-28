package com.knowledgeblackbelt.sandwichdelivery;

import com.knowledgeblackbelt.sandwichdelivery.model.Sandwich;
import com.knowledgeblackbelt.sandwichdelivery.model.Supplement;
import com.knowledgeblackbelt.sandwichdelivery.model.Worker;

public class Main {

	public static void main(String... args) {
		Sandwich usa = new Sandwich("USA", 3);
		Sandwich cheese = new Sandwich("Cheese", 3.5);
		Sandwich ham = new Sandwich("Ham", 3);
	
		Supplement salad = new Supplement("Salad");
		Supplement tomato = new Supplement("Tomato");
		Supplement egg = new Supplement("Egg");
		Supplement corn = new Supplement("Corn");
		
		usa.getSupplements().add(salad);
		usa.getSupplements().add(tomato);
		
		cheese.getSupplements().add(tomato);
		cheese.getSupplements().add(corn);
		
		ham.getSupplements().add(egg);
		ham.getSupplements().add(corn);
		
		Worker marty = new Worker("Marty", 5);
		Worker biff = new Worker("Biff", 12);
		
		marty.purchase(usa);
		marty.purchase(cheese);
		
		biff.purchase(cheese);
		biff.purchase(ham);
		biff.purchase(usa);
		
		marty.listSandwiches();
		biff.listSandwiches();
		
	}
	
	
	
}
