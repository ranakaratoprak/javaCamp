package example3.concretes;

import example3.abstracts.BaseCustomerManager;
import example3.abstracts.CustomerCheckService;
import example3.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer){
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
		System.out.println("Not a valid person");
		}
	}

}
