package example3.concretes;

import example3.abstracts.CustomerCheckService;
import example3.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		
	}

	
}
