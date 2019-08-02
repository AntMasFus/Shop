package com.es.eoi.shop.entities;

public class Articles {

	private String name;
	private String description;
	private double vat;
	private double price = 0.0;
	private String provider;
	private Integer stock;
	private final static Double Default_vat = 1.21;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Double CalcularPrecio() {
		System.out.println("Aplicando el iva correspondiente...");
		return this.getPrice() * Default_vat;
	}

}
