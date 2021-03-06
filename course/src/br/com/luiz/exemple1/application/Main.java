package br.com.luiz.exemple1.application;

import java.util.ArrayList;
import java.util.List;

import br.com.luiz.exemple1.entitie.Product;
import br.com.luiz.exemple1.service.ProductService;

public class Main {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Freezer", 2300));
		list.add(new Product("Sof?", 850));
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getProduct().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
