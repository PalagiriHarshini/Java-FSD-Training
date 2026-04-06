package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product {
	private List<String> product= new ArrayList<String>();
	public List<String> getProduct() {
		return product;
	}
	public void setProduct(List<String> product) {
		this.product=product;
	}
	public void addProduct(String productt) {
		product.add(productt);
	}
	public void sortProduct() {
		Collections.sort(product);
	}

}
