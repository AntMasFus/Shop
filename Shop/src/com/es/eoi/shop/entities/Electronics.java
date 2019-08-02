package com.es.eoi.shop.entities;

public class Electronics extends Articles {

	private String batery;
	private String guarantee;
	private static final Double Electronic_vat = 1.21;

	public String getBatery() {
		return batery;
	}

	public void setBatery(String batery) {
		this.batery = batery;
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	@Override
	public Double CalcularPrecio() {
		System.out.println("Calculando el IVA correspondiente al articulo...");
		return this.getPrice() * Electronic_vat;
	}

}
