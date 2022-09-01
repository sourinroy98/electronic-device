package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device")
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String catagry;
	private double price;
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Device(int id, String name, String catagry, double price) {
		super();
		this.id = id;
		this.name = name;
		this.catagry = catagry;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatagry() {
		return catagry;
	}
	public void setCatagry(String catagry) {
		this.catagry = catagry;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", catagry=" + catagry + ", price=" + price + "]";
	}
	
	

}
