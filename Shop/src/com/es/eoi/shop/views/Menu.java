package com.es.eoi.shop.views;

import java.util.Scanner;

import com.es.eoi.shop.entities.Articles;
import com.es.eoi.shop.utils.ArticleFactory;

public class Menu {

	public static void GenerarMenu() {
		System.out.println("Menu de seleccion, seleccione una opcion:");
		System.out.println("1.Añadir un producto");
		System.out.println("2.Comprar articulos");
		System.out.println("3.Gestionar articulos");

		Scanner scan = new Scanner(System.in);

		int option = scan.nextInt();

		System.out.println("Has elegido la opcion:" + option);

		switch (option) {
		case 1:
			MenuAnadir();
			break;
		case 2:
			System.out.println("Aun no hace nada");
			break;
		default:
			break;
		}

	}

	public static void MenuAnadir() {
		System.out.println("Seleccione el tipo de articulo:");
		System.out.println("1.Textil");
		System.out.println("2.Tecnologico");
		System.out.println("3.Alimenticio");

		Scanner scan = new Scanner(System.in);

		int option = scan.nextInt();

		System.out.println("Has elegido la opción:" + option);

		switch (option) {
		case 1:
			ArticleFactory.getArticle("Textil");
			break;
		case 2:
			ArticleFactory.getArticle("Electronica");
			break;
		case 3:
			ArticleFactory.getArticle("Comida");
		default:
			break;
		}
	}
}
