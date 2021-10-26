package assignment_12_oct.builder_design_pattern;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		productList.forEach(System.out::println);
	}

}
