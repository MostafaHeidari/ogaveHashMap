package com.Mostafa;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ICustomer customerOne = new Customer("Mostafa", "1235", "Havnegade", "mostafa@yahoo.com");
 
        //Using HashMap
        Map<String, ICustomer> customers = new HashMap();
        customers.put("Home", customerOne);

        System.out.println(customerOne);
    }
}