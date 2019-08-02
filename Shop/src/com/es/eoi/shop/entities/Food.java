package com.es.eoi.shop.entities;

public class Food extends Articles {

	private Integer ExpirationDate;
	private String allergens;
	private static final Double Food_vat = 1.04;

	public String getAllergens() {
		return allergens;
	}

	public void setAllergens(String allergens) {
		this.allergens = allergens;
	}

	public Integer getExpirationDate() {
		return ExpirationDate;
	}
	
	public void setExpirationDate(Integer ExpirationDate) {
		this.ExpirationDate = ExpirationDate;
	}
	@Override
	public Double CalcularPrecio() {
		System.out.println("Calculando el IVA correspondiente al articulo...");
		return this.getPrice() * Food_vat;
	}

}
