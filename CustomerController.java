package com.click.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.click.entity.Address;
import com.click.entity.Customer;
import com.click.entity.Payment;
import com.click.service.CustomerService;
import com.click.service.CustomerServiceImpl;






@CrossOrigin
@RestController
public class CustomerController {

	@Autowired  
	CustomerService customerserv;
	
	@PostMapping("/register")
	public Customer insertCustomer(@RequestBody Customer customer) {
		return customerserv.insertCustomer(customer);
	}
	

	@PostMapping("/login")
	public List<Customer> getUserByEmailAndPassword(@RequestBody Customer customer){
		return customerserv.getUserByEmailAndPassword(customer.getEmail(),customer.getPassword());
	}
	@GetMapping("/allcustomers")
	public List<Customer> getAllUsers(Customer customer){	
		return customerserv.getAllCustomers();	
	}
	@DeleteMapping("delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		customerserv.deleteCustomer(id);
		return "Deleted";
	}
	@GetMapping("/get/{id}")
	public List<Customer> getRequestsById(@PathVariable int id) {	
		return customerserv.getRequestById(id);
	}
	
	@PutMapping("/update")
	public Customer updateRequests(@RequestBody Customer customer) {	
		return customerserv.updateCustomer(customer);
	}
	@PostMapping("/registerAddress")
	public Address insertAdress(@RequestBody Address address) {
		return customerserv.insertAddress(address);
	}
	
	@GetMapping("/getAddress/{id}")
	public List<Address> getAddressById(@PathVariable int id) {	
		return customerserv.getAddressById(id);
	}

	@PutMapping("/updatAddress")
	public Address updateAddress(@RequestBody Address address) {	
		return customerserv.updateAddress(address);
	}
	
	
	
	@DeleteMapping("deleteAddress/{id}")
	public String deleteAddress(@PathVariable int id) {
		customerserv.deleteAddress(id);
		return "Deleted";
	}
	
	
	@PostMapping("/payment")
	public Payment insertPayment(@RequestBody Payment payment) {
		return customerserv.insertPayment(payment);
	}
	
	@GetMapping("/payment/{id}")
	public List<Payment> getPaymentById(@PathVariable int id) {	
		return customerserv.getPaymentById(id);
	}
	
}
