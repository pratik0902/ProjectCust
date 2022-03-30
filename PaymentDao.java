package com.click.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.click.entity.Payment;



public interface PaymentDao extends JpaRepository<Payment, Integer>  {
	public List<Payment> findBypaymentId(int id);
}
