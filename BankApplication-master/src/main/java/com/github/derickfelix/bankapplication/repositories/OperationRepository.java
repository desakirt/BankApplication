package com.github.desakirt.bankapplication.models;


package com.github.desakirt.bankapplication.models;
import java.util.List;
import java.util.Optional;

public interface OperationRepository {

//    List<Operation> findAll();
    
    List<Operation> findAllDeposits();



    List<Operation> findAllByAccountNumber(String accountNumber);

    List<Operation> findAllDepositsByAccountNumber(String accountNumber);



    void deposit(String accountNumber, double amount);



    Optional<Double> currentBalance(String accountNumber);
        
}
