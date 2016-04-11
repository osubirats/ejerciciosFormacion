package com.indra.formacio.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity

public class Sale {
	@Id
	@GeneratedValue
	
	@ManyToOne
	protected Product product;
	@ManyToOne
	protected Customer customer;
	@Column
	protected Date saleDate;
	
	public Sale(Product product, Customer customer, Date saleDate, int id) {
		super();
		this.product = product;
		this.customer = customer;
		this.saleDate = saleDate;
		this.id = id;
	}
	
	
protected int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	public Sale(){
		
	}
	
	

}
