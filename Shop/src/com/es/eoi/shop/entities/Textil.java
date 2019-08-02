package com.es.eoi.shop.entities;

public class Textil extends Articles {

	private String material;
	private String colour;
	private String size;
	private static final double Textil_vat = 1.21;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public Double CalcularPrecio() {

		System.out.println("Calculando el IVA correspondiente al articulo...");
		return this.getPrice() * Textil_vat;
	}

}
