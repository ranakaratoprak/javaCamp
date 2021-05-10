package example3;

import java.util.Date;


import example3.abstracts.BaseCustomerManager;
import example3.adapters.MernisServiceAdapter;
import example3.concretes.StarbucksCustomerManager;
import example3.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Rana", "Karatoprak", new Date(1997, 10, 10), "11111111111"));
		
	}

}
