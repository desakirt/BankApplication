
package com.github.desakirt.bankapplication.models;

import com.github.desakirt.bankapplication.models.Customer;
import com.github.desakirt.bankapplication.models.User;

public class AuthSecurity {
    
    private static User userAuthenticated;
    private static Customer customerAuthenticated;
    
    private AuthSecurity()
    {
    }
    
    public static void login(User user)
    {
        userAuthenticated = user;
    }
    
    public static void login(Customer customer)
    {
        customerAuthenticated = customer;
    }
    
    public static void logout()
    {
        userAuthenticated = null;
        customerAuthenticated = null;
    }
    
    public static User getUser()
    {
        return userAuthenticated;
    }
    
    public static Customer getCustomer()
    {
        return customerAuthenticated;
    }
    
    public static boolean isUserAuthenticated()
    {
        return userAuthenticated != null;
    }
    
    public static boolean isCustomerAuthenticated()
    {
        return customerAuthenticated != null;
    }
    
    public static boolean isUserAdmin()
    {
        return userAuthenticated != null && userAuthenticated.getRole().equals("Administrator");
    }
}
