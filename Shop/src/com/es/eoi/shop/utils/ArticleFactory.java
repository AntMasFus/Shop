package com.es.eoi.shop.utils;

import com.es.eoi.shop.entities.Articles;
import com.es.eoi.shop.entities.Electronics;
import com.es.eoi.shop.entities.Food;
import com.es.eoi.shop.entities.Textil;

public class ArticleFactory {

	public static Articles getArticle(String category) {
		Articles article = null;

		switch (category) {
		case "Electronica":
			article = new Electronics();
			break;
		case "Comida":
			article = new Food();
			break;
		case "Textil":
			article = new Textil();
			break;

		default:
			break;
		}

		return article;
	}
}
