package com.github.desakirt.bankapplication.models;

import com.github.desakirt.bankapplication.models;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends BaseRepository<Customer, Long> {
    
    List<Customer> search(String term);
    
    Optional<Customer> findByAccountNumber(String accountNumber);
    
    Optional<Customer> findByAccountNumberAndPassword(String accountNumber, String password);
    
}
