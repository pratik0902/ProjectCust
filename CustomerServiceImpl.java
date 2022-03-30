package com.click.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.click.entity.Address;
import com.click.entity.Customer;
import com.click.entity.Payment;
import com.click.repository.AddressDao;
import com.click.repository.CustomerDao;
import com.click.repository.FindQuerry;
import com.click.repository.PaymentDao;








@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	FindQuerry q;
	
	@Autowired
	private AddressDao addressdao;
	
	@Autowired
	private PaymentDao paymentdao;
	
	@Override
	public Customer insertCustomer(Customer customer) {
		return customerDao.save(customer);	
	}
	@Override
	public List<Customer> getUserByEmailAndPassword(String email,String password) {
		return customerDao.findByEmailAndPassword(email,password);
	}
	@Override
	public List<Customer> getAllCustomers() {
		
		return this.customerDao.findAll();
	}
	@Override
	public void deleteCustomer(int id) {
		Customer cust =  customerDao.getById(id);
		customerDao.delete(cust);
		
	}

	
	public List<Customer> getRequestById(int id) {
		return q.findcustById(id);
	}
	
	@Override
	public Customer updateCustomer(Customer customer) {
		
		
		return customerDao.save(customer);
	}
	
	
	@Override
	public Address insertAddress(Address address) {
		return addressdao.save(address);	
	}

	@Override
	public List<Address> getAddressById(int id) {
		
			return addressdao.findByaddressId(id);
		
	}
	
	
	@Override
	public Address updateAddress(Address address) {
		return addressdao.save(address);
	}
	@Override
	public void deleteAddress(int id) {
		Address address =  addressdao.getById(id);
		addressdao.delete(address);
		
	}
	@Override
	public Payment insertPayment(Payment payment) {
		return paymentdao.save(payment);
	}
	
	
	@Override
	public List<Payment> getPaymentById(int id) {
		return paymentdao.findBypaymentId(id);
	}
	
	
}
