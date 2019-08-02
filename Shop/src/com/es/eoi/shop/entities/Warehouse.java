package com.es.eoi.shop.entities;

public class Warehouse {

	private Articles[] articles;

	public Warehouse(int size) {
		this.articles = new Articles[size];
	}

	public Articles[] getArticles() {
		return articles;
	}

	public void setArticles(Articles[] articles) {
		this.articles = articles;
	}
}
