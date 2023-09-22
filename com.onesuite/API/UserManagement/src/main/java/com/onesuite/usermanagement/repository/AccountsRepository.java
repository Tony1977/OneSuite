package com.onesuite.usermanagement.repository;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.onesuite.usermanagment.model.Accounts;



@EnableJpaRepositories
public interface AccountsRepository extends CrudRepository<Accounts, Long> {

	Accounts findByCustomerId(int customerId);

}
