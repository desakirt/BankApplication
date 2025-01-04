
 */
package com.github.desakirt.bankapplication.models;

import java.time.LocalDateTime;

/**
 *
 * @author 
 */
public class Operation {

    private LocalDateTime createdAt;
    private String accountNumber;
    private double amount;
    private Type type;

    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }
          
    public static enum Type {
        WITHDRAW, DEPOSIT;
    }
}
