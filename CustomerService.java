package com.click.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.click.entity.Address;
import com.click.entity.Customer;
import com.click.entity.Payment;






@Component
public interface CustomerService {
public Customer insertCustomer(Customer customer);
public List<Customer> getUserByEmailAndPassword(String email,String password);
public List<Customer> getAllCustomers();
public void deleteCustomer(int id);
public List<Customer>  getRequestById(int reqid);

public Customer updateCustomer(Customer customer); 
public Address insertAddress(Address address);
public List<Address> getAddressById(int id);
public Address updateAddress(Address address); 
public void deleteAddress(int id);
public Payment insertPayment(Payment payment);
public List<Payment> getPaymentById(int id);
}
